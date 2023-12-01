import java.util.ArrayList;
import java.util.List;

//Alejandra Sahian Dávila

public class Main {
    public static void main(String[] args) {

        List<Producto> listaProductos = new ArrayList<>();

        Alimento alimento1 = new Alimento("alimento","Leche",1.1,"P0001",250,"Vita","27/11/2023","26/12/2023",null);
        Tecnologia tecnologia1 = new Tecnologia("tecnologia","Laptop",600,"P0002",100,"HP","HP",110);
        Electrodomestico electro1 = new Electrodomestico("electro","Cocina",250,"P0003",100,"Mabe","Mabe",110,2);

        listaProductos.add(alimento1);
        listaProductos.add(tecnologia1);
        listaProductos.add(electro1);

        //Ninguna clase abstracta se puede instanciar


        for (Producto producto: listaProductos) {
            if(producto.tipo.equals("alimento")){
                Alimento alimento = (Alimento)producto;
                System.out.println("El alimento "+alimento.nombre+" se expira el: "+alimento.getFechaExpiracion());
            }else if(producto.tipo.equals("tecnologia")){
                Tecnologia tecnologia = (Tecnologia)producto;
                System.out.println("El producto de tecnologia "+tecnologia.nombre+" lo fabrica "+tecnologia.getFabricante());
            }else if(producto.tipo.equals("electro")){
                Electrodomestico electro = (Electrodomestico) producto;
                System.out.println("El electrodomestico "+electro.nombre+" tiene "+electro.getAniosGarantia()+" años de garantia");
            }
        }

        System.out.println("--------------------------------------------------------");

        for (Producto producto: listaProductos) {
            if (producto instanceof Alimento){
                Alimento alimento = (Alimento)producto;
                System.out.println("El alimento "+alimento.nombre+" se expira el: "+alimento.getFechaExpiracion());
            } else if (producto instanceof Tecnologia) {
                Tecnologia tecnologia = (Tecnologia)producto;
                System.out.println("El producto de tecnologia "+tecnologia.nombre+" lo fabrica "+tecnologia.getFabricante());
            } else if (producto instanceof Electrodomestico) {
                Electrodomestico electro = (Electrodomestico) producto;
                System.out.println("El electrodomestico "+electro.nombre+" tiene "+electro.getAniosGarantia()+" años de garantia");
            }

        }

    }
}