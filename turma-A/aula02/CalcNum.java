package aula02;

import java.util.Scanner;

public class CalcNum {
    public static void main(String[] args) {

        int resul=0;        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite até qual número a soma vai: ");
        int num = ler.nextInt();

        for(int i=1; i<=num; i++){
            resul += i;
        }

        System.out.println("A soma de 1 até "+ num +" é: "+ resul);

        ler.close();
    }
}
