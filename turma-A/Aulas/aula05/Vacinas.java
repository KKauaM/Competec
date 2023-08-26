import java.util.Scanner;

public class Vacinas {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        int num=0, i=0;

        System.out.println("Digite as casas: ");
        int cas = ler.nextInt();

        for(i=0; i<cas; i++){
            System.out.println("Digite uma palavra: ");
            String pala = ler.nextLine();

            System.out.println("Digite uma letra: ");
            String letra = ler.nextLine();

            for(i=0; i<letra.length(); i++) if(letra.equals(pala.charAt(i))) num++;
        }

        System.out.println(num);

        ler.close();
    }
}