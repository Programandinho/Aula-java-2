package Atividades_2;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Potencia {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int pot;
        double n;

        System.out.print("Digite um número: ");
        n = input.nextDouble();

        System.out.print("Digite o expoente da potência: ");
        pot = input.nextInt();

        System.out.println("A potência do número fica: " + pow(n, pot));



    }
}
