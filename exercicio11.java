import java.util.Scanner;

public class exercicio11 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int anos;
        int meses;
        int dias;

        System.out.println("Digite sua idade em anos ");
        anos = sc.nextInt();

        System.out.println("Digite a sua idade em meses ");
        meses = sc.nextInt();

        System.out.println("Digite a sua idade em dias ");
        dias = sc.nextInt();

        int total = (dias + (meses * 30) + (anos * 365));

        System.out.print("A sua idade em é: " + total);
        sc.close();
    }    
}