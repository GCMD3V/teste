import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.Calendar;

//Em resumo, enquanto java.util é mais voltado para o tratamento de dados em geral, java.io é voltado para entrada e saída de dados.


public class MyScannerCalendar {

    public static void main(String[] args) throws IOException {
    
        System.out.println("Qual o seu nome?");
        Scanner scan = new Scanner(System.in);
        String imput = scan.next();
        System.out.println("Olá "+ imput);

        System.out.println("------------------");

//+++++++++++++++// Chama o método main da classe ExemploInput

ExemploInput exemplo = new ExemploInput(); 
exemplo.main(args); // no local que você chamar o main da classe nova ela será executada, no nosso caso, está após "--------". 

ExemploCalendar ExemploCalendar = new ExemploCalendar();
ExemploCalendar.main(args);

}

//++++++++++++++++++MÉTODO BufferedReader

//O BufferedReader é geralmente mais eficiente em ler grandes quantidades de dados de entrada (como de um arquivo), enquanto o Scanner é
    //mais conveniente para ler dados formatados (como números ou tokens separados por espaço) a partir de entrada do usuário.
}

//a classe ExemploInput é uma classe pública, uma vez que ela é definida fora do escopo da classe MyScanner e não é especificado o modificador de acesso, o que significa que ela tem o modificador de acesso padrão, que é público. Isso permite que ela seja acessada a partir de qualquer outro arquivo no mesmo pacote.
class ExemploInput { //Se você escrever public class ExemploInput em vez de class ExemploInput no código apresentado, o compilador irá gerar um erro de compilação. Isso ocorre porque, como a classe MyScanner já é uma classe pública e está definida em um arquivo com o mesmo nome, somente pode haver uma classe pública com o mesmo nome em um único arquivo. 

    public static void main(String[] args) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // O InputStreamReader é usado para transformar a entrada do sistema em caracteres legíveis pelo Java, permitindo que o BufferedReader leia as informações inseridas pelo usuário a partir do console.

        System.out.print("Digite um número inteiro: ");
        String input = reader.readLine(); // Lê uma linha de texto do usuário
        int numero = Integer.parseInt(input); // Converte a String lida para inteiro

        System.out.println("O número digitado foi: " + numero);
        System.out.println("------------------");

    }
}

/*
readLine(): Lê uma linha de texto da entrada e retorna uma String.
read() e read(char[] cbuf, int offset, int length): Lê um único caractere ou um bloco de caracteres da entrada e retorna o caractere lido ou o número de caracteres lidos.
skip(long n): Pula os próximos n caracteres na entrada.
ready(): Verifica se há dados disponíveis para leitura na entrada.
mark(int readAheadLimit) e reset(): Usados ​​para marcar uma posição na entrada e retornar a ela posteriormente.
close(): Fecha o fluxo de entrada e libera os recursos associados a ele.
 */



//+++++++++++++++++CLASSE CALENDÁRIO    
//A classe Calendar substitui a classe Date, este classe possui métodos interessantes para trabalharmos com datas e horas em nossos programas.
  

    class ExemploCalendar {
    
        public static void main(String[] args) {
    
            // Cria uma instância da classe Calendar e a inicializa com a data/hora atual
            Calendar dataLocal = Calendar.getInstance(); //Ao tentar criar uma instância de Calendar usando new Calendar(), ocorrerá um erro de compilação informando que a classe Calendar é abstrata e não pode ser instanciada diretamente.
    
            // Retorna o ano atual
            int ano = dataLocal.get(Calendar.YEAR);
            System.out.println("Ano: " + ano);
    
            // Retorna o mês atual (vale lembrar que o mês é indexado em 0, ou seja, janeiro é representado pelo valor 0)
            int mes = dataLocal.get(Calendar.MONTH);
            System.out.println("Mês: " + (mes + 1)); //mês +1, pois retorna janeiro como "0";
    
            // Retorna o dia do mês atual
            int dia = dataLocal.get(Calendar.DAY_OF_MONTH);
            System.out.println("Dia: " + dia);
    
            // Retorna a hora atual
            int hora = dataLocal.get(Calendar.HOUR_OF_DAY);
            System.out.println("Hora: " + hora);
    
            // Retorna o minuto atual
            int minuto = dataLocal.get(Calendar.MINUTE);
            System.out.println("Minuto: " + minuto);
    
            // Retorna o segundo atual
            int segundo = dataLocal.get(Calendar.SECOND);
            System.out.println("Segundo: " + segundo);
    
            // Retorna o milissegundo atual
            int milissegundo = dataLocal.get(Calendar.MILLISECOND);
            System.out.println("Milissegundo: " + milissegundo);
    
            // Retorna o dia da semana atual (vale lembrar que o dia da semana é indexado em 1, ou seja, domingo é representado pelo valor 1)
            int diaDaSemana = dataLocal.get(Calendar.DAY_OF_WEEK); //array 0 é null
            System.out.println("Dia da semana: " + diaDaSemana);
    
            // Retorna o número de dias do mês atual
            int diasNoMes = dataLocal.getActualMaximum(Calendar.DAY_OF_MONTH);
            System.out.println("Dias no mês: " + diasNoMes);

            //Essas constantes são usadas em conjunto com o campo HOUR_OF_DAY para representar a hora no formato de 12 horas (com AM ou PM). Por exemplo:
            System.out.println("Hora: "+ dataLocal.get(Calendar.HOUR) + ", Formato HOUR: " + dataLocal.get(Calendar.AM_PM));// se AM retorna 0, se PM retorna 1
        
//+++COMO MANIPULAR AS HORAS 
//usando add
            dataLocal.add(Calendar.HOUR_OF_DAY, -3); // subtrai 3 horas
            dataLocal.add(Calendar.MINUTE, -30); // subtrai 30 minutos
            int horario = dataLocal.get(Calendar.HOUR_OF_DAY); 
            System.out.println("Hora atual menos 3 horas e 30 minutos: " + horario);

//Usando Set
            dataLocal.set(Calendar.HOUR_OF_DAY, dataLocal.get(Calendar.HOUR_OF_DAY) - 3); // subtrai 3 horas
            dataLocal.set(Calendar.MINUTE, dataLocal.get(Calendar.MINUTE) - 30); // subtrai 30 minutos
            int setHora = dataLocal.get(Calendar.HOUR_OF_DAY);
            System.out.println("Hora atual menos 3 horas e 30 minutos: " + setHora);

//exemplo prático
        
String mensagem = String.format("Goiânia, %d/%d/%d %d:%d:%d.", dia, (mes+1), ano, hora, minuto, segundo);
System.out.println(mensagem);
}
    }

//    lista dos principais especificadores de formato em Java:
/* 
%d: formata um valor inteiro, pode ser usado com opções de largura mínima e sinal.
%f: formata um valor de ponto flutuante, pode ser usado com opções de largura mínima, precisão, sinal e notação científica.
%s: formata uma string.
%c: formata um caractere.
%b: formata um valor booleano.
%t: formata uma data e/ou hora, pode ser usado com vários subespecificadores, como %tY para o ano, %tm para o mês, %td para o dia, %tH para a hora, %tM para o minuto, %tS para o segundo, entre outros.
%n: insere uma quebra de linha.
Além disso, você pode usar opções de formatação para controlar a largura mínima, precisão, alinhamento, preenchimento, sinal, entre outras características da formatação. Aqui estão alguns exemplos de opções de formatação:

%10d: especifica uma largura mínima de 10 caracteres para o valor inteiro, preenchendo com espaços à esquerda, se necessário.
%-10s: especifica uma largura mínima de 10 caracteres para a string, alinhando à esquerda e preenchendo com espaços à direita, se necessário.
%.3f: especifica uma precisão de 3 dígitos após o ponto decimal para o valor de ponto flutuante. 

%e ou %E: formata um valor de ponto flutuante usando a notação científica.
%g ou %G: formata um valor de ponto flutuante usando a notação científica, a menos que a precisão especificada seja maior do que necessária, nesse caso usa a notação decimal normal.
%o: formata um valor inteiro como octal.
%x ou %X: formata um valor inteiro como hexadecimal.
%h: formata um valor como um identificador de objeto.
%a: formata um valor como uma representação hexadecimal de ponto flutuante em notação de ponto flutuante hexadecimal IEEE 754.
%S: formata uma string em letras maiúsculas.
%t: formata uma data e/ou hora usando o formato padrão da localidade atual.

    */

