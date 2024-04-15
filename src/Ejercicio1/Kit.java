package Ejercicio1;
import java.util.List;
import java.util.ArrayList;
public class Kit implements Elemento{
    private List<Elemento> elementos;
    private int codigo;
    private static final double DESCUENTO = 0.10; // 10% de descuento

    public Kit(int codigo){
        this.codigo = codigo;
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento){
        elementos.add(elemento);
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public double getPrecio(){
        double precioTotal = 0;
        for(Elemento elemento : elementos){
            precioTotal += elemento.getPrecio();
        }
        return precioTotal * (1 - DESCUENTO);
    }




}
