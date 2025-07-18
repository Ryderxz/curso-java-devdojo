package academy.devdojo.variaveis;

import java.util.Scanner;

public class RecebendoDadosDoTeclado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.next();
        System.out.print("Agora digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("O nome digitado foi: "+nome);
        System.out.println("A sua idade é: "+idade);
    }
}
