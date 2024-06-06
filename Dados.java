package Atividades_2;

import java.util.Random;

public class Dados {

    public static void main(String args[]){


    Random random = new Random();

    int jogada1 = random.nextInt(1, 6), jogada2 = random.nextInt(1, 6), jogada3 = random.nextInt(1, 6);

     System.out.println("Número da primeira jogada: " + jogada1);
     System.out.println("Número da segunda jogada: " + jogada2);
     System.out.println("Número da terceira jogada: " + jogada3);
     System.out.println("A soma dos valores obtidos pelos dados é: " + (jogada1 + jogada2 + jogada3));

    }
}
