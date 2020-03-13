/*
 * Atividade 01 - Programação com Threads
 * Allison Alfredo de Oliveira Sampaio

 * Exercício 02 -
 * Thread que realiza a leitura de um arquivo texto com frases e exibe as frases a cada 10 segundos.
 */
package exercicio02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader(new FileReader("file.txt"));

            new Thread(() -> {
                
            }).start();

        } catch (FileNotFoundException e) {
        }
    }

}
