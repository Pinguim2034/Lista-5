public class App {
    public static void main(String[] args) {
        try{
            metodo1();
        }catch (Exception e){
            System.out.println("Exceção no main " + e + "\n");
            e.printStackTrace();
        }
    }

    public static void metodo1() throws Exception {
        try{
            int resultado = 10/0;
        }catch(ArithmeticException e){
            System.out.println("\nExceção no método metodo1 " + e + "\n");
            throw e; //aqui lança a exceção pro bloco main pegar e fazer try-catch de novo.
        }finally {
            System.out.println("**Bloco Finally**\n");
        }
    }
}