public class Conta {
    private double saldo;
    private double limite;
    public void deposita(double grana){
        this.saldo = grana;
    }
    public void setlimite(double grana){
        this.limite = grana;
    }
    public void saca(double grana){
        if(grana>limite){
            ContaExcecao e = new ContaExcecao("Saldo insuficiente ou limite atingido.");
            throw e;
        }
        else
        this.saldo = grana;
    }
}
