package programs;



public class Conta {

    private static int accountCounter = 1;

    private int numeroConta;
    private Pessoa pessoa;



    public Conta(Pessoa pessoa) {
        this.numeroConta = Conta.accountCounter;
        this.pessoa = pessoa;

        Conta.accountCounter += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }



    public String toString() {

        return "\nseu ID:  " + this.getNumeroConta() +
                "\nCliente:  " + this.pessoa.getName() +
                "\nCPF: "  + this.pessoa.getCpf() +
                "\nEmail:  " + this.pessoa.getEmail() +
                "\n" ;
    }
}
