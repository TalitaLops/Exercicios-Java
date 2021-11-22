import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {  
        
        Scanner sc = new Scanner (System.in);
        int numero;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();

        if(numero > 0) {  
           System.out.println("POSITIVO");    
        } else if(numero < 0 ) {  
           System.out.println("NEGATIVO");    
        } else {  
            System.out.println("ZERO");  
        }  

        sc.close();
    }

}
