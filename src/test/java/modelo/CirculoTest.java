package modelo;
 
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    
    @Test
    public void CalcularareaTest() {
        circulo circulo = new circulo(0, 0, 5);
        double areaEsperada = Math.PI * 5 * 5;
        assertEquals(areaEsperada, circulo.calcularArea());
    }

    @Test
    public void CalcularPerimetroTest() {
        circulo circulo = new circulo(0, 0, 5);
        double perimetroEsperado = 2 * Math.PI * 5;
        assertEquals(perimetroEsperado, circulo.calcularPerimetro())
    }

}