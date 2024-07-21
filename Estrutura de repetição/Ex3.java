import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        // Fatorial de um Número utilizando for

        Scanner sc = new Scanner(System.in);

        int fatorial, calculo = 0, soma = 0;

        System.out.println("Digite um número que você deseja saber o fatorial: ");
        fatorial = sc.nextInt();

        for (int i = fatorial - 1; i >= 1; i--){
           /*  
            Outra forma de ser feito
    
            calculo = fatorial * i ;
            fatorial = calculo;
            soma += fatorial;
            
            */

            fatorial = fatorial * i;
        }
        System.out.println(fatorial);
        
    }
}
