public class App {
    public static void main(String[] args) throws Exception {
       Conta minhaconta = new Conta();
       minhaconta.deposita(100);
       minhaconta.setlimite(100);
       try{
        minhaconta.saca(1000);
       } catch (ContaExcecao e){
        System.out.println(e.getMessage());
        System.out.println("Saldo da conta: " + e.getSaldo());
       }
    }
    //Foi necessário criar um novo construtor para a classe ContaExcecao que recebe um parâmetro adicional, que é o saldo atual da conta.
}
