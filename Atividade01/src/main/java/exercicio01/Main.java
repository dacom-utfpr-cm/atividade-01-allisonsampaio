/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio

 * Exercício 01 -
 * Programa que inicia três threads e, cada thread, espere um tempo aleatório para terminar.
 */
package exercicio01;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int i;
        Random rand = new Random();

        for (i = 0; i < 3; i++) {
            new Thread(() -> {
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
