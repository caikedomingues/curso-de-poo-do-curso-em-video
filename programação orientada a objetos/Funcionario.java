public class Funcionario extends Pessoa {

    /* atributos */
    private String setor;
    private boolean trabalhando;

    /* getters e setters */

    public void setSetor(String s) {

        this.setor = s;
    }

    public String getSetor() {

        return this.setor;
    }

    public void setTrabalhando(boolean t) {

        this.trabalhando = t;
    }

    public boolean getTrabalhando() {

        return this.trabalhando;
    }

    /* Esse método ira verificar se ele esta ou não trabalhando */
    public void mudarTrabalho() {
        /*
         * Se o método for chamado a variável trabalhando ira receber o
         * oposto do valor da própria variável
         */
        this.trabalhando = !this.trabalhando;
    }

    public void imprimirFuncionario() {

        System.out.println("Setor: " + getSetor());
        System.out.println("Trabalhando: " + getTrabalhando());
    }

}
