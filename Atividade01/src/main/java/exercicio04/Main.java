/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 04 -
 * Thread que monitora um conjunto de threads e exibe quais threads receberam sinais de interrupção.
 */
package exercicio04;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int i;
        for (i = 0; i < 5; i++) {
            Thread t = new Thread();
            System.out.println(t.getName());
            Thread.sleep(2000);
            
            t.start();
            Thread.sleep(2000);
            t.interrupt();
        }
    }
}
