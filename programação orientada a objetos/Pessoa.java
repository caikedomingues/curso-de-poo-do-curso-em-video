public class Pessoa {

    /* Atributos */
    private String nome;
    private int idade;
    private String sexo;

    /* método principal */
    public static void main(String[] args) {

        /* Instanciação/criação de objetos */
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        /* Atribuição de valores aos objetos */
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        p1.setIdade(10);
        p2.setIdade(33);
        p3.setIdade(49);
        p4.setIdade(50);

        p1.setSexo("Masculino");
        p2.setSexo("feminino");
        p3.setSexo("Masculino");
        p4.setSexo("Feminino");
        /*
         * É necessário a criação de um método para impressão dos
         * resultados
         */

        /* metodos */
        p1.imprimirResultado();
        p2.imprimirResultado();
        p3.imprimirResultado();
        p4.imprimirResultado();

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        p2.imprimirAluno();
        p3.imprimirProfessor();
        p4.imprimirFuncionario();
    }

    /* Getters e setters */

    public void setNome(String n) {

        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setIdade(int i) {

        this.idade = i;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setSexo(String s) {

        this.sexo = s;
    }

    public String getSexo() {

        return this.sexo;
    }

    /* Metodos */
    public void fazerAniversario() {
        this.idade++;
    }

    public void imprimirResultado() {

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
    }
}
