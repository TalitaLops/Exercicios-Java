import java.util.Scanner;

public class exercicio05 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite um número");
        valor = sc.nextInt();

        int total = (valor - 1);

        System.out.print("O antecessor desse número é: " + total);
        sc.close();
    }
}
