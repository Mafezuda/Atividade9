import java.util.ArrayList;

public class Processo {

    public static void semThread(int inicio, int fim){
        SemThread primos = new SemThread(inicio, fim);
        primos.contaPrimos();
        primos.imprimir();
    }

    public static void variasThreads(int inicio, int fim){
        MinhaThread t1 = new MinhaThread(inicio, fim/4, "t1");
        MinhaThread t2 = new MinhaThread(fim/4 + 1, fim/2, "t2");
        MinhaThread t3 = new MinhaThread(fim/2 + 1, fim/2 + fim/4, "t3");
        MinhaThread t4 = new MinhaThread(fim/2 + fim/4 + 1, fim, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    public static void duasThread(int inicio, int fim){
        MinhaThread t1 = new MinhaThread(inicio, fim/2, "t1");
        MinhaThread t2 = new MinhaThread(fim/2 + 1, fim, "t2");
        t1.start();
        t2.start();
        
    }

    public static void umaThread(int inicio, int fim){
        MinhaThread t1 = new MinhaThread(inicio, fim, "t1");
        t1.start();
    }

    public static void main(String[] args) {
        int inicio = 0;
        int fim = 2000000;
        //umaThread(inicio, fim);
        //duasThread(inicio, fim);
        ///variasThreads(inicio, fim);
        semThread(inicio, fim);
        
    }
}
