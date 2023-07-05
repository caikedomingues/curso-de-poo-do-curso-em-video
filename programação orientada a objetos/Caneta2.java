public class Caneta2 {
    /*
     * Aqui criaremos os metodos e atributos do objeto caneta e cria-las
     * na classe CriarCanetas2.java
     */

    public String modelo;
    public String cor;
    private float ponta;
    protected boolean tampada;
    protected int carga;

    public void rabiscar() {
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
    protected void tampar() {
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

    protected void destampar() {
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
