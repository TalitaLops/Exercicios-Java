import java.util.Scanner;

public class exercicio35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time1;
        int time2;

        System.out.println("Digite quantos gols o primeiro time fez:");
        time1 = sc.nextInt();

        System.out.println("Digite quantos gols o segundo time fez:");
        time2 = sc.nextInt();

        if (time1 > time2){
            System.out.println("O primeiro time venceu a partida !");
        } else if (time1 < time2){
            System.out.println("O segundo time venceu a partida !");
        } else{
            System.out.println("Empate !");
        }

        sc.close()
    }
}
// Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome
// do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.