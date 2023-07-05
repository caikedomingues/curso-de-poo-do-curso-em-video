
/*Classe que irá criar as configurações das lutas entre os lutadores */

/*Regras da luta
 * 
 * Só pode ser marcada entre lutadores da mesma categoria.
 * 
 * Desafiado e desafiante devem ser lutadores diferentes
 * 
 * Só pode acontecer se estiver aprovada
 * 
 * só pode ter como resultado a vitória de um dos lutadores ou um
 * empate.
 */

import java.util.Random;

public class Luta {
    /*
     * Nesse caso, temos uma classe instanciada, ou seja a variável,
     * desafiado é do "tipo" Lutador.
     */
    /* Atributos */
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    /* getters e setters */
    public void setDesafiado(Lutador d) {
        this.desafiado = d;
    }

    public Lutador getDesafiado() {

        return this.desafiado;
    }

    public void setDesafiante(Lutador de) {
        this.desafiante = de;
    }

    public Lutador getDesafiante() {

        return this.desafiante;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public int getRounds() {

        return this.rounds;
    }

    public void setAprovada(boolean a) {

        this.aprovada = a;
    }

    public boolean getAprovada() {

        return this.aprovada;
    }

    /* Métodos */

    /*
     * Vamos criar o método marcar luta que sera do tipo void, e recebera
     * 2 parametros do tipo Lutador
     */
    public void marcarLuta(Lutador l1, Lutador l2) {

        /*
         * Agora vamos criar uma estrtura qe ira verificar se uma luta pode ou
         * não ocorrer
         */
        /*
         * Como l1 e l2 são do tipo lutador, conseguimos através deles,
         * acessar os métodos da classe lutador
         */
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {

            /*
             * Se essa condição for verdadeira, a variável aprovada irá
             * receber o valor true(verdadeiro) e o desafiado sempre será
             * o l1, ja o desafiante sempre será o l2.
             */
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            /*
             * Se a condição não for satisfeita, a variável aprovada se
             * tornara falsa e tanto desafiado quanto desafiante serão
             * nulos.
             */

            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;

        }

    }

    public void lutar() {
        /*
         * Aqui vamos criar o combate dos lutadores, antes de iniciarmos
         * a luta devemos verificar se ela esta ou não aprovada
         */

        if (this.aprovada) {
            /* Se a luta estiver aprovada, vamos apresentar os 2 lutadores */
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            /*
             * Vamos criar os possiveis casos que podem ocorrer em uma
             * luta utilizando o gerador de valores aleatórios random
             */

            Random aleatorio = new Random();
            /*
             * Agora vamos criar a vari´pavel do tipo inteiro vencedor
             * que podera receber até 3 resultados. 0 1 2
             */
            int vencedor = aleatorio.nextInt(3);

            /* Agora vamos usar o método switch para verificar o resultado */
            switch (vencedor) {

                case 0: // empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1: // Desafiado ganhou
                    System.out.println("O lutador " + this.desafiado.getNome() + " venceu a luta");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2: // Desafiante ganhou
                    System.out.println("O lutador " + this.desafiante.getNome() + " venceu a luta");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
            }
        } else {
            /* Caso a luta não esteja aprovada */
            System.out.println("Essa luta não deve acontecer");
        }

    }
}
