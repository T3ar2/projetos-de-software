public class Main {
    public static void main(String[] args) {
    ContaCorrente corrente = new ContaCorrente();

    corrente.setSaldo(100.00);

    System.out.print("Saldo: " + corrente.getSaldo() + "\n");
    corrente.depositar();
    System.out.print("Saldo: " + corrente.getSaldo()+ "\n");
    corrente.sacar();
    System.out.print("Saldo: " + corrente.getSaldo()+ "\n");


    ContaBancaria bancaria = new ContaBancaria();

    bancaria.setSaldo(50.00);
    System.out.print("Saldo: " + bancaria.getSaldo() + "\n");
    bancaria.depositar();
    System.out.print("Saldo: " + bancaria.getSaldo() + "\n");
    bancaria.sacar();
    System.out.print("Saldo: " + bancaria.getSaldo() + "\n");
    }



}