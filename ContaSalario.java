public class ContaSalario extends Conta {
    private int limite;

    public ContaSalario (int numero, int agencia, String banco, double saldo, int limite) {
        super(numero, agencia, banco, saldo);
        this.limite = limite;
    }
    
    

    public double getSaldo() {
        return this.saldo;

    }

    public void depositar(double valor) {
        this.saldo += valor;

    }

    public void Sacar(double valor) {
        if (this.limite == 0) {
            System.out.println("Atingiu o valor máximo de saque");           
            }
        else{
            System.out.println("Saques disponiveis: "  + this.limite);
            this.limite --;
            this.saldo -= valor;
        }     
         
        }
    
        
    }

