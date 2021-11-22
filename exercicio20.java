import java.util.Scanner;

public class exercicio20 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int nota1;
        int nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        int media = ((nota1 + nota2) / 2);

        if (media > 5){
        
            System.out.print("A média desse aluno é: " + media + " aprovado !");
        
        } else {
        
            System.out.print("A média desse aluno é: " + media + " reprovado");
        
        }
        sc.close();
    }
}
