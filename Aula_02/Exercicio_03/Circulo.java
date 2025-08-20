public class Circulo {
    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void calcularArea(){
        double area = 3.14 * Math.pow(raio, 2);
        System.out.println(area);
    }
}
