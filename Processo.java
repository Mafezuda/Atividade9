public class Processo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MinhaThread());
        Thread t2 = new Thread(new MinhaThread());

        // Definir prioridade para as threads
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

        int numThreads = Thread.activeCount();
        System.out.println("Quantidade de threads em execução: " + numThreads);

        // Esperar pelas threads terminarem
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
