package Atividades_2;


import java.math.*;
import java.util.Random;

public class SenhaAleatoria {

    public static void main(String args[]){

        Random random = new Random();
        StringBuilder concatena = new StringBuilder();

        int digitos = random.nextInt(5, 10);
        StringBuilder senha;

        for(int i = 0; i < digitos; i++){

            concatena = concatena.append(Math.random());

        }


        System.out.println("A senha gerada foi: " + concatena.toString());
    }
}
