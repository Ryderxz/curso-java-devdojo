package academy.devdojo.lacosderepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            System.out.println("Tabuada do numero: "+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.print("Tabuada do: " + i + "x" + j);
                System.out.println(" = "+i*j);
                System.out.println("-------------------------------");
            }
        }
    }
}
