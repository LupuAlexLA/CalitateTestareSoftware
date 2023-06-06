package corporatie;

public class Actionar extends Firma{
    public String numeActionar;
    public int procent;

    public Actionar(String numeActionar, int procent) {
        this.numeActionar = numeActionar;
        this.procent = procent;
    }

    public Actionar(String numeFirma, String numeActionar, int procent) {
        super(numeFirma);
        this.numeActionar = numeActionar;
        this.procent = procent;
    }

    public String getNumeActionar() {
        return numeActionar;
    }

    public void setNumeActionar(String numeActionar) {
        this.numeActionar = numeActionar;
    }

    public int getProcent() {
        return procent;
    }

    public void setProcent(int procent) {
        this.procent = procent;
    }

    @Override
    public void lucreaza() {
        System.out.println("Actionarul investeste in firma si incaseaza procent din profit!");
    }

    @Override
    public String toString() {
        return "corporatie.Actionar{" +
                "numeActionar='" + numeActionar + '\'' +
                ", procent=" + procent +
                '}';
    }
}
