package aula02;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        /* Soma
            int soma=0,cont=0;

            while(cont < 5){
                soma =+ cont;
                cont++;
                System.out.println("Soma atual: "+ soma);
            }
        */

        /* Senha
            String senha="";
            //boolean teste = senha.equals(":D");

            while(senha.equals(":D") == false){
                System.out.println("Digite a senha: ");
                senha = ler.nextLine();
            }
            System.out.println("Você entrou!");
        */

        /* Tabuada
            System.out.println("Digite um valor: ");
            double num = ler.nextDouble();

            for(int a=1; a<=10; a++){ 
                if(a==1) System.out.println("=== Tabuada ("+ num +") ===");

                System.out.println(a +" x "+ num +" = "+ num*a);
            }
        */

        // Somente num ímpares
            System.out.println("Digite um valor: ");
            int num = ler.nextInt();

            for(int a=num; a>0; a--){ 
                System.out.print(a%2==0? "" : a +", ");
            }
        //

        ler.close();
    }
}
