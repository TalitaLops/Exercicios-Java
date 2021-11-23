import java.util.Scanner;

public class exercicio23{
    public static void main(String[]args){
        Scanner sc = new Scanner (String.in);
        int valor1;
        int valor2;

        System.out.println("Digite um valor: ");
        valor1 = sc.nextInt();

        System.out.println("Digite outro valor: ");
        valor2 = sc.nextInt();
        
        if (valor1 > valor2){
            System.out.print("A ordem crescente é: " + valor1 +","+ valor2);
        } else if(valor1=valor2){
            System.out.println("Digite outro valor: ");
            valor2 = sc.nextInt();
        } else{
            System.out.print("A ordem crescente é: " + valor2 +","+ valor1);
        }
        
        sc.close();
    }
}

//Ler dois valores (considere que não serão 
//lidos valores iguais) e escrevê-los em 
//ordem crescente.