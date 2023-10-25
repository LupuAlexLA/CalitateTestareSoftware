package cinema.builder;

public class TestBuilder {
    public static void main(String[] args) {
        Sala sala1 = new SalaBuilder().setNumarSala(6)
                                      .setFilmDifuzat("Rambo")
                                      .build();

        Sala sala2 = new SalaBuilder().setNumarSala(6)
                                      .setFilmDifuzat("Rocky")
                                      .setLuminaAprinsa(false)
                                      .build();

        System.out.println(sala1.toString());
        System.out.println(sala2.toString());
    }
}
