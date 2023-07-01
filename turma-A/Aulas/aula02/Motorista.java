package aula02;

import java.util.Scanner;

public class Motorista {
    public static void main(String[] args) {
        
        System.out.println("========= Me indique as direções exatas =========");

        // variáveis
        int i=1;
        Scanner ler = new Scanner(System.in);

        // quant direções
        System.out.println("Digite quantidade de direções necessárias: ");
        int dir = ler.nextInt();

        // movimentação
        do{
            System.out.println("===========================\n1= Direita\n2= Esquerda\n3= Passe para o Viaduto\n4= Aguarde o Sinal\n5= Vai reto\n===========================");

            System.out.println("Digite o "+ i +"° código de direção: ");
            int d = ler.nextInt();

            if(d == 1){
                System.out.println("P: Vá para a Direita\nM: Pra já!");
            } else if(d == 2){
                System.out.println("P: Esquerda, agora\nM: Esquerdei, e agora?");
            } else if(d == 3){
                System.out.println("P: Passe para o viaduto da frente agora\nM: Eita pipoco. Zumm!");
            } else if(d == 4){
                System.out.println("P: Espere o sinal\nM: Ok!");
            } else if(d == 5){
                System.out.println("P: Continue indo reto\nM: Pronto, e agora?");
            } else{
                i--;
            }
            i++;

        }while(i<=dir);

        System.out.println("P: Opa, chegamos\nM: Blz, parei\nP: Valeu Môto!");

        ler.close();
    }
}