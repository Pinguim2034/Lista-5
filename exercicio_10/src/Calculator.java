public class Calculator {
    public double div(double x, double y){
        if (y==0){
            InvalidOperationException e = new InvalidOperationException("Erro na conta.");
            throw e;
        }
        else
        return (x/y);
    }
    public double log10(double x){
        if(x<0){
            InvalidOperationException e = new InvalidOperationException("Erro na conta.");
            throw e;
        }
        else
        return Math.log(x)/ Math.log(10);
    }
}
