public class RTeste {
    public static void main(String[] args) {

    }

    static class Animal {
        String nome;
        int idade;
        Animal(String name, int idadeZ) {
            this.nome = name;
            this.idade = idadeZ;
        }
    }

    static class Cachorro extends Animal {
        String raca;

        Cachorro(String nameC, String raca, int idadeC) {
            super(nameC, idadeC); // Chama o construtor da superclasse Animal e passa a variável C para ele 
            this.raca = raca;
           
        }
    }

    static class Exemplo {
        public static void main(String[] args) {
            Cachorro cachorro = new Cachorro("Max", "Labrador", 9);
            System.out.println("Nome: " + cachorro.nome); // Output: Nome: Max
            System.out.println("Raça: " + cachorro.raca); // Output: Raça: Labrador
            System.out.println("Raça: " + cachorro.idade); // Output: idade: 9

        }
    }
}

// Sim, ao chamar o construtor da classe pai usando super(), você precisa passar os argumentos na ordem correta, conforme definido na assinatura do construtor da classe pai. Os argumentos devem ser fornecidos na mesma ordem em que são declarados no construtor da classe pai.

// No exemplo que mencionei anteriormente, o construtor da classe "Animal" foi definido como Animal(String name, int idade). Ao chamar super(nameC, idadeC) no construtor da classe "Cachorro", os argumentos devem ser fornecidos na ordem correta, ou seja, primeiro o nome (nameC) e depois a idade (idadeC).

// Dessa forma, a ordem dos argumentos fornecidos para super() deve corresponder à ordem em que eles são definidos no construtor da classe pai. Certifique-se de seguir a mesma ordem ao passar os argumentos para super() para garantir a correspondência correta entre os parâmetros e os campos da classe pai.
