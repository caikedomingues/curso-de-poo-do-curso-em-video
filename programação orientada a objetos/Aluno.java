public class Aluno extends Pessoa {
    /* Atributos */
    private int mat;
    private String curso;

    /* getters e setters */

    public void setMat(int m) {

        this.mat = m;
    }

    public int getMat() {

        return this.mat;
    }

    public void setCurso(String c) {

        this.curso = c;
    }

    public String getCurso() {

        return this.curso;
    }

    /* Método */

    public void cancelaMatricula() {

        System.out.println("a matricula será cancelada");
    }

    public void imprimirAluno() {

        System.out.println("Curso: " + getCurso());
        System.out.println("Matricula: " + getMat());
    }

}
