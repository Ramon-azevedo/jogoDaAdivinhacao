package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Jogo da Advinhação");
        System.out.println("Descubra qual número será gerado de 1 a 100");
        System.out.println("-----------------------------------");
        System.out.println("Gerando número aleátorio...");
        int numAlea = (int)(Math.random() * 100) + 1;
        System.out.println("Adivinhe!");
        int numeroAdivinhado = newScanner.nextInt();
        if (numeroAdivinhado == numAlea) {
            System.out.println("Acertou");
        } else {
            System.out.println("Errou tente novamente" + numAlea);
            newScanner.reset();
        }
    }
}