public class Construtor {

    
    public static class Pessoa {
        String nome;
        int idade;
        String profissao;

        public Pessoa(String pnome, int pidade, String pprofissao) {
            this.nome = pnome;
            this.idade = pidade;
            this.profissao = pprofissao;
        }

        public void andar() {
            System.out.println(this.nome +", " + this.idade + " anos, andou");
        }

        void getNome(){
        System.out.println(nome);   

        }
        public int getIdade() {
            return idade;
        }

        public int somar(int a, int b) { //SOBRECARGA DE METODOS

            return a + b;
        }
        
        public double somar(double a, double b) { //SOBRECARGA DE METODOS

            return a + b;
        }



    }
//SOBRECARGA DE METODOS
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 10, "marceneiro");
        p1.andar();
        int idade = p1.getIdade();
        p1.getNome();
        System.out.println(idade);

        System.out.println(p1.somar(5, idade));  
        


    }
}
