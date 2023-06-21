import java.util.Random;
import java.util.Scanner;

public class Aula03 {
   public static void main(String[] args) throws Exception {
    
     /* Random random = new Random();

    Scanner scan = new Scanner(System.in);  
    
    System.out.println("Quantidade de vezes: ");
    int contador = scan.nextInt(); 
    //LOOP


for (int i = 0; i<contador; i++){
    
        System.out.println("Contador: "+ (i+1));
        System.out.println("Valor: "+ (random.nextInt(6)+1));
    
    
    }
scan.close();
} */

Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] positions = new int[6];

        System.out.print("Quantidade de Vezes: ");
        int vezes = scanner.nextInt();

        for(int i = 0; i < vezes; i++) {
            int valor = random.nextInt(6);
            positions[valor] += 1;
            System.out.print("Jogada " + (i+1));
            System.out.println(" Valor: " + (valor + 1));
        }

        for (int i = 0; i < positions.length; i++){
            System.out.println("Posição: " + (i+1) + " Caiu: " + positions[i]);    
    
                }
            scanner.close();
            }    
}