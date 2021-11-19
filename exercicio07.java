import java.util.Scanner;

public class exercicio07 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;

        System.out.println("Digite o valor da base do retângulo: ");
        base = sc.nextInt();

        System.out.println("Digite o valor da altura do retângulo: ");
        altura = sc.nextInt();

        int total = (base * altura);

        System.out.print("A área desse retângulo é: " + total);
        sc.close();
    }
}
