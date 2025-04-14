public class Exercicio13 {

    public static void main(String[] args) {

       for (int i = 1; i <= 6; i++){
           int dado1 = i;

           for (int j = 1; j <= 6; j++){
               int dado2 = j;

               if(dado1 + dado2 == 7){
                   System.out.println("Com a soma do dado 1, cujo valor é " + dado1 + " Somando com dado 2 com o valor de " + dado2 + " a soma deles é 7");
               }
           }
       }

    }
}
