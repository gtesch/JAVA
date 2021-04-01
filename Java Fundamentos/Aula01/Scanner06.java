import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner obterDados = new Scanner(System.in);

        System.out.println("Informe seu nome");

        String nome = obterDados.next();

        obterDados.close();

        System.out.println("Nome informado: " + nome);
    }
}
