package Ejercicio1;

public class ElementoSimple implements Elemento{

    private double precio;
    private int codigo;

    //Constructor de la clase ElementoSimple

    public ElementoSimple(int codigo, double precio) {
        super(codigo);
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
