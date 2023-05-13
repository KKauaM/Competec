package aula01;

import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        
        double abacaxi=7.3, maca=2, pera=3;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite quantos abacaxis você deseja: ");
        abacaxi *= ler.nextInt();
        System.out.println("Digite quantos maças você deseja: ");
        maca *= ler.nextInt();
        System.out.println("Digite quantos peras você deseja: ");
        pera *= ler.nextInt();

        System.out.println("Total a pagar: R$"+ (abacaxi+maca+pera));

        ler.close();
    }
}
