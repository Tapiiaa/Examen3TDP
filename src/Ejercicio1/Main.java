package Ejercicio1;

public class Main {

    //Empresa de mobiliario modular

    public static void main(String[] args) {

        //Creación de los elementos simples

        // Ponemos precios genéricos para los elementos, se pueden modificar.
        ElementoSimple mesa = new ElementoSimple(1, 100);
        ElementoSimple silla = new ElementoSimple(2, 50);

        //Creación de los kits

        Kit kit1 = new Kit(3);

        //Agregamos los elementos simples al kit

        kit1.agregarElemento(mesa);
        kit1.agregarElemento(silla);

        //Imprimimos el precio del kit con descuento
        System.out.println("");
        System.out.println("Código de elementos:");
        System.out.println("Mesa: " + mesa.getCodigo() + " Silla: " + silla.getCodigo());
        System.out.println("");
        System.out.println("Precios de los elementos:");
        System.out.println("Mesa: " + mesa.getPrecio() + " Silla: " + silla.getPrecio());
        System.out.println("");
        System.out.println("El precio del kit con descuento es: " + kit1.getPrecio());
    }



}
