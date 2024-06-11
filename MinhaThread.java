public class MinhaThread implements Runnable {
    public void run() {
        System.out.println("Thread '" + Thread.currentThread().getName() + "' executando");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MinhaThread());
        thread.setName("MinhaThread");
        thread.setPriority(Thread.MAX_PRIORITY); // Atribuir prioridade máxima
        thread.start();
        try {
            thread.join(); // Esperar pela thread terminar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
