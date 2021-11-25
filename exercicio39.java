import java.util.Scanner;

public class exercicio39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int homem1;
        int homem2;
        int mulher1;
        int mulher2;

        System.out.println("Digite a idade do primeiro homem");
        homem1 = sc.nextInt();
        
        System.out.println("Digite a idade do segundo homem");
        homem2 = sc.nextInt();
        
        System.out.println("Digite a idade da primeira mulher");
        mulher1 = sc.nextInt();

        System.out.println("Digite a idade da segunda mulher");
        mulher2 = sc.nextInt();
        
        if (homem1 = homem2){
            System.out.println("Digite outra idade para o segundo homem");
            homem2 = sc.nextInt();
        } else if (mulher1 = mulher2){
            System.out.println("Digite a idade da segunda mulher");
            mulher2 = sc.nextInt();
        } else if(mulher1 > mulher2 && homem1> homem2){
            int soma= mulher1 + homem1;
            int produto= mulher2 * homem2;

            System.out.println("A soma das idades do homem mais velho com a mulher mais nova corresponde a:" + soma);
            System.out.println("o produto das idades do homem mais novo com a mulher mais velha corresponde a:" + produto);
        
        }else if(mulher2 > mulher1 && homem1> homem2){
            int soma= mulher2 + homem1;
            int produto= mulher1 * homem2;

            System.out.println("A soma das idades do homem mais velho com a mulher mais nova corresponde a:" + soma);
            System.out.println("o produto das idades do homem mais novo com a mulher mais velha corresponde a:" + produto);
        
        }else if(mulher1 > mulher2 && homem2> homem1){
            int soma= mulher1 + homem2;
            int produto= mulher2 * homem1;

            System.out.println("A soma das idades do homem mais velho com a mulher mais nova corresponde a:" + soma);
            System.out.println("o produto das idades do homem mais novo com a mulher mais velha corresponde a:" + produto);
        
        }else {
            int soma= mulher2 + homem2;
            int produto= mulher1 * homem1;

            System.out.println("A soma das idades do homem mais velho com a mulher mais nova corresponde a:" + soma);
            System.out.println("o produto das idades do homem mais novo com a mulher mais velha corresponde a:" + produto);
        }

        sc.close()
    }
}
// Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades
// dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma
// das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais
// novo com a mulher mais velha