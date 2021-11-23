import java.util.Scanner;

public class exercicio21{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int inicio;
        int fim;

        System.out.println("Digite o horário inicial do jogo de xadrez: ");
        inicio = sc.nextInt();

        System.out.println("Digite o horário de término da partida: ");
        fim = sc.nextInt();

        int duracao = (fim - inicio);

        if(duracao > 0){
            System.out.print("A duração da partida de xadrez corresponde a: " + duracao);
        } else{
            int duracao = ((fim - inicio) + 24);
            System.out.print("A duração da partida de xadrez corresponde a: " + duracao);
        }
        
        sc.close();
    }
}