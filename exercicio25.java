import java.util.Scanner;

public class exercicio21{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int horasTrabalhadas;
        int salarioPorHora;

        System.out.println("Digite as horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite seu salário por hora: ");
        salarioPorHora = sc.nextInt();

        if(horasTrabalhadas <= 160){ 
            int salarioFinal = (horasTrabalhadas * salarioPorHora);
            System.out.print("O salário final é de " + salarioFinal + " R$");
        } else{
            int horasExtras = (horasTrabalhadas - 160);
            int valorHorasExtras= (horasExtras*salarioPorHora*1.5);
            int salarioFinal = (valorHorasExtras + 160 * salarioPorHora);

            System.out.print("O salário final é de " + salarioFinal + " R$");
            sc.close();
        }
    }
}