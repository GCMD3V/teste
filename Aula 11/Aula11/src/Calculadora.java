import java.util.Scanner;

public class Calculadora {
   
   
    public static int soma(int a, int b) {
        return a + b;
    }
 

    public static void main(String[] args) throws Exception {
        
       
        Scanner sc =  new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO: ");
        int a = sc.nextInt();
        System.out.println("DIGITE UM NÚMERO: ");
        int b = sc.nextInt();
        int resultado = soma(a, b);
        System.out.println(resultado);
        sc.close();

    }

}