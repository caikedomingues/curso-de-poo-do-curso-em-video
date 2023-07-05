public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int membros;

    public static void main(String[] args) {

        /* Instanciação de objetos */

        Mamifero m1 = new Mamifero();
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();

        m1.emitirSom();
        l1.emitirSom();
        c1.emitirSom();
        /* Vamos testar/chamar os métodos de reação */
        c1.reagir("olá");
        c1.reagir("vai apanhar");
        c1.reagir(11, 45);
        c1.reagir(19, 00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5f);
        c1.reagir(17, 4.5f);
    }

    /* Vamos criar o metodo abstrato de emitir sons */

    public abstract void emitirSom();

}