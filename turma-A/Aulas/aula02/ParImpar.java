package aula02;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        
        int num;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = ler.nextInt();

        System.out.println(num%2==0? "É PAR pae :D" :"É ÍMPAR pae :D");

        ler.close();
    }
}