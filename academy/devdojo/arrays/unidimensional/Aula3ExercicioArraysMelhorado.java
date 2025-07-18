package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula3ExercicioArraysMelhorado {
    public static void main(String[] args) {
        int [] array1 = new int[3];
        int [] array2 = new int[3];
        int [] array3 = new int[3];
        String result = "";
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            array1[i] = input.nextInt();
            System.out.println("Vetor 2, posição " + i + ": ");
            array2[i] = input.nextInt();
            array3[i] = array1[i] * array2[i];
            result = result + array3[i] + " ";
        }
        System.out.println("Vetor 3 multiplicado: " + result);
    }
}
