package Ejercicio1;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ElementoSimpleTest{
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("Ejercicio1.ElementoSimpleTest");
    }
    private ElementoSimple elemento;

    @Before
    public void setUp() {
        elemento = new ElementoSimple(1, 100.0);
    }

    @Test
    public void testGetCodigo() {
        assertEquals(1, elemento.getCodigo());
    }

    @Test
    public void testGetPrecio() {
        assertEquals(100.0, elemento.getPrecio(), 0.001);
    }
}



