import javax.sound.sampled.SourceDataLine;
import java.util.Scanner;

/* A estrutura básica de uma classe Java é:
Declaração da classe.
Declaração de atributos.
Declaração de métodos.
O método main (ponto de entrada).

Seguindo essa ordem, o código é estruturado corretamente e não ocorrerá erro de compilação. No seu exemplo, a declaração do método main
está no local adequado, após a definição dos atributos e métodos da classe.
 */
public class Aluno {

    private String nome;
    public int quantidadeQuestoes;
    public int nota;

    public String getNome(){
        return nome;
    }


    public void setNome(String name){
         this.nome = name;
    }


public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
System.out.println("Qual o seu nome? ");
String name = scan.next();
scan.close();


Aluno aluno26 = new Aluno();

aluno26.setNome(name);
aluno26.quantidadeQuestoes = 3;
aluno26.nota = 100;


System.out.println("O aluno " + aluno26.getNome() + " tirou " + aluno26.nota + " na atividade, acertando as " + aluno26.quantidadeQuestoes + " questões.");


}
}
// Dessa forma, é possível passar valores entre métodos na mesma classe, desde que esses métodos compartilhem o mesmo escopo 
// (no caso, o escopo da classe Aluno).







