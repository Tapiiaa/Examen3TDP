package Ejercicio1;
import java.util.List;
import java.util.ArrayList;
public class Kit extends Elemento{
    private List<Elemento> elementos;
    private static final double DESCUENTO = 0.10; // 10% de descuento

    public Kit(int codigo){
        super(codigo);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento){
        elementos.add(elemento);
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
