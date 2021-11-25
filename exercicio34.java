import java.util.Scanner;

public class exercicio34{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Digite a medida de um lado do triângulo:");
        a =  sc.nextInt();
        
        System.out.println("Digite a medida de um lado do triângulo:");
        b =  sc.nextInt();

        System.out.println("Digite a medida de um lado do triângulo:");
        c =  sc.nextInt();

        if(a > a+b || a+c || b+c){
            System.out.println("As medidas não formam um triângulo !")
        } else if(b > a+b || a+c || b+c){
            System.out.println("As medidas não formam um triângulo !")
        } else if(a > a+b || a+c || b+c){
            System.out.println("As medidas não formam um triângulo !")
        } else{
            System.out.println("As medidas formam um triângulo !")
        }

        sc.close()
    }
}
// Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam
// ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma
// dos outros 2 lados.