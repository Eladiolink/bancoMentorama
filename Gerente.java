import java.util.ArrayList;
import java.util.Scanner;

public class Gerente{
    
     
    protected ArrayList<Banco> contas=new ArrayList<>();
    int numeroDeConta=1000001;
        
    
    public void CriarConta(String nome){
        Banco banco=new Banco();
        banco.setNomeCliente(nome);       
        contas.add(banco);
        System.out.print(contas.size());
       
    }

    public void CriarContaPoupanca(String nome){
        
         int indice=BuscarPessoa(nome);
        
         Scanner cliente=new Scanner(System.in);
         System.out.print("Digite o saldo Inicial da Conta: ");
         Double saldo= cliente.nextDouble();

         System.out.print("Digite o dia do seu Aniversário: ");
         int dia= cliente.nextInt();
 
 
        this.contas.get(indice).CriarContaPoupanca(this.numeroDeConta,1776,"Nubank",saldo,dia,0.05);

        this.numeroDeConta++;
    
    }

    public void CriarContaCorrente(String nome){
        int indice=BuscarPessoa(nome);
       
        Scanner cliente=new Scanner(System.in);
        System.out.println("Digite o saldo Inicial da Conta: ");
        Double saldo= cliente.nextDouble();

        System.out.println("Digite o valor do seu cheque especial");
        Double cheque= cliente.nextDouble(); 

       this.contas.get(indice).CriarContaCorrente(this.numeroDeConta,1881,"Nubank",saldo,cheque);

       this.numeroDeConta++;
   
   }

   public void CriarContaSalario(String nome){
    int indice=BuscarPessoa(nome);
   
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o saldo Inicial da Conta: ");
    Double saldo= cliente.nextDouble();    

    System.out.println("Digite a quantidades de saques mensais");
    int saques= cliente.nextInt();

   this.contas.get(indice).CriarContaSalario(this.numeroDeConta,3232,"Nubank",saldo,saques);
   this.numeroDeConta++;

   }

   public void SacarPoupanca(String nome){
    int indice=BuscarPessoa(nome);
     
    System.out.println(indice);
   
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o quanto quer Sacar: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).sacarContaPoupanca(valor);

   }

   public void SacarCorrente(String nome){
    int indice=BuscarPessoa(nome);
    
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o quanto quer Sacar: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).SacarContaCorrente(valor);   

   }

   public void SacarSalario(String nome){
    int indice=BuscarPessoa(nome);
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o quanto quer Sacar: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).SacarContaSalario(valor);
    

   }

    private int BuscarPessoa(String nome){
             
         for(int i=0 ;i < this.contas.size() ; i++ ){
                       
             if(this.contas.get(i).getNomeCliente().equals(nome)){
                  return i;
             }
        }
        return-1;
    }


    public void DepositarPoupanca(String nome){
        int indice=BuscarPessoa(nome);
     
    System.out.println(indice);
   
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o valor de deposito: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).DepositarContaPoupanca(valor);


    }
    public void DepositarSalario(String nome){
        int indice=BuscarPessoa(nome);
     
    System.out.println(indice);
   
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o valor de deposito: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).DepositarContaSalario(valor);


    }
    public void DepositarCorrente(String nome){
        int indice=BuscarPessoa(nome);
     
    System.out.println(indice);
   
    Scanner cliente=new Scanner(System.in);
    System.out.print("Digite o valor de deposito: ");
    Double valor= cliente.nextDouble();
    this.contas.get(indice).DepositarContaCorrente(valor);


    }

   

    
}



