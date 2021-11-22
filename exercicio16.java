import java.util.Scanner;

public class exercicio16 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int primeiraNota;
        int segundaNota;
        int terceiraNota;

        System.out.println("Digite a primeira nota obtida: ");
        primeiraNota = sc.nextInt();

        System.out.println("Digite a segunda nota obtida: ");
        segundaNota = sc.nextInt();

        System.out.println("Digite a terceira nota obtida: ");
        terceiraNota = sc.nextInt();

        int mediaPonderada = ((primeiraNota * 2 + segundaNota * 3 + terceiraNota * 5)/10);

        System.out.print("A média final desse aluno é: " + mediaPonderada);
        sc.close();
    }
}
