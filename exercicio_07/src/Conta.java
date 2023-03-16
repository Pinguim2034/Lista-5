public class Conta {
    private double saldo;
    private double limite;
    public void deposita(double grana){
        this.saldo = grana;
    }
    public void setlimite(double grana){
        this.limite = grana;
    }
    public void saca(double grana) throws ContaExcecao{
        if (grana > saldo + limite) {
            throw new ContaExcecao("Saque não permitido. Limite excedido.", saldo);
        }
        else if (grana > saldo) {
            throw new ContaExcecao("Saldo insuficiente para realizar o saque.", saldo);
        }
        else {
            saldo -= grana;
        }
    }
}
