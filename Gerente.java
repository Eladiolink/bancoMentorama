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
        
        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
                Scanner cliente=new Scanner(System.in);
                System.out.print("Digite o saldo Inicial da Conta: ");
                Double saldo= cliente.nextDouble();

                System.out.print("Digite o dia do seu Aniversário: ");
                int dia= cliente.nextInt();
 
                conta.CriarContaPoupanca(this.numeroDeConta,1776,"Nubank",saldo,dia,0.05);

                this.numeroDeConta++;
            }
           
         }  
    
    }

    public void CriarContaCorrente(String nome){
        
          
        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
                Scanner cliente=new Scanner(System.in);
                System.out.println("Digite o saldo Inicial da Conta: ");
                Double saldo= cliente.nextDouble();
        
                System.out.println("Digite o valor do seu cheque especial");
                Double cheque= cliente.nextDouble(); 
        
                conta.CriarContaCorrente(this.numeroDeConta,1881,"Nubank",saldo,cheque);
        
               this.numeroDeConta++;
            }
           
         }
   
   }

   public void CriarContaSalario(String nome){
   
    for( Banco conta : this.contas ){
         
        if( conta.getNomeCliente().equals(nome) ){
            Scanner cliente=new Scanner(System.in);
            System.out.print("Digite o saldo Inicial da Conta: ");
            Double saldo= cliente.nextDouble();    

            System.out.println("Digite a quantidades de saques mensais");
            int saques= cliente.nextInt();

            conta.CriarContaSalario(this.numeroDeConta,3232,"Nubank",saldo,saques);
            this.numeroDeConta++;
        }
       
     }
   }

   public void SacarPoupanca(String nome){
    
     
     for( Banco conta : this.contas ){
         
        if( conta.getNomeCliente().equals(nome) ){
            System.out.println(conta.getNomeCliente()+" - "+conta.ContaPoupanca.getSaldo());

           Scanner cliente=new Scanner(System.in);
           System.out.print("Digite o quanto quer Sacar: ");
           Double valor= cliente.nextDouble();
          conta.sacarContaPoupanca(valor);
        }
       

     }

   }

   public void SacarCorrente(String nome){
   
    for( Banco conta : this.contas ){
         
        if( conta.getNomeCliente().equals(nome) ){

            Scanner cliente=new Scanner(System.in);
            System.out.print("Digite o quanto quer Sacar: ");
            Double valor= cliente.nextDouble();
            conta.SacarContaCorrente(valor);   
        }
       

     }
    

   }

   public void SacarSalario(String nome){
    

    for( Banco conta : this.contas ){
         
        if( conta.getNomeCliente().equals(nome) ){
        
            Scanner cliente=new Scanner(System.in);
            System.out.print("Digite o quanto quer Sacar: ");
            Double valor= cliente.nextDouble();
            conta.SacarContaSalario(valor);
        }
       


   }

    private String BuscarPessoa(String nome){
        for (ArrayList<Banco> conta:conta){
        if(this.conta.getNomeCliente().equals(nome)){
                  return this.conta.getNomeCliente();
             }
        }
    }


     }

   }


    public void DepositarPoupanca(String nome){
        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
    
                Scanner cliente=new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor= cliente.nextDouble();
                conta.DepositarContaPoupanca(valor);
            }
           
    
         }
       
    }

    
    public void DepositarSalario(String nome){
       
        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
                Scanner cliente=new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor= cliente.nextDouble();
                conta.DepositarContaSalario(valor);
            }
         }
    }

    public void DepositarCorrente(String nome){

        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
                Scanner cliente=new Scanner(System.in);
                System.out.print("Digite o valor de deposito: ");
                Double valor= cliente.nextDouble();
                conta.DepositarContaCorrente(valor);
            }
         }
    }

    public void Saldo(){
        
        Scanner cliente=new Scanner(System.in);
                System.out.print("Digite o seu nome: ");
                String nome= cliente.nextLine();

        for( Banco conta : this.contas ){
         
            if( conta.getNomeCliente().equals(nome) ){
                System.out.println(conta.getNomeCliente());

                System.out.println(conta.Saldo());
        
            }
         }

    }

    
}



