import java.util.Scanner;

public class Tecnologia extends Producto{

    private String Fabricante;
    private double Voltaje;

    public Tecnologia(String tipo, String nombre, double precio, String codigo, int cantidad, String marca, String fabricante, double voltaje) {
        super(tipo, nombre, precio, codigo, cantidad, marca);
        Fabricante = fabricante;
        Voltaje = voltaje;
    }

    public Tecnologia() {

    }

    @Override
    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto");
        this.codigo=sc.next();
        System.out.println("Ingrese el cantidad del producto");
        this.cantidad=sc.nextInt();
        System.out.println("Ingrese marca del producto");
        this.marca=sc.next();
        System.out.println("Ingrese el fabricante: ");
        this.Fabricante= sc.next();
        System.out.println("Ingrese el voltaje: ");
        this.Voltaje=sc.nextDouble();
    }

    @Override
    public void imprimirProducto() {
        System.out.println("El producto tecnologico tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Precio: "+this.precio);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Cantidad: "+this.cantidad);
        System.out.println("Marca: "+this.marca);
        System.out.println("Fabricante: "+this.Fabricante);
        System.out.println("Voltaje: "+this.Voltaje);
    }

    public void comprarProductoTecnologico(){
        if(this.verificarStock()){
            System.out.println("Se puede proceder con la compra");
        }
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
