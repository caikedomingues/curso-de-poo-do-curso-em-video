public class Mamifero extends Animal {

    protected String corPelo;

    /*
     * Como a classe mamifero herda de animal que é uma classe
     * abstrata, somos obrigados a sobrepor os métodos de animal na
     * classe que estamos trabalhando
     */
    @Override
    public void emitirSom() {

        System.out.println("Som de mamifero");
    }

}
