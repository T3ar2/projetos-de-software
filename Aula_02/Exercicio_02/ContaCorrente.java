public class ContaCorrente extends ContaBancaria{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(){
        System.out.print("Bom dia tirando: ");
        double tirar = s.nextDouble();
        if (tirar < getSaldo()){
        setSaldo(getSaldo() - tirar);
        }
        else {
            System.out.println("Você não sacar essa quantia.");
        }
    }
}