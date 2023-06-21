import java.util.Scanner;

public class Aula07 {

    public static void main(String[] args) {
        // String teste = "Aula sobre Loops";
        // System.out.println(teste);
        // System.out.println("-------------------");

        // Scanner scan = new Scanner(System.in);

        // for (int i = 0; i < 5; i++) {

        //     System.out.println("digite seu nome:");
        //     String nome = scan.next();

        //     if (nome.equals("exit")) {
        //         break;
        //     }

        // }
        // scan.close();
        // System.out.println("loop finalizado");

        // if(sc.hasNextLine()): O if verifica se há uma próxima linha de entrada
        // disponível. Isso é útil para garantir que o programa não tente ler uma linha
        // que não existe, evitando assim uma exceção.

        // nome = sc.nextLine(): Se houver uma próxima linha disponível, o método
        // nextLine() é chamado para ler essa linha de entrada e o valor é atribuído à
        // variável nome. O método nextLine() retorna uma string que representa a
        // próxima linha de entrada.

        System.out.println("Digite seu nome completo:");
        Scanner sc = new Scanner(System.in);

        String fullName = "";
        
        int tentativas = 0;
        while (true) {
            if (sc.hasNextLine()) {
                fullName = sc.nextLine();
                break;
            } else {
                tentativas++;
                System.out.println("Nenhuma linha disponível. Tentativa " + tentativas);
            }
        
            if (tentativas >= 3) {
                System.out.println("Número máximo de tentativas atingido. Encerrando o programa...");
                System.exit(0);
            }
        }
        
        System.out.println("Seu nome completo é: " + fullName);
        
        sc.close();

        System.out.println("-------------------");

        String arr = "Aula sobre Arrays";
        System.out.println(arr);

        // int[] array = new int[6];
        // array[0] = 4;
        // array[1] = 5;
        // array[2] = 3;
        // array[3] = 4;
        // array[4] = 5;
        // array[5] = 1;

        int[] array = { 8, 4, 2, 7, 20, 30 };

        for (int index = 0; index < array.length; index++) {
            System.out.println("position " + index + ": " + array[index]);

        }

        for (int index = 0; index < array.length; index++) {
            System.out.println("position " + index + ": " + array[index] + " e " + array[index + 1]);

            index++;
        }

    }

}
