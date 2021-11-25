import java.util.Scanner;

public class exercicio31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1;
        int valor2;
        int valor3;

        System.out.print("Digite um número: ");
        valor1 = sc.nextInt();

        System.out.print("Digite um segundo número: ");
        valor2 = sc.nextInt();

        System.out.print("Digite um último número: ");
        valor3 = sc.nextInt();

        if(valor1 > valor2 > valor3) + (valor1 > valor3 > valor2){
            System.out.print("O valor maior é " + valor1);
        } else if(valor2 > valor1 > valor3) + (valor2 > valor3 > valor1){
            System.out.print("O valor maior é " + valor2);
        } else{
            System.out.print("O valor maior é " + valor3);
        }

        sc.close();
    }
}
//Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.