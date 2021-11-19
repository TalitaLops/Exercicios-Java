import java.util.Scanner;

public class exercicio10 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int base;
        int altura;

        System.out.println("Digite o valor da base do triângulo: ");
        base = sc.nextInt();

        System.out.println("Digite o valor da altura do triângulo ");
        altura = sc.nextInt();

        int area = ((base * altura) / 2 );

        System.out.print("A área desse triângulo é: " + area);
        sc.close();
    }    
}
