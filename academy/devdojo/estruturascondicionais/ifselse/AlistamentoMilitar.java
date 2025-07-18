package academy.devdojo.estruturascondicionais.ifselse;/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for M e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
se o sexo for M e a idade for menor que 18 o sistema deve imprimir, alistament não permitido
se o sexo for F e a idade for maior igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
se o sexo for F e a idade for menor que 18 o sistema deve imprimir alistamento não permitido
*/

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int opcao;
        char sexo;

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        System.out.print("Digite seu sexo: ");
        sexo = input.next().charAt(0);

        if (idade >= 120 || idade <= 0) {
            System.out.println("Digite uma idade valida");
        }
        else if ((sexo == 'm'|| sexo == 'M') && idade >= 18) {
            System.out.println("Alistamento obrigatório");
        } else if ((sexo == 'm' || sexo == 'M') && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if ((sexo == 'f' || sexo == 'F') && idade >= 18) {
            System.out.println("Você deseja se alistar?");
            System.out.println("Digite 0 para sim e 1 para não: ");
            opcao = input.nextInt();
            if (opcao == 0) {
                System.out.println("Certo, você ira se alistar!");
            } else {
                System.out.println("Você não irá se alistar.");
            }
        } else if ((sexo == 'f' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else {
            System.out.println("Opção invalida, por favor digite sua idade e sexo corretamente.");
        }
    }
}
