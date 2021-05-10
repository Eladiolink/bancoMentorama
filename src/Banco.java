package src;
public class Banco{
  
  protected String NomeCliente;
  protected ContaPoupanca ContaPoupanca;
  protected ContaCorrente ContaCorrente;
  protected ContaSalario  ContaSalario;
  protected Conta transferir;


  
  
  

  public String getNomeCliente(){
      return this.NomeCliente;
  }

  public void setNomeCliente(String nome){
      this.NomeCliente=nome;
  }
  

  
  public void CriarContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros){
    this.ContaPoupanca=new ContaPoupanca(numero, agencia,banco,saldo,diaAniversario,taxaDeJuros, taxaDeJuros);
  }
 
  public void CriarContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial){
    this.ContaCorrente=new ContaCorrente(numero,agencia,banco,saldo,chequeEspecial, chequeEspecial);
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
    
   public void DepositarContaCorrente(Double valor){
      this.ContaCorrente.depositar(valor);
      System.out.println(this.ContaCorrente.getSaldo());
   }

   public void transferir(String destino, Double valor){
      this.transferir(destino, valor);

   }
 
   



  

   public Double Saldo(){
     Double saldo = 0.0;
     
     if(ContaPoupanca != null ){
      saldo += ContaPoupanca.getSaldo();
     }

     if(ContaCorrente != null ){
      saldo += ContaCorrente.getSaldo();
     }

     if(ContaSalario != null ){
      saldo += ContaSalario.getSaldo();
     }
      
     return saldo;

   }
  




}

