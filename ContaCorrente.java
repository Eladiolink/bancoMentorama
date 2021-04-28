public class ContaCorrente extends Conta implements Tributavel {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }
    @Override
    public String toString() {
        return "ContaCorrente:  " +
                "chequeEspecial = " + chequeEspecial +
                '}';
    }


    public double getSaldo() {
        return (this.chequeEspecial + this.saldo);
    }

    public void depositar (double valor) {
        this.saldo+=valor;

    }
    
    public void Sacar (double valor) {
        if(valor > this.getSaldo()) {
            System.out.println("Saldo indisponivel para o valor de saque");
        }
        else {
            this.saldo-=valor;

        }
        
        

    }
 
}
