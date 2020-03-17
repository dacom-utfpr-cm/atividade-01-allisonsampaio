/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 01 -
 * Programa que inicia três threads e, cada thread, espere um tempo aleatório para terminar.
 */
package exercicio01;

import java.util.Random;

public class Thread01 {

    public static void main(String[] args) {
        int i;
        Random rand = new Random();

        for (i = 0; i < 3; i++) {
            new Thread(() -> {
                Thread.currentThread().setName("exercicio01");
                System.out.println("THREAD");
                try {
                    Thread.sleep(rand.nextInt(5000));
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}
