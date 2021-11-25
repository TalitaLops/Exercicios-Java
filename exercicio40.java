import java.util.Scanner;

public class exercicio40{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float kgMorango;
        float kgMaca;

        System.out.println("Digite quantidade em quilos do morango:");
        kgMorango = sc.nextInt();

        System.out.println("Digite quantidade em quilos de maçã:");
        kgMaca = sc.nextInt();

        float total= (kgMaca * 1,80) + (kgMorango * 2.50);

        if (kgMaca > 5 || kgMorango > 5) {

            float total= (kgMaca * 1,50) + (kgMorango * 2.20);
            System.out.print("O valor a ser pago pelo cliente é: R$"+ total;

        } else if (kgMaca > 8 || kgMorango > 8 || total > 25) {
            
            float pagamento = (total - (total * 0.01));
            System.out.print("O valor a ser pago pelo cliente é: R$"+ pagamento);
            
        } else{

            System.out.print("O valor a ser pago pelo cliente é: R$"+ total);
             
        }


        sc.close()
    }
}
// Uma fruteira está vendendo frutas com a seguinte tabela de preços:
// Até 5 Kg Acima de 5 Kg
// Morango R$ 2,50 por Kg R$ 2,20 por Kg
// Maçã R$ 1,80 por Kg R$ 1,50 por Kg
// Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá
// ainda um desconto de 10% sobre este total. 


//Escreva um algoritmo para ler a quantidade (em Kg) de
// morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
