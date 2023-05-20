package aula01;

import java.util.Scanner;

public class Desafio{
    public static void main(String[] args){
        
        int ddd;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o DDD desejado: ");
        ddd = ler.nextInt();

        // Centro-Oeste
        if(ddd==61){
            System.out.println("Distrito Federal");
        } else if(ddd==62 || ddd==64){
            System.out.println("Goiás");
        } else if(ddd==65 || ddd==66){
            System.out.println("Mato Grosso");
        } else if(ddd==67){
            System.out.println("Mato Grosso do Sul");
        }
        
        // Nordeste
        else if(ddd==82){
            System.out.println("Alagoas");
        } else if(ddd==71 || ddd==73 || ddd==74 || ddd==75 || ddd==77){
            System.out.println("Bahia");
        } else if(ddd==85 || ddd==88){
            System.out.println("Ceará");
        } else if(ddd==98 || ddd==99){
            System.out.println("Maranhão");
        } else if(ddd==83){
            System.out.println("Paraíba");
        } else if(ddd==81 || ddd==87){
            System.out.println("Pernambuco");
        } else if(ddd==86 || ddd==89){
            System.out.println("Piauí");
        } else if(ddd==84){
            System.out.println("Rio Grande do Norte");
        } else if(ddd==79){
            System.out.println("Sergipe");
        }
        
        // Norte
        else if(ddd==68){
            System.out.println("Acre");
        } else if(ddd==96){
            System.out.println("Amapá");
        } else if(ddd==92 || ddd==97){
            System.out.println("Amazonas");
        } else if(ddd==91 || ddd==93 || ddd==94){
            System.out.println("Pará");
        } else if(ddd==69){
            System.out.println("Rondônia");
        } else if(ddd==95){
            System.out.println("Roraima");
        } else if(ddd==63){
            System.out.println("Tocantins");
        }
        
        // Sudeste
        else if(ddd==27 || ddd==28){
            System.out.println("Espirito Santo");
        } else if(ddd>30 && ddd<38 && ddd!=36){
            System.out.println("Minas Gerais");
        } else if(ddd==21 || ddd==22 || ddd==24){
            System.out.println("Rio de Janeiro");
        } else if(ddd>10 && ddd<20){
            System.out.println("São Paulo :D");
        }
        
        // Sul
        else if(ddd>40 && ddd<47){
            System.out.println("Paraná");
        } else if(ddd==51 || ddd==53 || ddd==54 || ddd==55){
            System.out.println("Rio Grande do Sul");
        } else if(ddd>46 && ddd<50){
            System.out.println("Santa Catarina");
        }
    }
}