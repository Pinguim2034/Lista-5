import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for(int i=0;i<50;i++){
            lista.add(random.nextInt(99));
        }
        System.out.println("Maior número encontrado:" + Collections.max(lista) + "\nMenor número encontrado:" + Collections.min(lista) + "\n");
        Collections.sort(lista);
        System.out.println("Lista em ordem crescente:" + lista);
    }
}
