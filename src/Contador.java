import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int parametroUm = sc.nextInt();

            System.out.println("Digite o segundo número: ");
            int parametroDois = sc.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior");
        } else {
            parametroDois = parametroDois - parametroUm;
            for (int i = 1; i <= parametroDois; i++) {
                System.out.println("Imprindo..." + i);
            }
        }
    }
}
