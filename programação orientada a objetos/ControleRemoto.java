
/*Aqui criaremos os atributos e métodos do controle remoto que implementa
 * a classe controlador
 */
public class ControleRemoto implements Controlador {
    /* Atributos */
    private int volume;
    private boolean ligado;
    private boolean tocando;

    /* Método construtor */
    public ControleRemoto() {
        /* Configurações padrões do controle */
        this.volume = 50;// O volume iniciara no 50
        this.ligado = false;// por padrão ele estara ligado
        this.tocando = false;// por padrão não estará tocando
    }

    /* Getters e setters */

    private int setVolume(int v) {

        return this.volume = v;
    }

    private int getVolume() {
        return this.volume;
    }

    private boolean setLigado(boolean l) {

        return this.ligado = l;
    }

    private boolean getLigado() {

        return this.ligado;
    }

    private boolean setTocando(boolean t) {

        return this.tocando = t;
    }

    private boolean getTocando() {

        return this.tocando;
    }

    /*
     * Criação dos métodos da classe controlador, o override, significa
     * sobre escrever, ou seja, pegamos os métodos abstratos e sobre
     * escrevemos ele aqui, na classe controleremoto.
     */

    /*
     * No método responsável por fazer o controle ligar, colocaremos
     * a funçao setLigado do tipo boolean receber verdadeiro
     */
    @Override
    public void ligar() {

        this.setLigado(true);
    }

    /*
     * No desligar temos que fazer o inverso, temos que atribuir ao ligado
     * falso
     */
    @Override
    public void desligar() {

        this.setLigado(false);

    }

    /*
     * O método volume irá conter algumas informações e poderá controlar
     * o volume da televisão
     */
    @Override
    public void abrirMenu() {
        /* Ira mostrar se a televisão está ligada */
        System.out.println("Esta ligado? " + this.getLigado());
        /* Ira mostrar se esta tocando */
        System.out.println("Esta tocando? " + this.getTocando());
        /* Ira mostrar o volume da televisão */
        System.out.print("Volume: " + this.getVolume());
        /*
         * Agora vaos criar um for que terá como função controlar o volume
         * da televisão, tendo como altura máxima o volume 10
         */
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");

        }
    }

    /*
     * Nesse método iremos trabalhar a mensagem que sinaliza que o menu foi
     * fechado
     */
    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    /* Será responsável por aumentar a televisao */
    @Override
    public void maisVolume() {
        /*
         * Antes de executar a ação ele ira verificar se a televisão está
         * ligada
         */
        if (this.getLigado()) {

            this.setVolume(this.getVolume() + 5);

        } else {
            System.out.println("Impossivel aumentar o volume, tv desligada");
        }
    }

    /* Será responsável por diminuir o volume */
    @Override
    public void menosVolume() {
        /*
         * ANtes de executar a ação ele ira verificar se a televisão está
         * ligada
         */
        if (this.getLigado()) {

            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("Impossivel diminuir o volume, tv desligada");
        }

    }

    /* Será responsável por deixar o volume mudo */
    @Override
    public void ligarMudo() {
        /*
         * Antes de executar a ação, ele irá verificar se a televisão
         * está ligada e o volume maior que zero, caso a condição esteja
         * verdadeira, o volume ira receber o valor 0.
         */
        if (this.getLigado() && this.getVolume() > 0) {

            this.setVolume(0);
        } else {
            System.out.println("O mudo já está ligado");
        }
    }

    /* Será responsável por desabilitar o mudo */
    @Override
    public void desligarMudo() {
        /*
         * Ele ira verificar se esta ligado e se o volume é igual a 0,
         * se essa condição for verdadeira, o setVolume ira receber 50
         * que é o valor padrão do volume, desabilitando o mudo.
         */
        if (this.getLigado() && this.getVolume() == 0) {

            this.setVolume(50);
        } else {
            System.out.println("O mudo já está desligado");
        }

    }

    /* responsável por iniciar o conteudo da tv */
    @Override
    public void play() {
        /*
         * Vai verificar se a tv esta ligada e se o conteudo não esta tocando,
         * caso essa condição seja verdadeira, o setTocando passara a ser
         * verdadeiro
         */
        if (this.getLigado() && !this.getTocando()) {
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }

    }

    /* Responsável por pausar o conteúdo */
    @Override
    public void pause() {
        /*
         * Ira verificar se a televisão está ligada e tocando o conteudo,
         * se essa condição for verdadeira, o setTocando recebe falso e o
         * conteúdo é pausado
         */
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }

}
