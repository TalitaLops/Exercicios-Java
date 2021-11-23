import java.util.Scanner;

public class exercicio14 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int custoDeFabrica;

        System.out.println("Digite o valor do custo de fábrica do carro: ");
        custoDeFabrica = sc.nextInt();

        float custoFinal = (((custoDeFabrica * 28 / 100) + custoDeFabrica * 45 / 100) + custoDeFabrica);

        System.out.print("O valor do carro para o consumidor final é: " + custoFinal);
        
        sc.close();
    }
}
//O custo de um carro novo ao consumidor é a soma do custo de fábrica 
//com a porcentagem do distribuidor e dos impostos (aplicados ao custo 
//de fábrica). Supondo que o percentual do distribuidor seja de 28% e 
//os impostos de 45%, escrever um algoritmo para ler o custo de fábrica 
//de um carro, calcular e escrever o custo final ao consumidor
