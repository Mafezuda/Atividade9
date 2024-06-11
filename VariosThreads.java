import java.util.Scanner;

public class VariosThreads extends Thread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial do intervalo:");
        int inicio = scanner.nextInt();

        System.out.println("Digite o valor final do intervalo:");
        int fim = scanner.nextInt();

        int numThreads = 4;
        int intervalo = (fim - inicio + 1) / numThreads;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            int subInicio = inicio + i * intervalo;
            int subFim = (i == numThreads - 1) ? fim : subInicio + intervalo - 1;
            threads[i] = new VariosThreads(subInicio, subFim);
            threads[i].start();
        }

        scanner.close();
    }

    private int inicio, fim;

    public VariosThreads(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
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
