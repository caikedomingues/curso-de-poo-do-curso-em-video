public class Lutador {
    /* Atributos */
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    /* Método construtor */

    public Lutador(String n, String na, int i, float a, float p, int v, int d, int e) {

        this.nome = n;
        this.nacionalidade = na;
        this.idade = i;
        this.altura = a;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }

    /* getters e setters */
    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {

        return this.nome;

    }

    public void setNacionalidade(String na) {

        this.nacionalidade = na;
    }

    public String getNacionalidade() {

        return this.nacionalidade;
    }

    public void setIdade(int i) {

        this.idade = i;
    }

    public int getIdade() {

        return this.idade;
    }

    public void setAltura(float a) {

        this.altura = a;
    }

    public float getAltura() {

        return this.altura;
    }

    public void setPeso(float p) {

        this.peso = p;
        this.setCategoria();
    }

    public float getPeso() {

        return this.peso;
    }

    public void setCategoria() {
        /* Tera sua chamada dentro do construtor */
        if (this.peso < 52.2) {
            this.categoria = "inválido";
        } else if (this.peso <= 70) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";
        } else {

            this.categoria = "Inválido";
        }
    }

    public String getCategoria() {

        return this.categoria;
    }

    public void setVitorias(int v) {

        this.vitorias = v;
    }

    public int getVitorias() {

        return this.vitorias;
    }

    public void setDerrotas(int d) {

        this.derrotas = d;
    }

    public int getDerrotas() {

        return this.derrotas;
    }

    public void setEmpates(int e) {

        this.empates = e;
    }

    public int getEmpates() {

        return this.empates;
    }

    /* Métodos */
    public void apresentar() {

        /* Ira conter informações sobre o lutador */
        System.out.println("------------------------------------------");
        System.out.println("CHEGOU A HORA! apresentamos o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + "anos e " + this.peso);
        System.out.println("pesando " + this.getPeso());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");

    }

    public void status() {

        /* Ira conter a situação atual do lutador */
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("empatou " + this.getEmpates() + " vezes");

    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);

    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}