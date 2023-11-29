public class Tecnologia extends Producto{

    private String Fabricante;
    private double Voltaje;

    public Tecnologia() {

    }

    public Tecnologia(String tipo, String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, double voltaje) {
        super(tipo, nombre, precio, codigo, cantidad, marca);
        Fabricante = fabricante;
        Voltaje = voltaje;
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

}
