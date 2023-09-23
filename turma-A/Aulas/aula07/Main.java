import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        
        // 1145
        Scanner ler = new Scanner(System.in);

        int x = ler.nextInt();
        int y = ler.nextInt();
        int a=0;

        for(int i=1; i<=y; i++){
            if (i-1==a) {
                System.out.print(a!=0? "\n" : "");
                a+=x;
            }
            System.out.print(i+" ");
        }
        //

        //1173
        //1175
        //1241

    }
 
}