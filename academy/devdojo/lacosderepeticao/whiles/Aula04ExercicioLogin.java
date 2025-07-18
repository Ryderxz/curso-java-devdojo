package academy.devdojo.lacosderepeticao.whiles;

import javax.net.ssl.SSLServerSocketFactory;
import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelaLogin = true;
        Scanner input = new Scanner(System.in);

        while (exibirTelaLogin){
            System.out.println("Digite seu login");
            String loginDigitado = input.nextLine();
            System.out.println("Digite sua senha");
            String passowordDigitado = input.nextLine();

            if (login.equals(loginDigitado) && password.equals(passowordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
