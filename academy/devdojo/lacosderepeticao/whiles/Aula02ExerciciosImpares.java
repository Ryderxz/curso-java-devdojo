package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExerciciosImpares {
    public static void main(String[] args) {
        int contador;
        int  i = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero para que imprima apenas os numeros que forem impares: ");
        contador = input.nextInt();

        while (i <= contador) {
            if (i % 2 != 0) {
                System.out.println("Numero impar = " + i);
            }
            i++;
        }
    }
}
