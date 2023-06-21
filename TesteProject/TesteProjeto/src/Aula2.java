public class Aula2 {
    public static void main(String[] args) {

        int idade = 29;

        if (idade >= 18) {
            System.out.println("Entrada Permitida");
        } else {
            System.out.println("Entrada barrada");
        }

        float peso = 73.4f;

        int altura = 170;

        double imc = peso / (altura / 100 ^ 2);

        System.out.println(imc);

        String muitoAbaixo = "muito abaixo do peso";
        String abaixo = "abaixo do peso";
        String normal = "normal";
        String acima = "sobre peso";
        String muitoAcima = "Muito acima do peso";

        if (imc < 18.5) {
            System.out.println(muitoAbaixo); //println retorna os dados em linhas diferentes, já print, retorna na mesma linha
        } else if (imc <= 24.9) {
            System.out.println(abaixo);
        } else if (imc < 30) {
            System.out.println(normal);
        } else if (imc < 40) {
            System.out.println(acima);
        } else {
            System.out.println(muitoAcima);
        }
    }
}

