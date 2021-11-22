import java.util.Scanner;

public class exercicio15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int fahrenheit;

        System.out.println("Digite a temperatura em graus Farenheit: ");
        fahrenheit = sc.nextInt();

        int celsius = (((fahrenheit - 32) / 9) * 5);

        System.out.println("A temperatura em graus Celsius é: " + celsius + "°");

        sc.close();
    }

}
 