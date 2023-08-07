package asigurare.singleton;

public class TestSingleton {
    public static void main(String[] args) throws Exception{
        SingletonClauzeRCA clauzaRCA1 = SingletonClauzeRCA.getInstance();
        SingletonClauzeRCA clauzaRCA2 = SingletonClauzeRCA.getInstance();

        if(clauzaRCA1 == clauzaRCA2) {
            System.out.println("Referinte identice!");
        } else {
            System.out.println("Referinte diferite!");
        }

        clauzaRCA1.setLimitaMaximaAsigurareAutoturisme(5000);

        System.out.println(clauzaRCA1.getLimitaMaximaAsigurareAutoturisme());
        System.out.println(clauzaRCA2.getLimitaMaximaAsigurareAutoturisme());
    }
}
