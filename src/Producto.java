import java.util.Scanner;

public abstract class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad;

    String tipo;

    String marca;

    public Producto(String tipo, String nombre, double precio, String codigo, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
        this.tipo = tipo;
    }

    public Producto() {
    }

    public boolean verificarStock(){
        if(cantidad==0){
            System.out.println("No existe stock.");
            return false;
        }
        return true;
    }
/*
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto");
        this.codigo=sc.next();
        System.out.println("Ingrese el cantidad del producto");
        this.cantidad=sc.nextInt();
    }
*/
    public abstract void ingresarProducto();

    public abstract void imprimirProducto();
}
