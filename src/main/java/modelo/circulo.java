package modelo;
public class circulo extends figura{
    private double radio;
    public circulo(double x1, double y1, double radio){
        super(x1, y1);
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI*radio * radio;
    }
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
}
