
/*Nessa classe criaremos os objetos de canetas3.java */
public class CriarCanetas3 {
    public static void main(String[] args) {
        /*
         * Como o nosso construtor recebe 3 parametros, devemos passar os
         * valores do parametro na instanciação do objeto
         */
        Canetas3 c1 = new Canetas3("nic", "amarelo", 0.9f);

        c1.setModelo("Bic cristal");
        /*
         * O set possibilita que o programador ou
         * o usuário adicione atributos ao objeto
         */
        c1.setPonta(0.5f);
        /*
         * Nesse caso, como a ponta é um atributo privado
         * sem o set, não conseguimos acessa-la
         */
        c1.status();
        System.out.println("-----------------------------------------");
        /* Criação de uma nova caneta */
        Canetas3 c2 = new Canetas3("bic", "vermelho", 0.7f);
        /*
         * Como definimos atributos e métodos que serão padrões, ao chamar
         * o método status ele só ira preencher o que especificamos no
         * construtor
         */
        c2.status();
        System.out.println("-----------------------------------------");

        /*
         * Resumindo, agora basta criar os objetos e passar os parametros, ou
         * seja, basta informar e executar, já que os principais metodos e
         * atributos estão dentro de um método construtor
         */

        Canetas3 c3 = new Canetas3("faber-castel", "verde", 0.5f);
        c3.status();

    }

}
