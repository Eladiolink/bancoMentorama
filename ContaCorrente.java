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
    
    public void Sacar (double valor) {
        if(valor > this.getSaldo()) {
            System.out.println("Saldo indisponivel para o valor de saque");
        }
        else {
            this.saldo-=valor;

        }
               

    }
    @Override
    public void Sacar(Double valor) {
        if(saldo > this.getSaldo()) {
            System.out.println("Saldo indisponivel para o valor de saque");
        }
        else {
            this.saldo-=saldo;

        }       
        
    }
    @Override
    public void depositar(Double valor) {
        this.saldo+=saldo;
        
    }
    @Override
    public Double getSaldo() {
        return (this.chequeEspecial + this.saldo);
        
        
    }


 
}
