
/*Nessa classe iremos criar os nossos objetos */
public class CriarCanetas {
    public static void main(String[] args) {
        /* Instanciação do objeto */
        Caneta c1 = new Caneta();
        /* Agora vamos adicionar as caracteristicas da caneta */
        /*
         * Nesse momento a nossa caneta é azul, a ponta é 0.5 e esta
         * destamapda
         */
        c1.cor = "Azul";// Atributo
        c1.ponta = 0.5f;// Atributo
        c1.tampar();// método
        c1.destampar();// método
        c1.status();// método
        c1.rabiscar();// método
        System.out.println("---------------------------------------------");
        /* Vamos instanciar uma segunda caneta */

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "vermelho";
        c2.ponta = 0.6f;
        c2.destampar();
        c2.status();
        c2.rabiscar();

    }
}
