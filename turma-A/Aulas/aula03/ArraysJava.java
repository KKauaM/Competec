import java.util.Scanner;

public class ArraysJava {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        /* Vetor de 3 num inteiros
        int[] num = {-1,-2,3};
        int resul=0;

        for(int i=0; i<=2; i++) resul += num[i];
        System.out.println("Resultado: "+ resul);
        */

        /* Exemplo foreach
        String nomes[] = {"Ana", "Baetriz", "Carlos"};

        for(String n : nomes) System.out.print(n +", ");
        */

        /* Como imprimir os dados de Vetor
        System.out.println("Digite um a quant nums: ");
        int i = ler.nextInt();

        int mul=0, med=0;
        int[] vet = new int[i];

        for(int w : vet){
            System.out.println("Digite um num: ");
            w = ler.nextInt();

            mul *= w; med += w;
        }
        for(int w : vet) System.out.print(w +", ");
        System.out.println("\nMultiplicação total: "+ mul +"\n Média: "+ med/vet.length);
        */

        // 
        System.out.println("Digite um a quant nums: ");
        int i = ler.nextInt();

        

        ler.close();
    }
}
