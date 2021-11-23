import java.util.Scanner;

public class exercicio21{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int ano;

        System.out.println("Digite o ano do seu nascimento: ");
        ano = sc.nextInt();

        int idade = 2021 - ano;
        
        if(idade > 16){
            System.out.println("Você poderá votar esse ano !");
        } else {
            System.out.println("Você não poderá votar esse ano !")
        }

        sc.close();
    }
}
//Ler o ano atual e o ano de nascimento de uma 
//pessoa. Escrever uma mensagem que diga se ela
//poderá ou não votar este ano (não é necessário 
//considerar o mês em que a pessoa nasceu).