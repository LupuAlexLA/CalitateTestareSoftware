package cinema.prototype;
// interfata IPersoanaSimulare extinde Cloneable, astfel incat,
// sa se realizeze mai usor clonarea obiectelor
public interface IPersoanaSimulare extends Cloneable{
    public IPersoanaSimulare duplica();
}
