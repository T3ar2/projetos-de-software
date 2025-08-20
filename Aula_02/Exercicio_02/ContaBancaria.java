import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double Saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    Scanner s = new Scanner(System.in);
    public void depositar(){

        System.out.print("Bom dia adicional: ");
         setSaldo(getSaldo() + s.nextDouble());
         s.nextLine();
    }
    public void sacar(){
        System.out.println("Bom dia tirando: ");
        setSaldo(getSaldo() - s.nextDouble());
    }

}