public class Produto {
    private String Nome;
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }

    private String ID;
    public String getID() {
        return ID;
    }
    public void setID(String iD) {
        ID = iD;
    }

    private double preço;
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }

    public Produto(String nome, String iD, double preço) {
        Nome = nome;
        ID = iD;
        this.preço = preço;
    }
    @Override
    public boolean equals(Object o) {
        Produto p = (Produto)o;
        if(this.getID().equals(p.getID()))
            return true;
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "\nNome:" + getNome() + "\nCódigo de barras:" + getID() + "\nPreço:" + getPreço() + "\n";
    }
}
