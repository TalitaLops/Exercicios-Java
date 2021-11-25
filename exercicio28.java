import java.util.Scanner;

public class exercicio28{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        float saldo;
        float debito;
        float credito;

        System.out.println("Digite o saldo disponível do cartão:");
        saldo = sc.nextFloat();

        System.out.println("Digite o débito disponível:");
        debito = sc.nextFloat();

        System.out.println("Digite o crédito disponível:");
        credito = sc.nextFloat();

        float saldoAtual = saldo - debito + credito;

        if(saldoAtual > 0){
            System.out.print("Saldo positivo !");
        } else{
            System.out.print("Saldo negativo !");
        }

        sc.close();
    }
}