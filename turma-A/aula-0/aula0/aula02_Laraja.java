package aula0;
import java.util.Scanner;

public class aula02_Laraja {
    public static void main(String[] args) {
        // variaveis
        double laranja;
        double uva;

        Scanner ler = new Scanner(System.in);

        // lendo valores
        System.out.print("\nDigite o preço da laranja: ");
        laranja = ler.nextDouble();
        System.out.print("\nDigite o preço da uva: ");
        uva = ler.nextDouble();

        // imprimindo produtos
        System.out.println("--------------------");
        System.out.println("Produtos: Laranja R$"+ laranja +" || Uva: R$"+ uva +"\nTotal: R$"+ (laranja+uva));
        System.out.println("--------------------");
        System.out.printf("Produtos: Laranja R$%s || Uva: R$ %s%nTotal: %d", laranja, uva, (laranja+uva));

        ler.close();
    }
}
