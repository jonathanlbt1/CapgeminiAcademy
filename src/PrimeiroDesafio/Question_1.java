package PrimeiroDesafio;

import java.util.Scanner;

public class Question_1 {

    /**
     * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços.
     * A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira um numero para sua escada: ");
        int n = scan.nextInt();
        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (j = n; j >= n-i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        scan.close();
    }
}
