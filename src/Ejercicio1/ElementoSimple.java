package Ejercicio1;

public class ElementoSimple implements Elemento{

    private double precio;
    private int codigo;

    //Constructor de la clase ElementoSimple

    public ElementoSimple(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public int getCodigo(){
        return codigo;
    }

    public double getPrecio(){
        return precio;
    }


}
