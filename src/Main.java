import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        Alimento alimento = new Alimento("alimento","Leche", 1.10, "P0001", 250, "Vita",
                "27/11/2023", "26/12/2023", null);
        Tecnologia tecnologia = new Tecnologia("tecnologia","Laptop", 600, "P0002", 100, "HP", "HP", 110);
        Electrodomestico electrodomestico = new Electrodomestico("electronomestico","Cocina", 250, "P0003",
                50, "Olimpia", "Olimpia", 220, 5);

        listaProductos.add(alimento);
        listaProductos.add(tecnologia);
        listaProductos.add(electrodomestico);

        Alimento alimento2 = (Alimento) listaProductos.get(0);

        for (Producto producto: listaProductos) {
            if(producto.tipo.equals("alimento")){
                Alimento alimento = (Alimento)producto;
                System.out.println("El alimento "+alimento.nombre+"");
            }
        }


    }
}