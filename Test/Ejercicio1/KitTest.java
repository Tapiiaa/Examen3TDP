package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


    public class KitTest {
        private Kit kit;
        private ElementoSimple elemento1;
        private ElementoSimple elemento2;


        public void setUp() {
            kit = new Kit(101);
            elemento1 = new ElementoSimple(1, 50.0);
            elemento2 = new ElementoSimple(2, 75.0);
            kit.agregarElemento(elemento1);
            kit.agregarElemento(elemento2);
        }

        @Test
        public void testGetCodigo() {
            assertEquals(101, kit.getCodigo());
        }

        @Test
        public void testGetPrecio() {
            double precioEsperado = (50.0 + 75.0) * 0.90; // 10% descuento aplicado
            assertEquals(precioEsperado, kit.getPrecio(), 0.001);
        }

        public static void main(String[] args) {
             org.junit.runner.JUnitCore.main("Ejercicio1.KitTest");
        }
    }


