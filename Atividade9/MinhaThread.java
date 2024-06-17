import java.util.ArrayList;

public class MinhaThread extends Thread {
    private ArrayList<String> numerosPrimos = new ArrayList();
    private int inicio;
    private int fim;
    private String nome;

    // Construtor para configurar o intervalo de números a serem verificados
    public MinhaThread(int inicio, int fim, String nome) {
        this.inicio = inicio;
        this.fim = fim;
        this.nome = nome;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        contaPrimos();
        String numeros = "";
        for(String numero: numerosPrimos){
            numeros += numero + ",";
        }
        System.out.println("Números primos entre " + inicio + " e " + fim + "(Thread "+ nome +")"+ ":");
        System.out.println(numeros);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Tempo de execução da thread " + nome + ": " + duration + " milissegundos");
    }

    public void adicionarNumero(int valor){
        String numero = Integer.toString(valor);
        numerosPrimos.add(numero);
    }

    public void contaPrimos() {
        for(int valor = inicio; valor <= fim; valor++) {
            if(ehPrimo(valor)) {
                adicionarNumero(valor);
            }
        }
    }

    private boolean ehPrimo(int valor) {
        for(int d = 2; d < valor; d++) {
            if(valor % d == 0) {
                return false;
            }
        }
        return valor > 1;
    }
}
