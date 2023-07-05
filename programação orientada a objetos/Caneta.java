
/*Nessa primeira  aula, vamos aprender a criar classes e objeto. O nosso
primeiro objeto será uma caneta
 */
/*Nessa classe trabalharemos os objetos e o instanciaremos na classe
 * CriarCanetas.java.
 */
public class Caneta {

    /* Criação das caracteristicas do objeto */
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    /* Criação do método responsável por fazer a caneta escrever algo */

    void rabiscar() {
        /*
         * Vamos verificar se a caneta esta tampada, caso a condição
         * seja verdadeira ele ira dar erro, senão ele irá escrever algo
         */
        if (tampada == true) {
            System.out.println("Erro");
        } else {
            System.out.println("Rabisco");
        }
        /* Retorno do método com o reultado final. */

    }

    /* Método responsável por tampar a caneta */
    void tampar() {
        /*
         * Nesse método nós iremos atribuir o valor verdadeiro para poder
         * tampar a nossa caneta
         */
        tampada = true;

    }

    /*
     * Método que mostrara o status da caneta, o this significa auto
     * referência, talvez usaremos o this para utilizar os atributos
     * dentro dos métodos.
     */

    void destampar() {
        tampada = false;

    }

    void status() {
        System.out.println("modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("ponta " + this.ponta);
        System.out.println("carga " + this.carga);
        System.out.println("Esta tampada ? " + this.tampada);

    }
}
