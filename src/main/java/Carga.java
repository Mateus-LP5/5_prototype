public class Carga implements Cloneable{
    private String tipoCarga;
    private double pesoTotal;

    public Carga (String tipoCarga, double pesoTotal) {
        super();
        this.tipoCarga = tipoCarga;
        this.pesoTotal = pesoTotal;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public Carga setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
        return this;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public Carga setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString () {
        return "Carga {" +
                "tipo de carga = '" + tipoCarga + '\'' +
                "peso total = " + pesoTotal +
                '}';
    }
}
