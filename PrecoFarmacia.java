package Atividades_2;

import java.util.Scanner;

import static java.lang.Math.round;

public class PrecoFarmacia {

    public static void main(String args[]){

        float preco;
        Scanner input = new Scanner(System.in);

        do{
        System.out.print("Digite o valor do produto: ");
        preco = input.nextFloat();

        if(preco != 0)
        System.out.println("O produto com 12% de aumenta fica: " + round(preco + ((preco * 12)/100)));


        }while(preco != 0);



    }
}
