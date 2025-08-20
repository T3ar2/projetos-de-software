public class Main {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setLado(4);
        q.calcularArea();

        Circulo c = new Circulo();
        c.setRaio(10);
        c.calcularArea();


        Quadrado quadrado =  new Quadrado();
        quadrado.setLado(60);
        quadrado.calcularArea();
        
    }
}