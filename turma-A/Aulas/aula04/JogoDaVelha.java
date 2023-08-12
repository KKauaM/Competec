import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args){

        // elementos
        String[] jogador = new String[2];
        int[][] tabu = new int[3][3];
        int o=0, x=0;

        Scanner ler = new Scanner(System.in);
        
        // pedido de dados
        System.out.println("Digite o nome do 1º jogador(a): ");
        jogador[0] = ler.nextLine();
        System.out.println("Digite o nome do 2º jogador(a): ");
        jogador[1] = ler.nextLine();
        System.out.println("Digite o nome do 3º jogador(a): ");
        jogador[2] = ler.nextLine();

        for(int jog=0; jog<6; jog++){
            System.out.println("=== "+ jogador[jog] +" vs "+ jogador[(jog+1)] +" ===\n");

            for(int l=0; l<=2; l++){
                for(int c=0; c<=2; c++) tabu[l][c] = ler.nextInt();
                System.out.println();
            }

            for(int l=0; l<=2; l++){
                for(int c=0; c<=2; c++) {
                    if(tabu[l][c] == 0){
                        o++;
                    } if else(tabu[l][c] == 1){
                        x++;
                    } if else(){

                    }
                }
                System.out.println();
            }
        }

        ler.close();
    }
}