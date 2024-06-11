import java.util.Scanner;

public class SemThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial do intervalo:");
        int inicio = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo:");
        int fim = scanner.nextInt();

        imprimePrimos(inicio, fim);
        
        scanner.close();
    }

    private static void imprimePrimos(int inicio, int fim) {
        System.out.print("Primos no intervalo [" + inicio + ";" + fim + "]: ");
        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean ehPrimo(int valor) {
        if (valor <= 1)
            return false;
        for (int d = 2; d <= Math.sqrt(valor); d++) {
            if (valor % d == 0) {
                return false;
            }
        }
        return true;
    }
}
