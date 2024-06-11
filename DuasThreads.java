public class DuasThreads extends Thread {
    private int inicio, fim;

    public DuasThreads(int inicio, int fim) {
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

    public static void main(String[] args) {
        int meio = (2 + 10) / 2;

        Thread thread1 = new DuasThreads(2, meio);
        Thread thread2 = new DuasThreads(meio + 1, 10);

        thread1.start();
        thread2.start();
    }
}
