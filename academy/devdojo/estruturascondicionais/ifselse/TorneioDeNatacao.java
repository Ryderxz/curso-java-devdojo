package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        String nome;
        String categoria;
        boolean podeParticipar = true;
        int idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Agora digite sua idade: ");
        idade = teclado.nextInt();


        if (idade <= 8) {
            categoria = "";
            podeParticipar = false;
        }else if (idade <= 10) {
            categoria = "Infantil";
        } else if (idade >= 11 && idade <= 15) {
            categoria = "Juvenil";
        }else if (idade >= 16 && idade <= 19) {
            categoria = "Pré-adulto";
        }else {
            categoria = "Adulto";
        }
        if (podeParticipar == true) {
            System.out.println(nome + " participará da categoria: "+categoria);
        }else {
            System.out.println(nome + " não poderá participar da competição");
        }
    }
}
