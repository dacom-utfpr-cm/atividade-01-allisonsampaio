/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio - 1710621

 * Exercício 02 -
 * Thread que realiza a leitura de um arquivo texto com frases e exibe as frases a cada 10 segundos.
 */
package exercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("exercicio02.txt"));

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

}
