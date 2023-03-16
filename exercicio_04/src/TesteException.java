public class TesteException {
    public static void main(String[]args){
        System.out.println("Início do main");
        metodo1();
        
        System.out.println("fim do main");
    }

    static void metodo1(){
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("fim do método 1");
    }
    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Início do método 2");
        int[] array = new int[10];
        System.out.println("Fim do método 2");
        try {
            for(int i =0; i<=15; i++){
                array[i]=i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida requerida. Finalizando método 2...");
        }
    }
}
