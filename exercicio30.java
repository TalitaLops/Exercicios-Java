import java.util.Scanner;

public class exercicio30{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Digite um  número:");
        valor = sc.nextInt();

        if(valor < 0){

            System.out.print("Esse valor é negativo !");
        
        } else{

            System.out.print("Esse valor é positivo !")
        }

        sc.close();

    }
}