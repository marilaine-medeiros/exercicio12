//12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são pares

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int i = 1;

        // Ler 20 números do usuário
        while (i <= 20) {
            System.out.println(" Digite o " + i + "° número: ");
            int numero = scanner.nextInt();

            // Verifica se o número é par
            if (numero % 2 == 0) {
                quantidade++;
            }
            i++;
        }
// Para exibir a quantidade de números pares
        System.out.println(" Quantidade de números pares " + quantidade);

        scanner.close();


    }
}
