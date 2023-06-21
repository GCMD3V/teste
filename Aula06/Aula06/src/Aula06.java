import java.time.LocalTime;
import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) throws Exception {
//Algorítimo "porta de balada"

        int idade = 17;
        if (idade <18) 
        {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

    
        System.out.println("----------------");

//algorítimo hora do dia 


LocalTime hora = LocalTime.now();
int horaAtual = hora.getHour();


System.out.println(hora);
System.out.println(horaAtual);


if (horaAtual < 12) {
    System.out.println("bom dia!");
} else if (horaAtual < 18){
    System.out.println("boa tarde!");   
} else {
    System.out.println("boa noite!");
}


System.out.println("----------------");

    
// algorítimo aprovado ou reprovado


Scanner sc = new Scanner(System.in);

   System.out.println("Para o input de uma variável  do tipo float ou double, via Scanner, deve-se usar 'vírgula':");
   System.out.println("Digite a nota que João tirou na primeira prova:");

   float nota = sc.nextFloat();
   
   System.out.println("Para declarar uma variável do tipo float, deve-se usar ponto:");
   System.out.println("Então, vamos declarar que João tirou 4.2 na segunda prova e imprimir");

   float numero = 4.2f;
   System.out.println(numero);

   System.out.println("usando replace e parse, é possível substituir os sinais para ponto, que é aceito por float ou double e após converter (parse) em formato float");
   System.out.println("digite a nota 3: 'com vírgula ou ponto'");
   String nota3 = sc.next();
   nota3 = nota3.replace(',','.');
   float nota3f = Float.parseFloat(nota3); 
   
   float media = (nota  + numero + nota3f)/3;

   if (media >= 6) {
    System.out.println("aprovado!");
   } else if (media >=4 && media <6) {
    System.out.println("em recuperação!");
   } else {
    System.out.println("reprovado!");
   }

}
}

// lê um valor float do usuário
//Scanner sc = new Scanner(System.in);
//float valor = sc.nextFloat();

// converte o valor para uma string e substitui o caractere
//String valorString = String.valueOf(valor);
//valorString = valorString.replace(',', '.');

// converte a string de volta para um float
//float novoValor = Float.parseFloat(valorString);
