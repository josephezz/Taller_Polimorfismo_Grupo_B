package modelo;
public class triangulo extends figura{
    public triangulo(double x1, double y1){
        super(x1,y1);
    }
    @Override
    public double calcularArea(){
        return (getx1() * gety1()) / 2;
    }
    @Override
    public double calcularPerimetro(){
        return getx1() + gety1() + Math.sqrt(Math.pow(getx1(), 2) + Math.pow(gety1(), 2));
    }
}
