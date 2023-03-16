import java.util.Comparator;

public class ComparaSalario implements Comparator<Empregado> {
    @Override
    public int compare(Empregado o1, Empregado o2){
        return o1.getSalario()- o2.getSalario();
    }
}
