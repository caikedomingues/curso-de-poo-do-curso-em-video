public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {

        System.out.println("Som de cachorro");

    }

    /*
     * Aqui vamos trabalhar o conceito de sobrecarga, que é quando utilizamos
     * o mesmo método em uma classe com assinaturas diferentes. vale lembrar
     * que o método não pode ter assinaturas repetidas
     */

    public void reagir(String frase) {

        if (frase.equals("toma comida") || frase.equals("olá")) {

            System.out.println("Abanar e latir");
        } else {

            System.out.println("Rosnar");
        }

    }

    public void reagir(int hora, int min) {

        if (hora < 12) {

            System.out.println("Abanar");
        } else if (hora >= 18) {

            System.out.println("ignorar");
        } else {
            System.out.println("Abanar e latir");
        }
    }

    public void reagir(boolean dono) {

        if (dono == true) {

            System.out.println("Abanar");
        } else {

            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) {

        if (idade < 5) {

            if (peso < 10) {

                System.out.println("abanar");
            }
        } else {

            System.out.println("latir");
        }

        if (peso < 10) {

            System.out.println("Rosnar");
        } else {
            System.out.println("Ignorar");
        }

    }
}
