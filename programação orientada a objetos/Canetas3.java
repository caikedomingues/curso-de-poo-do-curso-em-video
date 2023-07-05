/*Criação de atributos e métodos da canetas3.java */

public class Canetas3 {

    private String modelo;// Ira receber o modelo da caneta
    private String cor;// Ira receber a cor da caneta
    private float ponta;// Ira receber o "calibre" da ponta da caneta
    private boolean tampada;/*
                             * Ira receber o estado atual da caneta, ou
                             * seja,
                             */

    /*
     * Criação de um método construtor, esses métodos servem para
     * atribuir caracteristicas padrões do objeto. Observação: O nome
     * do construtor sempre deve ser igual ao nome da classe. Ele ira
     * receber 3 parametros
     */
    public Canetas3(String m, String c, float p) {
        /*
         * O que estiver aqui dentro será as caracteristicas padrões do
         * objeto
         */
        // Chamada do método tampar
        this.tampar();
        this.modelo = m;
        this.ponta = p;
        this.cor = c;

    }

    public String getModelo(String modelo) {

        return this.modelo;
    }

    public void setModelo(String m) {

        this.modelo = m;

    }

    public float getPonta(float ponta) {

        return this.ponta;

    }

    public void setPonta(float p) {

        this.ponta = p;

    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    /*
     * Método que ira imprimir os resultados dos metodos e atributos da
     * caneta
     */
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);

    }

}
