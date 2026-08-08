
package modelo;

public class main {

    public static void Main (String[] args) {

        figura[] figuras = {
        new circulo(0, 0, 5),
        new cuadrado(5, 0),
        new triangulo(5, 10)
        };

        for (figura figura : figuras) {

        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());

        System.out.println("----------------");
        }

    }
}