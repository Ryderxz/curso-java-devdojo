package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aulao3Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Calculo de imposto");
                    break;
                case 2:
                    System.out.println("Deposito de salario");
                    break;
                default:
                    opcao = 3;
                    System.out.println("SAIR");
            }
        }
        System.out.println("Programa encerrado");
    }
}
