import java.util.Scanner;

public class exercicio26{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        char genero;
        int altura;

        System.out.println("Digite seu gênero: ");
        genero = sc.next();

        System.out.println("Digite a sua altura: ");
        altura = sc.nextInt();

        if (genero = "M", "m", "maculino", "Masculino"){
            float pesoIdeal= 72.7 * altura - 58;
            System.out.print("O seu peso ideal é: "+pesoIdeal);
        } else{
            float pesoIdeal= 62.1 * altura - 44.7;
            System.out.print("O seu peso ideal é: "+pesoIdeal);
        }


        sc.close();
    }
}