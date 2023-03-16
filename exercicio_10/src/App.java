import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Calculator calculadora = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Númerador da divisão:");
        double x = scan.nextDouble();
        System.out.println("Divisor:");
        double y = scan.nextDouble();
        try {
            calculadora.div(x, y);
        } catch (Exception e) {
            System.out.println("\nMensagem de erro gerada: " + e + "\n");
            e.printStackTrace();
        }
        System.out.println("Número para ser cálculado em log na base 10:");
        double z = scan.nextDouble();
        try {
            calculadora.log10(z);
        } catch (Exception e) {
            System.out.println("\nMensagem de erro gerada: " + e + "\n");
            e.printStackTrace();
        }
        scan.close();
    }
}
