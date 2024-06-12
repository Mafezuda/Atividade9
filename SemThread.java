import java.util.ArrayList;

public class SemThread{
    private int inicio;
    private int fim;
    private ArrayList<String> numerosPrimos = new ArrayList();

    public SemThread(int inicio, int fim){
        this.inicio = inicio;
        this.fim = fim;
    }

    public void imprimir(){
        long startTime = System.currentTimeMillis();
        String numeros = "";
        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for(String numero: numerosPrimos){
            numeros += numero + ",";
        }
        System.out.println(numeros);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Tempo de execução: " + duration + " milissegundos");
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
        for(int d=2; d<valor; d++) {
            if(valor % d == 0) {
                return false;
            }
        }
        if(valor > 1){
            return true;
        }
        
        return false;
    }


}