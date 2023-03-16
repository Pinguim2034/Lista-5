import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean x = false;
        System.out.println("Comece a inserir os nomes.\n");
        List<String> ListadeNomes = new ArrayList<>();
        int y = 1;
        do{
            System.out.println("Nome " + y + ":");
            ListadeNomes.add(scan.nextLine());
            y++;
            System.out.println("Deseja inserir mais um nome?(1 para SIM, 0 para NÃO)");
            int z = scan.nextInt();
            scan.nextLine();
            if(z==0){x=true;}
        }while(x==false);
        Set<String> Nomes = new HashSet<>();
        for(String Nome : ListadeNomes){
            Nomes.add(Nome);
        }
        System.out.println("Sua lista ficou assim:" + Nomes + "\n");
        
        System.out.println("O que deseja fazer agora:\n[1] Remover nome da lista;\n[2] Verificar se o nome está na lista;\n[3] Apagar todos os nomes armazenados;\n[4] Finalizar programa.");
        y = scan.nextInt();
        scan.nextLine();
        switch(y){
            case 1: System.out.println("Qual nome deseja remover?");
            String remover = scan.nextLine();
            if(Nomes.contains(remover)){Nomes.remove(remover);}
            else{System.out.println("Esse nome não está na lista. Certifique-se que o nome foi escrito corretamente, incluindo as letras maiúsculas.");}
            break;

            case 2: System.out.println("Insira o nome a ser verificado:");
            if(Nomes.contains(scan.nextLine())){
                System.out.println("O nome inserido está na lista.");
            }
            else{System.out.println("O nome inserido não está na lista.");}
            break;

            case 3: Nomes.removeAll(Nomes);
            break;

            case 4: break;
        }


        System.out.println("Sua lista final:" + Nomes);
    }
}
