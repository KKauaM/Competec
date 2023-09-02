package aula06;

import java.util.Scanner;

public class TwoPiece {
    public static void main(String[] args) {
        System.out.println("=== Conversões ===");
        int fru = pedir();

        reais(fru);
        dol(fru);
        euro(fru);
        ienes(fru);
    }

    public static int pedir(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da fruta: ");
        int num = ler.nextInt();

        ler.close();
        return num;
    }

    public static void reais(int num){
        System.out.printf("Reais: %.2f %n", (num*0.47));
    }

    public static void dol(int num){
        System.out.printf("Doláres: %.2f %n", (num*0.091));
    }

    public static void euro(int num){
        System.out.printf("Euros: %.2f %n", (num*0.077));
    }

    public static void ienes(int num){
        System.out.printf("Ienes: %.2d %n", (num*10));
    }
}
