public class Professor extends Pessoa {
    /* Atributos */
    private String especialidade;
    private float salario;

    /* getters e setters */

    public void setEspecialidade(String e) {

        this.especialidade = e;
    }

    public String getEspecialidade() {

        return this.especialidade;
    }

    public void setSalario(float s) {

        this.salario = s;
    }

    public float getSalario() {

        return this.salario;
    }

    public void receberAum() {

    }

    public void imprimirProfessor() {

        System.out.println("Especialidade: " + getEspecialidade());
        System.out.println("Salario do professor: " + getSalario());
    }

}
