import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        int valor1;

        System.out.println("Digite um valor: ");
        valor = sc.nextInt();

        System.out.println("Digite outro valor: ");
        valor1 =sc.nextInt();

        int total = (valor - valor1);

        System.out.print("O valor total é: " + total);
        sc.close();
    }
}
