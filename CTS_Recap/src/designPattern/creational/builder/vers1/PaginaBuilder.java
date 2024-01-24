package designPattern.creational.builder.vers1;

public class PaginaBuilder implements IBuilder{
    private Pagina pagina;

    public PaginaBuilder() {
        this.pagina = new Pagina();
    }

    public PaginaBuilder setDenumire(String denumirePagina) {
        pagina.setNume(denumirePagina);
        return this;
    }

    public PaginaBuilder setParametrii(int parametrii) {
        pagina.setParametrii(parametrii);
        return this;
    }

    public PaginaBuilder setFiltru(boolean areFiltru) {
        pagina.setAreFiltru(areFiltru);
        return this;
    }

    public PaginaBuilder setTabel(boolean areTabel) {
        pagina.setAreTabel(areTabel);
        return this;
    }

    @Override
    public Pagina build() {
        return pagina;
    }
}
