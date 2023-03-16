import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Empregado> empregadoArray = new ArrayList<>();
        Empregado e1 = new Empregado(1, "João", 1300, "2000-02-12");
        Empregado e2 = new Empregado(2, "Sérgio", 1100, "1999-11-27");
        Empregado e3 = new Empregado(3, "Arnaldo", 1500, "2005-07-12");
        Empregado e4 = new Empregado(4, "Zeca", 5000, "1980-03-04");
        empregadoArray.add(e1);
        empregadoArray.add(e2);
        empregadoArray.add(e3);
        empregadoArray.add(e4);
        Collections.sort(empregadoArray, new ComparaSalario());
        System.out.println("=====Salários em ordem crescente======");
        for(Empregado e : empregadoArray){
            System.out.println(e.toString());
        }
        System.out.println("=====================================");
        System.out.println("Maior salário:" + Collections.max(empregadoArray).getNome());
        System.out.println("Menor salário:" + Collections.min(empregadoArray).getNome());
        Collections.sort(empregadoArray, new ComparaData());
        System.out.println("=====Datas em ordem crescente======");
        System.out.println("Datas em formato YYYY/MM/DD.");
        for(Empregado e : empregadoArray){
            System.out.println(e.toString());
        }
        System.out.println("==================================");
    }       
}
