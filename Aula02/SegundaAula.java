import java.util.Scanner;

public class SegundaAula {

    public static void main(String[] args) {
        float peso = 73.4f;
        int altura = 170;
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++


        float imc = peso / ((altura / 100.0f) * (altura / 100.0f));
        String nome = "";
        Scanner scan = new Scanner(System.in);
        

        System.out.println("Qual o seu nome?");
        nome = scan.nextLine();

        System.out.println("Digite aqui seu peso:");
        peso = scan.nextFloat();

        while (peso <= 0 || peso > 300) {
            System.out.println("Valor de peso inválido. Digite um valor entre 0 e 300.");
            System.out.println("Digite novamente seu peso:");
            peso = scan.nextFloat();
        }
        System.out.println("Digite aqui sua altura:");
        altura = scan.nextInt();

        imc = peso / ((altura / 100.0f) * (altura / 100.0f));

        System.out.printf("Resultado IMC: %.2f%n", imc); 
        scan.close(); 
    
        }
    }
// para criar uma constante, exemplo, constante média, usa-se o prefixo final. Exemplo: final int Media = 60.
// Comandos com ln ou line no final executam quebra de linha. Pode também ser
// usado /n ou %n
// % indica o início do especificador de formato.
// .2 é usado para especificar que queremos exibir apenas duas casas decimais
// após o ponto decimal.
// f indica que o valor formatado será um número em ponto flutuante (float ou
// double).
// %n é um caractere de nova linha, que adiciona uma quebra de linha após o
// valor formatado.
// ++++++COMPILAÇÃO MANUAL DO JAVA++++++
// PS C:\xampp\htdocs\HTML PASTE> cd "C:\xampp\htdocs\HTML PASTE\CURSO SENAI"
// PS C:\xampp\htdocs\HTML PASTE\CURSO SENAI> javac SegundaAula.java
// PS C:\xampp\htdocs\HTML PASTE\CURSO SENAI> java SegundaAula