import java.util.Scanner;

public class exercicio32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        System.out.println("Digite um valor para X");
        x = sc.nextInt();

        System.out.println("Digite um valor para Y");
        y = sc.nextInt();

        int z = (x*y)+5;
        if(z <= 0){
            System.out.print("A resposta é 'A'");
        } else if(z <= 100){
            System.out.print("A resposta é 'B'");
        } else{
            System.out.print("A resposta é 'A'");
        }

        sc.close()
    }
}
