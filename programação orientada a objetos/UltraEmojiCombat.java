
/*Nessa classe criaremos os objetos que foram trabalhados na classe 
 * lutador
 */
public class UltraEmojiCombat {
    public static void main(String[] args) {

        /* instanciação/criação do objeto lutador */
        /* Observação é um construtot com parametro */
        Lutador l1 = new Lutador("pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        l1.apresentar();
        l1.status();
        System.out.println("--------------------------------------------------------------------------");
        /* Vamos criar os objetos utilizando vetores, que tera 6 espaços */

        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Pretty boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);

        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);

        l[4] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);

        l[5] = new Lutador("UFOcobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);

        /*
         * Agora que ja criamos 0s 6 lutadores, podemos analisar o status e a
         * apresentação de cada um deles
         */

        /*
         * Criação das lutas entre os lutadores. Vale lembrar que
         * ele ira criar objetos da classe Luta.java
         */

        Luta uec01 = new Luta();

        uec01.marcarLuta(l[0], l[1]);
        uec01.lutar();

        Luta uec02 = new Luta();

        uec02.marcarLuta(l[0], l[1]);
        uec02.lutar();
        System.out.println("---------------------");
        l[0].status();
        l[1].status();

    }

}
