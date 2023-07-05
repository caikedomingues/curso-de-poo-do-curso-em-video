public class ContaBanco {
    /* Atributos */
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    /*
     * Criação do metodo construtor: método que será executado sempre
     * que criarmos um objeto na classe principal.
     */
    public ContaBanco() {
        /* Atributos padrões */
        this.saldo = 0;
        this.status = false;
    }

    /* Getters e setters de atributos */
    public int setnumConta(int n) {

        return this.numConta = n;

    }

    public int getnumConta() {
        return this.numConta;

    }

    public String setTipo(String t) {
        return this.tipo = t;
    }

    public String getTipo() {

        return this.tipo;
    }

    public String setDono(String d) {

        return this.dono = d;
    }

    public String getDono() {

        return this.dono;
    }

    public float setSaldo(float s) {

        return this.saldo = s;
    }

    public float getSaldo() {

        return this.saldo;
    }

    public boolean setStatus(boolean a) {

        return this.status = a;
    }

    public boolean getStatus() {

        return status;
    }

    /* Criação dos metodos */

    /*
     * Método que ira possibilitar criar contas, e recebera como argumento
     * o parametro t que é o tipo da conta
     */
    public void abrirConta(String t) {
        /*
         * Aqui dentro vamos settar o tipo para que o método abrirConta
         * receba o tipo informado pelo usuário
         */
        this.setTipo(t);
        /*
         * Vamos informar que ao abrir a conta o status é alterado true,
         * ou seja, verdadeiro
         */
        this.setStatus(true);

        /*
         * Agora vamos verificar o tipo da conta para saber o usuário
         * recebe 50 reais ou 150 reais
         */
        if (t == "CC") {

            this.saldo = 50;
        } else if (t == "CP") {
            this.saldo = 150;
        } else {
            System.out.println("Tipo inválido");
        }

        System.out.println("Conta aberta com sucesso");

    }

    public void fecharConta() {
        if (saldo == 0) {
            this.status = false;
            System.out.println("conta fechada");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            System.out.println("Conta com dinheiro");
        }

    }

    public void depositar(float v) {
        /*
         * Antes de depositar um valor preecisamos verificar se a conta
         * está aberta
         */
        if (this.status = true) {

            this.saldo = saldo + v;
        } else {

            System.out.println("Impossivel depositar, conta fechada");
        }

    }

    public void sacar(float v) {
        /* Se a conta estiver aberta ele ira verificar se o saldo */
        if (this.status = true) {
            /*
             * Se o saldo for maior que o valor do saque, ele ira subtrair
             * o valor do saldo
             */
            if (saldo > v) {

                saldo = saldo - v;
                /* Impressão do resultado final com o nome do dono */
                System.out.println("Saque realizado na conta de " + this.dono);
            } else {
                /*
                 * Se o valor do saque for maior que o saldo, ele não ira
                 * realizar o saque
                 */
                System.out.println("Saldo insuficiente");
            }
            /* Se a conta estiver fechada ele ira bloquear o saque */
        } else {
            System.out.println("Conta fechada, não é possivel sacar");
        }

    }

    public void pagarMensal(int v) {
        /* Conta corrente: 12 reais mensais */
        /* Conta poupança: 20 reais mensais */
        /* Aqui ele ira verificar o tipo de conta para adicionar um valor */
        if (getTipo() == "CC") {

            v = 12;

        } else {
            v = 20;
        }
        /*
         * Se a conta estiver aberta, ele irá verificar se o saldo é
         * maior do que o valor da mensalidade
         */
        if (this.status = true) {
            /*
             * Se o saldo for maior que o valor da mensalidade ele irá
             * debitar ou descontar o valor da mensalidade
             */
            if (this.saldo > v) {
                this.saldo = saldo - v;
            } else {
                /* Se não ele ira bloquear o débito */
                System.out.println("Saldo insuficiente");
            }
        } else {
            /*
             * Se a conta não estiver aberta ele não irá realizar a
             * operação
             */
            System.out.println("Conta fechada, impossivel pagar");
        }

    }

    /* Método que irá imprimir as caracteristicas da conta */
    public void estadoAtual() {
        System.out.println("-----------------------");
        System.out.println("Conta: " + this.numConta);
        System.out.println("Tipo : " + this.tipo);
        System.out.println("Dono : " + this.dono);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("status: " + this.status);

    }

}
