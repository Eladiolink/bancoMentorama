package src;
public class ContaPoupanca extends Conta{
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros ){
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;

    }

    public Double getSaldo(){
            return this.saldo + this.taxaDeJuros*this.saldo;

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
      
    public void Transferir(Conta destino, Double valor){
        if(valor > this.getSaldo()){
            System.out.println("Saldo indisponivel");
        }
        else{
            this.saldo -= valor;
            destino.saldo += valor;
                       
        }
       
    }
	
}