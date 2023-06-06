import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
    private DatagramSocket udpSocket;
    private CsvHandler csvHandler;

    public Server(int port) throws SocketException {
        udpSocket = new DatagramSocket(port);
        csvHandler = new CsvHandler();
    }

    public void start() {
        while (true) {
            try {
                byte[] buffer = new byte[1024];
                DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);

                udpSocket.receive(datagram);

                try {
                    ByteArrayInputStream byteIn = new ByteArrayInputStream(buffer);
                    ObjectInputStream objectIn = new ObjectInputStream(byteIn);
                    Map<String, Object> dataMap = (Map<String, Object>) objectIn.readObject();
                    String actionType = (String) dataMap.get("actionType");
                    KmMasina kmMasina = (KmMasina) dataMap.get("kmMasina");
                    System.out.println("Action received of type: "+ actionType);

                    if ("PUT".equals(actionType)) {
                        csvHandler.updateKmMasina(kmMasina);
                    } else if ("GET".equals(actionType)) {
                        List<KmMasina> kmMasini = csvHandler.getAllKmMasina();
                        byte[] responseData = kmMasini.toString().getBytes();
                        DatagramPacket responseDatagram = new DatagramPacket(responseData, responseData.length, datagram.getAddress(), datagram.getPort());
                        udpSocket.send(responseDatagram);
                    } else if ("INSERT".equals(actionType)) {
                        csvHandler.insertKmMasina(kmMasina);
                    }

                    byte[] responseData = "OK".getBytes();
                    DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, datagram.getAddress(), datagram.getPort());
                    udpSocket.send(responsePacket);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



    public static void main(String[] args) {
        try {
            Server server = new Server(12344);
            server.start();
            System.out.println("Listening on port 12344");
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
