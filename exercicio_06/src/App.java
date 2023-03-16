public class App {
    public static void main(String[] args) throws Exception {
       Conta minhaconta = new Conta();
       minhaconta.deposita(100);
       minhaconta.setlimite(100);
       try{
        minhaconta.saca(1000);
       } catch (ContaExcecao e){
        System.out.println("Saldo insuficiente ou limite atingido.");
       }
    }
}
