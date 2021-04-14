import java.util.Scanner;
public class MenuBanco {

    public static void main (String[] args){
        
        MenuGerente();
          
}   

    public static void MenuGerente(){
        Gerente gerente=new Gerente();


        int opcao=0;
        do{

            System.out.println("------------------------------");
            System.out.println("   *** Banco Mentorama ***  ");
            System.out.println("   |1.|  Criar Conta                 |");
            System.out.println("   |2.|  Sacar                       |");
            System.out.println("   |3.|  Depositar                   |");
            System.out.println("   |4.|  Transferir valores          |");
            System.out.println("   |5.|  Mostrar montante nas contas |");
            System.out.println("   |6.|  Sair                        |");
            System.out.println("------------------------------");

            Scanner menu=new Scanner(System.in);
            System.out.print("Digite uma Opção: ");
            opcao= menu.nextInt();

           switch(opcao){
            case 1:
                 CriarConta(gerente);
                 break;
            case 2:
                 Sacar(gerente);
                 break;
            case 3:
                 Depositar(gerente);
                 
                 break;
            case 4:
                 
                 break;
            case 5:
                   
                      
                 break;
           }

           
        }while(opcao<6);     
    }

    public static void CriarConta( Gerente gerente){
        
        Scanner cliente=new Scanner(System.in);
        System.out.print("Digite o nome do Cliente: ");
        String nome= cliente.nextLine();
        gerente.CriarConta(nome);
        
        int opcao=0;
        do{

            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu=new Scanner(System.in);
            System.out.print("Digite uma Opção: ");
            opcao= menu.nextInt();

         switch(opcao){
            case 1:
                gerente.CriarContaPoupanca(nome);
            break;
            
            case 2:
                gerente.CriarContaCorrente(nome);
            break;

            case 3:
                gerente.CriarContaSalario(nome);
            break;
         } 
        }while(opcao<4);
    }
    
    public static void Sacar(Gerente gerente){
        Scanner cliente=new Scanner(System.in);
        System.out.print("Digite o seu nome : ");
        String nome= cliente.nextLine();

        
        int opcao=0;
        do{

            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu=new Scanner(System.in);
            System.out.print("Digite o Tipo de Conta: ");
            opcao= menu.nextInt();

         switch(opcao){
            case 1:
                gerente.SacarPoupanca(nome);
            break;
            
            case 2:
                gerente.SacarCorrente(nome);
            break;

            case 3:
                gerente.SacarSalario(nome);
            break;
         } 
        }while(opcao<4);
    }
    
    public static void Depositar(Gerente gerente){
        Scanner cliente=new Scanner(System.in);
        System.out.print("Digite o seu nome : ");
        String nome= cliente.nextLine();

        
        int opcao=0;
        do{

            System.out.println("------------------------------");
            System.out.println("   *** Tipo da conta de Banco ***  ");
            System.out.println("   |1.|  Conta Poupança            |");
            System.out.println("   |2.|  Conta Corrente            |");
            System.out.println("   |3.|  Conta Salário             |");
            System.out.println("   |4.|  Voltar ao Menu Principal  |");
            System.out.println("------------------------------");

            Scanner menu=new Scanner(System.in);
            System.out.print("Digite o Tipo de Conta: ");
            opcao= menu.nextInt();

         switch(opcao){
            case 1:
                gerente.DepositarPoupanca(nome);
            break;
            
            case 2:
                gerente.DepositarCorrente(nome);
            break;

            case 3:
                gerente.DepositarSalario(nome);
            break;
         } 
        }while(opcao<4);
    }
    public static void print(Gerente gerente){
        
        int tamanho=gerente.contas.size();

        for(int i=0;i<tamanho;i++){
          System.out.println(gerente.contas.get(i).getNomeCliente());
        }

        
    }


  
}



