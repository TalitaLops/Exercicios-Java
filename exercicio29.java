import java.util.Scanner;

public class exercicio29{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int quantidadeEstoque;
        int maximoEstoque;
        int minimaEstoque;

        System.out.println("Digite a quantidade atual de itens em estoque:");
        quantidadeEstoque  = sc.nextInt();

        System.out.println("Digite a capacidade máxima do estoque:")
        maximoEstoque = sc.println();

        System.out.println("Digite a quantidade mínima em estoque do produto:");
        minimaEstoque = sc.nextInt();

        int quantidadeMedia = maximoEstoque + minimaEstoque;

        if(quantidadeEstoque > quantidadeMedia){

            System.out.print("Não efetuar compra");
        
        } else{
        
            System.out.print("Efetuar compra")
        
        }

        sc.close();
    }
}
// Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
// quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade
// média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual
// a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar
// compra'.