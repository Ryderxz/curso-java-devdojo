package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta;

        System.out.println("Digite o tipo de conta que você deseja:");
        System.out.println("Caso conta poupança, digite 1");
        System.out.println("Caso conta correte, digite 2");
        System.out.println("Caso conta investimento, digite 3");
        System.out.print("Conta desejada: ");
        conta = input.nextInt();

        switch (conta) {
            case 1:
                System.out.println("Você selecionou a conta Poupança e sua porcentagem de juros é de 0.05%.");
                break;
            case 2:
                System.out.println("Você selecionou a conta Corrente e sua porcentagem de juros é de 0.02%.");
                break;
            case 3:
                System.out.println("Você selecionou a conta Investimento e sua porcentagem de juros é de 0.01%.");
                break;
            default:
                System.out.println("Numero inválido");
        }
    }
}
