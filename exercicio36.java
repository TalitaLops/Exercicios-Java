import java.util.Scanner;

public class exercicio32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;

        System.out.println("Digite um número:");
        valor1 = sc.nextInt();

        System.out.println("Digite um número:");
        valor2 = sc.nextInt();

        if(valor1 = valor2){
            System.out.println("Números iguais");
        } else if (valor1 > valor2){
            System.out.println("O primeiro é maior");
        } else{
            System.out.println("O segundo é maior");
        }

        sc.close()
    }
}
// Ler dois valores e imprimir uma das três mensagens a seguir:
// ‘Números iguais’, caso os números sejam iguais
// ‘Primeiro é maior’, caso o primeiro seja maior que o segundo;
// ‘Segundo maior’, caso o segundo seja maior que o primeiro