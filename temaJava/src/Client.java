import java.net.*;
import java.io.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Client {
    private DatagramSocket udpSocket;
    private InetAddress serverAddress;
    private int serverPort;

    public Client(String serverAddress, int serverPort) throws IOException {
        udpSocket = new DatagramSocket();
        this.serverAddress = InetAddress.getByName(serverAddress);
        this.serverPort = serverPort;
    }

    public void sendKmMasina(String actionType, KmMasina kmMasina) {
        try {
            Map<String, Object> dataMap = new HashMap<>();
            dataMap.put("actionType", actionType);
            dataMap.put("kmMasina", kmMasina);
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream objectOut = new ObjectOutputStream(byteOut);
            objectOut.writeObject(dataMap);
            byte[] buffer = byteOut.toByteArray();

            DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, serverAddress, serverPort);
            udpSocket.send(datagram);

            byte[] responseBuffer = new byte[1024];
            DatagramPacket responseDatagram = new DatagramPacket(responseBuffer, responseBuffer.length);
            udpSocket.receive(responseDatagram);
            String response = new String(responseDatagram.getData(), 0, responseDatagram.getLength());
            System.out.println("Response from server: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Client client = new Client("localhost", 12344);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter action type (GET, PUT or INSERT):");
            String actionType = scanner.nextLine();
            if ("PUT".equals(actionType) || "INSERT".equals(actionType)) {
                System.out.println("Enter KmMasina data in format:ID,kmInitiali,kmFinali  with NO spaces in between them");
                String[] data = scanner.nextLine().split(",");
                LocalDateTime dateTime = LocalDateTime.now();
                long id= Long.parseLong(data[0]);
                int kmInitiali = Integer.parseInt(data[1]);
                int kmFinali = Integer.parseInt(data[2]);
                KmMasina kmMasina = new KmMasina(id, dateTime, kmInitiali, kmFinali);
                client.sendKmMasina(actionType, kmMasina);
            } else if ("GET".equals(actionType)) {
                client.sendKmMasina(actionType, null);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}