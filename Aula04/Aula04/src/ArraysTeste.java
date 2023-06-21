import java.util.Arrays;

public class ArraysTeste {

public static void main(String[] args) {
    
//++++++++++++++++++++++++++++++++++++++++++ARRAY UNIDIMENSIONAL++++++++++++++++++++++++++++++++++++++++++
//em java podem ser apontados os arrays um a um...

int[] array = new int[3];
array[0] = 2;
array[1] = 5;
array[2] = 1;

for (int i = 0; i <3; i++)
{
    System.out.println(array[i]);
}
System.out.println("------------------");

//em java também pode ser escrito da seguinte forma...
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i<numeros.length; i++){
System.out.println(numeros[i]);
}
System.out.println("------------------");


//++++++++++++++++++++++++++++++++++++++++++ARRAY BIDIMENSIONAL (MATRIZ)++++++++++++++++++++++++++++++++++++++++++

int[][] bidim = new int[3][4];

//indica as posições da linha 0, valor por valor
bidim[0][0] = 1;
bidim[0][1] = 2;
bidim[0][2] = 3;
bidim[0][3] = 4;

//indica as posições da linha 1

bidim[1][0] = 5;
bidim[1][1] = 6;
bidim[1][2] = 7;
bidim[1][3] = 8;

//indica as posições da linha 2

bidim[2][0] = 9;
bidim[2][1] = 10;
bidim[2][2] = 11;
bidim[2][3] = 12;

//traduzindo os arrays acima, imagine que cada linha é um array e que esse array será iterado elemento por elemento, 
// nesse sentido seria algo como, primeiro pega uma linha, itera cada valor, depois segue pra próxima linha, itera cada valor:
// int[][] bidim ={
//                {1, 2, 3, 4},             
//                {5, 6, 7, 8},
//                {9, 10, 11, 12}};

//++++++++++++MÉTODO FOR

for (int l = 0; l < 3; l++) {         //pega o índice inicial 0 e aplica a próxima função "for" iterando  todos os elementos, depois índice 1...
    for (int c = 0; c < 4; c++) {       //dentro do índice da linha, itera o índice 0 até <4 aplicando em cada loope a função a seguir 
        System.out.println(bidim[l][c] + " ");  //imprime a linha atual e a coluna atual do loop, que no caso é um loop dentr ode outro.
    }                                       //porntanto, pra primeira linha vai iterar l=0 c=0, l=0 c=1, l=0 c=2, l=0 c=3 e segie ára l=1 c= 0...            
    
}
System.out.println("------------------");


//++++++++++++MÉTODO FOREACH

for (int[] linha : bidim) {      // loop "enhanced for" para iterar através de cada linha da matriz bidimensional com nome = "bidim", onde cada linha também é um array, por isso int[] -> sendo que deve escrever int[] porque a variável "linha" ainda não foi declarada no escopo.
    for (int elemento : linha) { // loop "enhanced for" para iterar através de cada elemento da linha atual, onde cada elemento é um inteiro, por isso int. 
        System.out.println(elemento + " "); // imprime o valor do elemento atual, seguido de um espaço em branco
    }
}
//uma forma fácil de decorar esse comando seria para cada linha de bidim e para cada elemento da linha imprima o elemento. de seria igual a ":"
System.out.println("------------------");


//++++++++++++++++++++++NÍVEL HARD, NUNCA ENTENDEREI++++++++++++++++++++++++++

Object[] arrayH = {10, 20, new Object[]{10, 30}, 40, 50, new Object[]{60, new Object[]{70, 80, 90, new Object[]{100, 110}}}}; // note que os arrays internos são do tipo Object

for (Object element : arrayH) {
    if (element instanceof Object[]) {
        Object[] innerArray = (Object[]) element;
        for (Object innerElement : innerArray) {
            if (innerElement instanceof Object[]) {
                Object[] innerInnerArray = (Object[]) innerElement;
                for (Object innerInnerElement : innerInnerArray) {
                    if (innerInnerElement instanceof Object[]) {
                        Object[] innerInnerInnerArray = (Object[]) innerInnerElement;
                        for (Object innerInnerInnerElement : innerInnerInnerArray) {
                            System.out.print(innerInnerInnerElement + " ");
                        }
                    } else {
                        System.out.print(innerInnerElement + " ");
                    }
                }
            } else {
                System.out.print(innerElement + " ");
            }
        }
    } else {
        System.out.print(element + " ");
    }
}
System.out.println();
System.out.println("------------------");

//+++++++++++++++++++++++++++++++++++++A CLASSE ARRAY+++++++++++++++++++++++++++++
//++MÉTODO binarySearch

//Este método faz uma busca em um array por um valor informado e retorna sua posição.



int[] numbers = {2, 5, 8, 3, 9};

System.out.println(Arrays.binarySearch(numbers, 5));

// esse método retorna apenas o índice do elemento procurado no array, se ele for encontrado, ou um valor negativo caso contrário.
// Para verificar se o array possui dois dos elementos procurados, é necessário usar um loop para percorrer o array e contar o número de ocorrências dos elementos procurados
// Percorre o array e conta quantas vezes os elementos procurados aparecem
/*
int[] searchValues = {5, 8}; // valores a serem procurados no array
 for (int value : searchValues) {
    int index = Arrays.binarySearch(numbers, value);
    if (index >= 0) {
        count++;
    }
} */

System.out.println("------------------");

//++MÉTODO copyOf(array, quantidade de elementos copiados)
int[] originalArray = {1, 2, 3, 4, 5};
        int[] copyArray = Arrays.copyOf(originalArray, 3);
        System.out.println("Copy Array: " + Arrays.toString(copyArray));
//Obs: a impressão de Arrays no console é feita usando Arrays.toString(nomeDoArray);

System.out.println("------------------");

//++MÉTODO copyOfRange  - permite escolher as posições a serem copiadas
//” é semelhante ao método “copyOf” com uma diferença, podemos informar um intervalo, uma faixa de valores a serem copiados
//int arrayDestino = Arrays.copyOfRange(array_original, valor_inicial, valor_final);

int[] numerosz = {1, 2, 3, 4, 5};
int[] copiaNumeros = Arrays.copyOfRange(numerosz, 1, 4);

System.out.println(Arrays.toString(numerosz)); // imprime [1, 2, 3, 4, 5]
System.out.println(Arrays.toString(copiaNumeros)); // imprime [2, 3, 4]
 
System.out.println("------------------");

//++MÉTODO Arrays.equals(array1, array2)
//verifica se os arrays são iguais
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};

String ternario = Arrays.equals(array1, array2) ? "Os arrays são iguais." : "Os arrays são diferentes.";
System.out.println(ternario);


System.out.println("------------------");

//++MÉTODO fill() - preencher

int[] numerosA = new int[5];
Arrays.fill(numerosA, 10);
System.out.println(Arrays.toString(numerosA));


System.out.println("------------------");


//++MÉTODO sort()
int[] bagunca = {8, 2, 7, 3, 1, 5};
Arrays.sort(bagunca);
System.out.println(Arrays.toString(bagunca));

System.out.println("------------------");



}
}

