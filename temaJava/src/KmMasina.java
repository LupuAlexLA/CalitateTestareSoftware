import java.io.Serializable;
import java.time.LocalDateTime;

public class KmMasina implements Serializable {
    private long id;
    private LocalDateTime data;
    private int kmInitiali;
    private int kmFinali;
    private int kmParcursi;

    public KmMasina(long id, LocalDateTime data, int kmInitiali, int kmFinali) {
        this.id=id;
        this.data = data;
        this.kmInitiali = kmInitiali;
        this.kmFinali = kmFinali;
        this.kmParcursi = kmFinali - kmInitiali;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public int getKmInitiali() {
        return kmInitiali;
    }
    public void setKmInitiali(int kmInitiali) {
        this.kmInitiali = kmInitiali;
    }
    public int getKmFinali() {
        return kmFinali;
    }
    public void setKmFinali(int kmFinali) {
        this.kmFinali = kmFinali;
    }
    public int getKmParcursi() {
        return kmParcursi;
    }
    public void setKmParcursi(int kmParcursi) {
        this.kmParcursi = kmParcursi;
    }

    @Override
    public String toString() {
        return "KmMasina{" +
                "id=" + id +
                ", data=" + data +
                ", kmInitiali=" + kmInitiali +
                ", kmFinali=" + kmFinali +
                ", kmParcursi=" + kmParcursi +
                '}';
    }
}
