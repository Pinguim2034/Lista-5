import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Produto MaçãKg = new Produto("Maçã", "1", 7.00);
        Produto PicanhaKg = new Produto("Picanha", "13", 70.54);
        Produto Miojo = new Produto("Miojo", "2", 2.50);
        Set<Produto> Lista = new HashSet<Produto>();
        Lista.add(Miojo);
        Lista.add(PicanhaKg);
        Lista.add(MaçãKg);
        Scanner Scan = new Scanner(System.in);

        System.out.println("Adicione um produto na lista do mercado.\nNome:");
        String x = Scan.nextLine();
        System.out.println("ID:");
        String y = Scan.nextLine();
        System.out.println("Preço(é com vírgula):");
        Double z = Scan.nextDouble();
        Produto add = new Produto(x, y, z);

            if(MaçãKg.equals(add)==true||PicanhaKg.equals(add)==true||Miojo.equals(add)==true){
                System.out.println("Produto não adicionado. Produto com mesmo ID já cadastrado.");
            }
            else{
                System.out.println("Produto adicionado com sucesso.");
                Lista.add(add);
            }

        System.out.println("\n========LISTA DO MERCADO========");
        for(Produto i: Lista){
            System.out.println(i.toString());
        }
        Scan.close();
    }
}
