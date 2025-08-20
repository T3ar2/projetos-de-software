public class Retangulo  extends FiguraGeometrica{
    private double base; 
    private double altura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }


    public void calcularArea(){
        double area = base * altura;
        System.out.println(area);
    }
}
