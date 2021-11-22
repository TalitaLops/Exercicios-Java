import java.util.Scanner;

public class exercicio17 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int valor;

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        if(valor>10){
            System.out.println("O valor é maior que 10 !");
        } else {
            System.out.println("O valor não é maior que 10 !");
        }

        sc.close();
    }    
}
