package Atividades_2;

import java.util.Scanner;
import java.math.*;

public class RadianosToGraus {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        double rad;

        System.out.print("Digite um valor radiano: ");
        rad = input.nextDouble();

        System.out.println("O valor em Graus é: " + Math.toDegrees(rad));
    }
}
