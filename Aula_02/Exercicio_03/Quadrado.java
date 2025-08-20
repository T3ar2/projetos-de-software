public class Quadrado {
    private double lado;
    
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return lado;
    }

    public void calcularArea(){
        double area = lado * 4;
        System.out.println(area);
    }
}