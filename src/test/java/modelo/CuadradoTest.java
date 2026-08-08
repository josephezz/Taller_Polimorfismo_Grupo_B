package modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CuadradoTest {
    @Test
    public void CalcularareaTest() {
        cuadrado cuadrado = new cuadrado (5, 0);
        double areaEsperada = 5 * 5;
        assertEquals(areaEsperada, cuadrado.calcularArea());
    }
    @Test
    public void CalcularPerimetroTest(){
        cuadrado cuadrado = new cuadrado(5, 0);
        double perimetroEsperado = 4 * 5;
        assertEquals(perimetroEsperado, cuadrado.calcularPerimetro());
    }
}
