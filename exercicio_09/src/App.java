public class App {
    public static void main(String[] args) throws Exception {
        try{
            metodo1();
        }catch (Exception e){
            System.out.println("Exceção na main.");
            e.printStackTrace();
          }
    }
    public static void metodo1(){
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("Exceção no método 1.");
            throw e;
        }
    }
    public static void metodo2(){
        try{
            int x = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Exceção inicial no método 2.");
            throw e;
        }
    }
}
