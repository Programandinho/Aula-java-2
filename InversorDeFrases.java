package Atividades_2;

import java.util.Scanner;

public class InversorDeFrases {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        String texto;

        System.out.print("Digite uma frase: ");
        texto = input.nextLine().replaceAll("\\s", "");

        StringBuilder sb = new StringBuilder(texto);

        texto = String.valueOf(sb.reverse());

        System.out.println("Texto sem espaços: " + texto);



    }
}
