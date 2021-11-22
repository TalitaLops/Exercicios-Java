import java.util.Scanner;

public class exercicio19 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int macas;

        System.out.println("Digite a quantidade de maçãs: ");
        macas = sc.nextInt();

        if(macas > 12){
            System.out.println("O custo total da compra é: " + macas + " R$");
        } else{
            System.out.println("O custo total da compra é: " + macas*1.30F + " R$");
        }

        sc.close();
    }
}
