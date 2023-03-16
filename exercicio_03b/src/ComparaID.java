import java.util.Comparator;
public class ComparaID implements Comparator<Empregado> {
    @Override
    public int compare(Empregado o1, Empregado o2){
        return o1.getID()- o2.getID();
    }
}
