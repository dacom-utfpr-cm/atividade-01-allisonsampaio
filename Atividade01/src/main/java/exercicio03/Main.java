/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 03 -
 * Programa que envia interrupções para as threads dos exercicios anteriores.
    As threads fazem o tratamento dessas interrupções e realizam uma finalização limpa.
 */
package exercicio03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        int i;
        String caminho = "C:/Users/allis/Documents/utfpr/pc/atividade-01-allisonsampaio";

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

        try {
            BufferedReader file = new BufferedReader(new FileReader(caminho + "/files/exercicio02.txt"));

            new Thread(() -> {
                Thread.currentThread().setName("exercicio02");
                try {

                    while (file.ready()) {
                        System.out.println(file.readLine());
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }).start();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    public void interromperThread(Thread t) throws InterruptedException {
        System.out.println("Interrompendo thread . .");
        Thread.sleep(2000);
        t.interrupt();
    }
}
