package modelo;
public class cuadrado extends figura {
    public cuadrado(double x1, double y1){
        super(x1,y1);
    }
    @Override
    public double calcularArea(){
        return getx1() * getx1();
    }
    @Override
    public double calcularPerimetro(){
        return 4 * getx1();
    }
}
