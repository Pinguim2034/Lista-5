import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean z = true;
        double r = 0;
        System.out.println("Eu sei dividir!");
        while(z == true){
            System.out.println("Informe o primeiro valor:");
            int x = teclado.nextInt();
            System.out.println("Informe o segundo valor:");
            int y = teclado.nextInt();
            try {
                r = (x/y);
                z= false;
            } catch  (ArithmeticException e){
                System.out.println("Divisão inválida. Tente novamente.");
            }
        }
        System.out.println("O resultado da divisão é " + r);
        teclado.close();
    }
}
