/*Aqui iremos criar os métodos abstratos, ou seja, da interface */
/*A classe principal sera do tipo interface, que possibilita trabalhar com 
 * abstract
 */
public interface Controlador {

    /*
     * Como vamos trabalhar com classes abstratas, utilizamos o ponto e
     * virgula para fechar o método
     */

    public abstract void ligar();

    public abstract void desligar();

    public abstract void abrirMenu();

    public abstract void fecharMenu();

    public abstract void maisVolume();

    public abstract void menosVolume();

    public abstract void ligarMudo();

    public abstract void desligarMudo();

    public abstract void play();

    public abstract void pause();
}