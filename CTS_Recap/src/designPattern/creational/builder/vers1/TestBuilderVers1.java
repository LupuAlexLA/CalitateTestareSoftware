package designPattern.creational.builder.vers1;

public class TestBuilderVers1 {
    public static void main(String[] args) {
        Pagina pagina1 = new PaginaBuilder().setDenumire("Emisiuni")
                .setParametrii(0).setFiltru(true).setTabel(true)
                .build();

        Pagina pagina2 = new PaginaBuilder().setDenumire("Emitenti")
                .setParametrii(1).setFiltru(true).setTabel(false)
                .build();

        System.out.println(pagina1.toString());
        System.out.println(pagina2.toString());
    }
}
