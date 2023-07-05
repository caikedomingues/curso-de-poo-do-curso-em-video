/*Aqui vamos criar os objetos, atribuir atributos e criar métodos da classe
 * Caneta2
 */
public class CriarCanetas2 {

    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        /*
         * ´Para iniciar os testes vamos criar o atributo modelo que é publico
         * para que o programa possa executar normalmente
         */
        c1.modelo = "Bic cristal";// Atributo publico
        c1.cor = "Azul";// atributo público
        c1.carga = 80;// Atributo protegido
        c1.tampada = false;// protegido
        c1.rabiscar();// método publico
        c1.status();// Atributo publico

    }

}
