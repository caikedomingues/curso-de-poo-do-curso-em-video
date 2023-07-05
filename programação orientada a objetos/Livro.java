
/*Para implementar os elementos de livro em publicação daremos um implements
 * nessa classe
 */

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; // leitor será uma classe de pessoas

    /* Metodo construtor */

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {

        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.aberto = false;/*
                             * Por padrão o livro permanece fechado até o
                             * usuário abri-lo
                             */
        this.pagAtual = 0;// A página atual recebe 0 até que o usuário comece
        // a folhear o livro

    }

    /* getters e setters */
    public void setTitulo(String t) {

        this.titulo = t;
    }

    public String getTitulo() {

        return this.titulo;
    }

    public void setAutor(String a) {

        this.autor = a;
    }

    public String getAutor() {

        return this.autor;
    }

    public void setTotPaginas(int tot) {

        this.totPaginas = tot;
    }

    public int getTotPaginas() {

        return this.totPaginas;
    }

    public void setPagAtual(int p) {

        this.pagAtual = p;
    }

    public int getPagAtual() {

        return this.pagAtual;
    }

    public void setAberto(boolean ab) {

        this.aberto = ab;
    }

    public boolean getAberto() {

        return this.aberto;
    }

    public void setLeitor(Pessoa l) {

        this.leitor = l;
    }

    public Pessoa getLeitor() {

        return this.leitor;
    }

    public String detalhes() {

        return "Livro{" + "titulo = " + this.titulo + " , autor = " + this.autor + ", totPaginas = " + this.totPaginas
                + ", pagAtual = " + this.pagAtual + ", aberto = " + this.aberto +
                ", leitor = " + this.leitor + " }";
    }

    /*
     * Métodos abstratos: é necessário cria-los para realizar o
     * funcionamento da implementação
     */

    @Override
    public void abrir() {
        /*
         * Para abrir o livro, devemos mudar o status da variavel aberto de
         * falso para verdadeiro
         */
        this.aberto = true;

    }

    @Override
    public void fechar() {
        /* Para fechar o livro, devemos transformar aberto em falso */
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        /* Ira receber a página atual em que o usuário esta lendo */
        this.pagAtual = p;

    }

    @Override
    public void avancarPag() {

        /*
         * Avançar páginas ira incrementar mais uma página em cima da
         * página atual
         */
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }

}
