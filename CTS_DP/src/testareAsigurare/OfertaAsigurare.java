package testareAsigurare;

public class OfertaAsigurare {
    private String furnizorOfertaAsigurare;
    private float limitaMaximaAsigurata;
    private float costAsigurare;

    public OfertaAsigurare(String furnizorOfertaAsigurare, float limitaMaximaAsigurata, float costAsigurare) {
        this.furnizorOfertaAsigurare = furnizorOfertaAsigurare;
        this.limitaMaximaAsigurata = limitaMaximaAsigurata;
        this.costAsigurare = costAsigurare;
    }

    public String getFurnizorOfertaAsigurare() {
        return furnizorOfertaAsigurare;
    }

    public float getLimitaMaximaAsigurata() {
        return limitaMaximaAsigurata;
    }

    public float getCostAsigurare() {
        return costAsigurare;
    }

    @Override
    public String toString() {
        return "OfertaAsigurare{" +
                "furnizorOfertaAsigurare='" + furnizorOfertaAsigurare + '\'' +
                ", limitaMaximaAsigurata=" + limitaMaximaAsigurata +
                ", costAsigurare=" + costAsigurare +
                '}';
    }
}
