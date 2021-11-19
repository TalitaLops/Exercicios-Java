import java.util.Scanner;

public class exercicio08 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int raio;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = sc.nextInt();

        int total = (3 * (raio * raio));

        System.out.print("A área desse circulo é: " + total);
        sc.close();
    }
}
