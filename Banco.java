public class Banco{
  
  protected String NomeCliente;
  private Double Saldo;
  private ContaPoupanca ContaPoupanca;
  private ContaCorrente ContaCorrente;
  private ContaSalario  ContaSalario;
  

  public Double getSaldo(){
     return this.Saldo;
  }
  public void setSaldo(){
     this.Saldo = getSaldo();
  }

  public String getNomeCliente(){
      return this.NomeCliente;
  }

  public void setNomeCliente(String nome){
      this.NomeCliente=nome;
  }
  

  
  public void CriarContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros){
    this.ContaPoupanca=new ContaPoupanca(numero, agencia,banco,saldo,diaAniversario,taxaDeJuros);
  }
 
  public void CriarContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial){
    this.ContaCorrente=new ContaCorrente(numero,agencia,banco,saldo,chequeEspecial);
  }

   public void CriarContaSalario(int numero, int agencia, String banco, double saldo, int limite){
      this.ContaSalario=new ContaSalario(numero,agencia,banco,saldo,limite);
   }

   public void sacarContaPoupanca(double valor){
      this.ContaPoupanca.Sacar(valor);
      System.out.println(this.ContaPoupanca.getSaldo());
   }
   
   public void SacarContaCorrente(double valor){
       this.ContaCorrente.Sacar(valor);
       System.out.println(this.ContaCorrente.getSaldo());

   }

   public void SacarContaSalario(double valor){
      this.ContaSalario.Sacar(valor);
      System.out.println(this.ContaSalario.getSaldo());
     
   }

   public void DepositarContaPoupanca(double valor){
      this.ContaPoupanca.depositar(valor);
      System.out.println(this.ContaPoupanca.getSaldo());
   }
   public void DepositarContaSalario(double valor){
      this.ContaSalario.depositar(valor);
      System.out.println(this.ContaSalario.getSaldo());
   }
    
   public void DepositarContaCorrente(double valor){
      this.ContaCorrente.depositar(valor);
      System.out.println(this.ContaCorrente.getSaldo());
   }
   public void Saldo(){
   System.out.println("Saldo de todos: " + Saldo);
   }


   





}

