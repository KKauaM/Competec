package aula06;

public class Exercicios {
    public static void main(String[] args) {
        //Exercício01
        competec();

        //Exercício02
        // System.out.println(soma(2, 4));

        //Exercício03
        // tabuada(2);
    }

    // Exercício01
    public static void competec(){
        System.out.println("CompeTop");
    }

    //Exercício02
    public static int soma(int num1, int num2){
        return num1+num2;
    }

    //Exercício03
    public static void tabuada(double num){
        System.out.println("=== Tabuada do "+ num +" ===");
        for(int i=0; i<11; i++) System.out.println(num +" x "+ i +" = "+ (num*i));
    }
}
