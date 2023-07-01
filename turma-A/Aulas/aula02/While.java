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

        /* Somente num ímpares
            System.out.println("Digite um valor: ");
            int num = ler.nextInt();//10

            for(int a=num; a>0; a--){ 
                System.out.print(a%2==0? "" : a +", ");
            }

            for(int a=1; a>num; a=a+2){ 
                System.out.print(a +", ");
            }
        */
        /* primos?
        int x = ler.nextInt();
        int i=0;
        
        while(i<x){
            int n = ler.nextInt();
            
            n = n==2 || n==3 || n==5? 7 :n;
            
            System.out.println(n%2==0 || n%3==0 || n%5==0 ? "Not Prime" :"Prime");
            i++;
        }
        */

        ler.close();
    }
}
