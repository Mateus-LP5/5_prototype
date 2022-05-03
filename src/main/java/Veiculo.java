public class Veiculo implements Cloneable {
    private double capacidadeCargaKg;
    private String marca;
    private String modelo;
    private Carga carga;

    public Veiculo(double capacidadeCargaKg, String marca, String modelo, Carga carga) {
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.marca = marca;
        this.modelo = modelo;
        this.carga = carga;
    }

    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public Veiculo setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public Veiculo setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getModelo() {
        return modelo;
    }

    public Veiculo setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public Carga getCarga() {
        return carga;
    }

    public Veiculo setCarga(Carga carga) {
        this.carga = carga;
        return this;
    }

    @Override
    public Veiculo clone() throws CloneNotSupportedException {
        Veiculo veiculoClone = (Veiculo) super.clone();
        veiculoClone.carga = (Carga) veiculoClone.carga.clone();
        return veiculoClone;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "capacidade total = " + capacidadeCargaKg +
                ", marca = '" + marca + '\'' +
                ", modelo = " + modelo +
                ", carga ='" + carga + '\'' +
                '}';
    }
}
