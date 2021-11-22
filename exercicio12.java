import java.util.Scanner;

public class exercicio12 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int votos;
        int votosBrancos;
        int votosNulos;
        int votosValidos;

        System.out.println("Digite o número total de eleitores: ");
        votos = sc.nextInt();

        System.out.println("Digite a quantidade de votos brancos: ");
        votosBrancos = sc.nextInt();

        System.out.println("Digite a quantidade de votos nulos: ");
        votosNulos = sc.nextInt();

        System.out.println("Digite a quantidade de votos validos: ");
        votosValidos = sc.nextInt();

        int totalVotosValidos = (votosValidos * 100 / votos);
        int totalVotosBrancos = (votosBrancos * 100 / votos);
        int totalVotosNulos = (votosNulos * 100/ votos);
        
        System.out.println("O total de votos válidos foi: " + totalVotosValidos + "%");
        System.out.println("O total de votos em branco foi: " + totalVotosBrancos + "%");
        System.out.println("O total de votos nulos foi: " + totalVotosNulos + "%");
        sc.close();
    }   
}
