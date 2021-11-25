import java.util.Scanner;

public class exercicio33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;

        System.out.println("Digite um número: ");
        valor1 = sc.nextInt();

        System.out.println("Digite um número: ");
        valor2 = sc.nextInt();

        System.out.println("Digite um número: ");
        valor3 = sc.nextInt();

        if (valor1 = valor2){
            System.out.println("Digite outro valor:");
            valor2 = sc.nextInt();
        } else if (valor2 = valor3){
            System.out.println("Digite outro valor:");
            valor3 = sc.nextInt();
        } else if(valor3 = valor1){
            System.out.println("Digite outro valor:");
            valor3 = nextInt();
        } else if(valor1>valor2>valor3){

            System.out.println("A ordem crescente dos valores é " + valor1 +","+ valor2 +","+ valor3)

        } else if(valor1>valor3>valor2){

            System.out.println("A ordem crescente dos valores é "+ valor1 +","+ valor3 +","+ valor2)

        } else if(valor2>valor3>valor1){

            System.out.println("A ordem crescente dos valores é "+ valor2 +","+ valor3 +","+ valor1)

        } else if(valor2>valor1>valor3){

            System.out.println("A ordem crescente dos valores é "+ valor2 +","+ valor1 +","+ valor3)

        }else if(valor3>valor1>valor2){

            System.out.println("A ordem crescente dos valores é "+ valo3 +","+ valor1 +","+ valor2)

        }else {

            System.out.println("A ordem crescente dos valores é "+ valor3 +","+ valor2 +","+ valor1)

        }


        sc.close()
    }
}

// Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
// crescente.