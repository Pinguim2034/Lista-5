import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Funcionario> mapa = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        Funcionario Steve = new Funcionario("Steve Jobs", "Programador chefe", 7000);
        Funcionario Scott = new Funcionario("Scott McNealy", "Programador mirim", 5000);
        Funcionario Jeff = new Funcionario("Jeff Bezos", "Atendente", 3000);
        Funcionario Larry = new Funcionario("Larry Ellison", "Faxineiro", 1200);
        Funcionario Bill = new Funcionario("Bill Gates", "CEO", 10000);
        mapa.put("a1234", Steve);
        mapa.put("a1235", Scott);
        mapa.put("a1236", Jeff);
        mapa.put("a1237", Larry);
        mapa.put("a1238", Bill);
        Set<String> chaves= mapa.keySet(); 
        for(String chave: chaves){
            System.out.println("ID:" + chave + "\nNome:" + mapa.get(chave).toString() + "\n");
        }
        System.out.println("\nExemplo de busca de chave com letra maiúscula:\n" + mapa.get("A1234"));
    }
}
