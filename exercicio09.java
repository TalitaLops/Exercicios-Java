import java.util.Scanner;

public class exercicio09 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int lado;

        System.out.println("Digite o valor do lado do quadrado");
        lado = sc.nextInt();

        int area = (lado * lado);

        System.out.print("A área do quadrado é: " + area);
        sc.close();
    }
}
