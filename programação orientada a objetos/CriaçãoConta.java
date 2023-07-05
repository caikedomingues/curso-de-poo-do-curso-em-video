/*Nessa classe, vamos criar as contas que trabalhamos na classe ContaBanco
 * 
 */

/*
 numConta
 tipo
 dono
 saldo
 status
 estado atual
 */

public class CriaçãoConta {

    public static void main(String[] args) {
        /* Criação dos objetos (contas) */
        ContaBanco p1 = new ContaBanco();
        /* Criação da conta do jubileu */
        p1.setnumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        System.out.println("---------------------------------------");
        /* Criação da conta da cleusa */
        ContaBanco p2 = new ContaBanco();

        p2.setnumConta(2222);
        p2.setDono("Cleusa");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();

    }

}
