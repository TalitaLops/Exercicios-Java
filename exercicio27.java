import java.util.Scanner;

public class exercicio27{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        float salarioFixo;
        float comissaoCarro;
        float quantidadeCarro;
        float ValorCarro;

        System.out.println("Digite o salário fixo do vendedor: ");
        salarioFixo= sc.nextFloat();

        System.out.println("Digite a comissão por carro vendido: ");
        comissaoCarro= sc.nextFloat();

        System.out.println("Digite o total de carros vendidos: ");
        quantidadeCarro= sc.nextFloat();
        
        System.out.println("Digite o valor dos carros vendidos: ");
        ValorCarro= sc.nextFloat();

        float salarioFinal= salarioFixo + comissaoCarro * quantidadeCarro + (5*ValorCarro);
        
        System.out.println("O salário final do vendedor é R$"+ salarioFinal);
        sc.close();
    }
}