public class Ex5 {
    public static void main(String[] args) {
        //Sequência de Fibonacci

       int fibonacci = 0, calculo = 0, dar = 1;
        for( int i = 1; i <= 10; i++){
        
            calculo = fibonacci + dar;
            fibonacci = dar;
            dar = calculo;
            System.out.println(fibonacci);
        }
       
        System.out.println(fibonacci);
    }
}
