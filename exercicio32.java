import java.util.Scanner;

public class exercicio32{
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
            int soma = valor1 + valor2;
            System.out.println("A soma dos valores maiores é " + soma);
        } else if(valor1>valor3>valor2){
            int soma = valor1 + valor3;
            System.out.println("A soma dos valores maiores é " + soma);
        } else (valor2>valor3>valor1){
            int soma = valor3 + valor2;
            System.out.println("A soma dos valores maiores é " + soma);
        }

        sc.close()
    }
}
//Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2
//maiores.