import java.util.Random;

public class Randomicos {



  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++MÉTODO COMO OBJETO DA CLASSE RANDOM++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    public static void main(String[] args) {
        Random rand = new Random();// A semente (seed) é um valor numérico usado para inicializar um gerador de números aleatórios. Quando um gerador de números
                                  // aleatórios é inicializado com uma semente específica, ele produzirá sempre a mesma sequência de números aleatórios.

           
        for (int cont = 0; cont < 10; cont++) {

            System.out.println(rand.nextInt(30));//Número máximo - vai retornar entre 0 e 29

//++++MULTIPLICA o DLOUBLE POR 100, DEPOIS ARREDONDA, DEPOIS DIVIDE O QUE FOI ARREDONDADO POR 100 PARA IMPRIMIR DUAS CASAS DECIMAIS... QUANTOS 0 COLOCAR SERÃO AS CASAS DECIMAIS.
            double randomDouble = Math.round(rand.nextDouble(10)* 100.0) / 100.0; //Número máximo - vai retornar entre 0 e 10
            System.out.println(randomDouble);

/*Quando multiplica o Double por 100 ou 1000, o número por exemplo 6.54321 passa a valer 654.321.
Quando usa o round, corta o 0.321 e vira 654.0
Quando divide de novo por 100, passa. A valer 6.54.
Se quiser um randômico entre 10 e 20... Deve somar o random com 10, por exemplo.
*/
            }

  //++++++++++++++++++++++++++++++++++++++++++++++++++++++++MÉTODO MATEMÁTICO++++++++++++++++++++++++++++++++++++++++++++++++++++++++          

        for (int cont = 0; cont <= 10; cont++) { 

            double doubleRandomMetod =  Math.random() * 10;  //Resultado nativo da class Math é um double  ex: 4.443050490441301
            float floatCasasDecimaisFormat = (float) (Math.round(Math.random() * 2000) / 100.0);//Permite incluir casas decimais ex: 20.22 //ROUND É USADO PARA ARREDONDAR
            int castingRandomMetod = (int) Math.round(Math.random() * 10);//Converte o resultado do tipo double em int e arredonda.


           
          System.out.println(castingRandomMetod);
       //   System.out.println(floatCasasDecimaisFormat);
        }
  }
}
    
/* 
(int) => Nesse caso, estamos usando o casting para converter o valor retornado pelo método Math.round(), que é um valor em ponto flutuante do 
tipo double, em um valor do tipo inteiro int. Isso é necessário porque a variável "randomMétod" foi declarada como um inteiro, e o valor 
retornado pelo método Math.round() é um valor em ponto flutuante. 
*/


