package academy.devdojo.estruturascondicionais.ifselse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 150;

        if ((numero % 2) == 0) {
            System.out.println("É par "+(numero % 2));
        }else {
            System.out.println("É impar "+(numero % 2));
        }
    }
}
