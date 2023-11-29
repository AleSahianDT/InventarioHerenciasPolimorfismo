public class Electrodomestico extends Producto{

    private String Fabricante;
    private double Voltaje;
    private int aniosGarantia;

    public Electrodomestico() {

    }

    public Electrodomestico(String tipo, String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, double voltaje, int aniosGarantia) {
        super(tipo, nombre, precio, codigo, cantidad, marca);
        Fabricante = fabricante;
        Voltaje = voltaje;
        this.aniosGarantia = aniosGarantia;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public double getVoltaje() {
        return Voltaje;
    }

    public void setVoltaje(double voltaje) {
        Voltaje = voltaje;
    }

    public int getAniosGarantia() {
        return aniosGarantia;
    }

    public void setAniosGarantia(int aniosGarantia) {
        this.aniosGarantia = aniosGarantia;
    }
}
