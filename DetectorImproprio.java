package Atividades_2;

import java.util.Scanner;

public class DetectorImproprio {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        String frase;

        System.out.print("Digite uma frase:");
        frase = input.nextLine();

        if(frase.toLowerCase().contains("sexo") || frase.toLowerCase().contains("sexual")){
            System.out.println("conteúdo impróprio");
        }else{
            System.out.println("conteúdo liberado");
        }

    }

}
