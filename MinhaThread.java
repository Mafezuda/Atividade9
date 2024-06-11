public class MinhaThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread '" + this.getName() + "' executando");
    }

    public static void main(String[] args) {
        MinhaThread thread = new MinhaThread();
        thread.setName("MinhaThread");
        thread.setPriority(Thread.MAX_PRIORITY); // Definir prioridade máxima
        thread.start();

        // Imprimir nome e prioridade da thread
        System.out.println("Nome da thread: " + thread.getName());
        System.out.println("Prioridade da thread: " + thread.getPriority());
    }
}
