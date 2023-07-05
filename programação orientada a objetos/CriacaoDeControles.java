
/*Aqui iremos criar/instanciar objetos trabalhados na classe controlador
 * e controleremoto
 */

public class CriacaoDeControles {
    public static void main(String[] args) {
        ControleRemoto c1 = new ControleRemoto();
        /* é importante verificar a ordem de chamada dos métodos */
        /* Vamos ligar i controle e abrir o menu */
        c1.ligar();
        c1.play();
        c1.abrirMenu();

    }

}
