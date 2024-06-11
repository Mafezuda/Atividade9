public class SemThreads {
    public static void main(String[] args) {
        int inicio = 2;
        int fim = 10;
        imprimePrimos(inicio, fim);
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
