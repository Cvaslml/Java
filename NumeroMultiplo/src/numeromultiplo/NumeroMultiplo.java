package numeromultiplo;
//Programa Java para DETERMINAR SI UN NUMERO ES MULTIPLO DE 3 Y 5.
import java.util.Scanner;

public class NumeroMultiplo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a; // Múltiplo

        System.out.print("Ingrese un número: ");
        a = sc.nextInt();

            if (a%3==0 & a%5==0){
                System.out.print(a + " Es multiplo de 3 y 5");
            }
            else{
                System.out.println(a +" No es multiplo de 3 y 5");    
            }
        

        }

}

