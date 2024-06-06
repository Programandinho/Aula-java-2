package Atividades_2;

import java.util.Scanner;

public class Substring {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        String texto;

        System.out.print("Digite uma frase: ");
        texto = input.nextLine();

        System.out.println("A frase sem o ultimo caracter é: " + texto.substring(0, texto.length()-1));

    }
}
