import java.util.Comparator;
public class ComparaData implements Comparator<Empregado>{
    @Override
    public int compare(Empregado o1, Empregado o2) {
        
        return o1.getData().compareTo(o2.getData());
    }
}
