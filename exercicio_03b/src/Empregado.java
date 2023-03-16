public class Empregado implements Comparable<Empregado>{
    private int ID;
    public int getID() {
        return ID;
    }
    public void setID( int iD) {
        ID = iD;
    }
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int salario;
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    private String data;
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Empregado(int iD, String nome, int salario, String data) {
        ID = iD;
        this.nome = nome;
        this.salario = salario;
        this.data = data;
    }
    @Override
    public String toString() {
        return "Nome:" + this.getNome() + "\nID:" + this.getID() + "\nSalário:" + this.getSalario() + "\nData de contratação:" + this.getData();
    }
    @Override
    public int compareTo(Empregado o) {
        return this.getSalario() - o.getSalario();
    }
}

