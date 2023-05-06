package Aula01;

import java.util.Scanner;

public class nomeIdade {
    public static void main(String[] args) {
        System.out.println("=== Exercício 01 ===");

        // variaveis
        String primeiroNome;
        String sobrenome;
        int idade;
        boolean cafeDaManha = false;

        Scanner ler = new Scanner(System.in);

        // ver valores
        System.out.println("Digite seu nome: ");
        primeiroNome = ler.nextLine();
        System.out.println("Digite seu sobrenome: ");
        sobrenome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        sobrenome = ler.nextInt();
        System.out.println("--------------------");

        // tomar cafá pae
        String nome = primeiroNome + " " + sobrenome;
        if(cafeDaManha){
            System.out.println("O "+ nome +", de "+ idade +" tomou café da manhã");
        } else {
            System.out.println("O "+ nome +", de "+ idade +", NÃO tomou café da manhã");
        }
    }
}