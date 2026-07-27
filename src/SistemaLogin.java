import java.util.Scanner;
public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usuarios = new String[3];
        String[] senha = new String[3];

        System.out.println("===CADASTRO DE USÚARIO E SENHA===");
        for (int i = 0; i < 3; i++) {
            System.out.println("cadastre o usuário" + (i + 1) + ":");
            usuarios[i] = scanner.nextLine();

            System.out.println("cadastre uma senha" + (i + 1) + ":");
            senha[i] = scanner.nextLine();
        }

        System.out.println("\n=== TELA DE LOGIN ===");
        System.out.print("Digite seu usuário: ");
        String usuarioDigitado = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senhaDigitada = scanner.nextLine();

        boolean loginvalido = false;
        int tentativasRestantes = 3;

        while (!loginvalido && tentativasRestantes > 0) {
            System.out.println("\n=== TELA DE LOGIN ===");
            System.out.println("Tentativas restantes: " + tentativasRestantes);

            System.out.print("Digite seu usuário: ");
             usuarioDigitado = scanner.nextLine();

            System.out.print("Digite sua senha: ");
             senhaDigitada = scanner.nextLine();

            for (int i = 0; i < 3; i++) {
                if (usuarioDigitado.equals(usuarios[i]) && senhaDigitada.equals(senha[i])) {
                    loginvalido = true;

                }
            }
            if (!loginvalido) {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Usuário ou Senha Incorretos. Tente novamente.");
                }
            }
        }
    if (loginvalido){
        System.out.println("\nLogin Realizado Com Sucesso! SEJA BEM-VINDO!");
    } else{
        System.out.println("\nAcesso bloqueado! Suas 3 tentativas acabaram.");
    }
scanner.close();
    }
  }




















