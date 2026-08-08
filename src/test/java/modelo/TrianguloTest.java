package modelo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class TrianguloTest {
    @Test
    public void CalcularareaTest() {
        triangulo triangulo = new triangulo (5, 10);
        double areaEsperada = (5 * 10) / 2;
        assertEquals(areaEsperada, triangulo.calcularArea());
    }
    @Test
    public void CalcularPerimetroTest(){
        triangulo triangulo = new triangulo (5, 10);
        double perimetroEsperado = 5 + 10 + Math.sqrt(Math.pow(5, 2) + Math.pow(10, 2));
        assertEquals(perimetroEsperado, triangulo.calcularPerimetro());
    }
}
