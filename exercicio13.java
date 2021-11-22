import java.util.Scanner;

public class exercicio13 {

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int salarioAtual;
        int reajuste;

        System.out.println("Digite o salario mensal atual do funcionário: ");
        salarioAtual = sc.nextInt();

        System.out.println("Digite o percentual de reajuste do salário: ");
        reajuste = sc.nextInt();

        int salarioFinal = ((salarioAtual * reajuste / 100) + salarioAtual);
        
        System.out.println("O novo salário corresponde a: " + salarioFinal + "R$");
        sc.close();
    }
}
// Escreva um algoritmo para ler o salário mensal atual de um 
// funcionário e o percentual de reajuste. 
// Calcular e escrever o valor do novo salário.