public class Aula10 {
    public static void main(String[] args) throws Exception {

        

        String[] nomes = new  String[5];

        nomes[1] = "Jeffin";
        nomes[2] = "Kleuton";

        System.out.println(nomes[1]);

        String teste = "frase para teste";

        String[] splitar = teste.split(" ");

        System.out.println(splitar[1]);
        System.out.println(splitar.length);
        System.out.println(teste.charAt(4));


        // FOREACH

        String[] veiculos = {"carro", "moto", "bicicleta", "avião"};


        for (String v : veiculos) {
            System.out.println(v);
        }

        for (String v : veiculos) {
            if(v == veiculos[3]){

            System.out.println(v + " voa");
            } else {
            System.out.println(v + " não voa");
            }
        }
    }
    }

