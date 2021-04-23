import java.util.Scanner;
public class MenuBanco {

    public static void main (String[] args){  
        Banco banco = new Banco();
        Menus menus = new Menus();
        Gerente gerente = new Gerente();

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
                menus.CriarConta();                      
                 break;
            case 2:
                menus.Sacar(gerente);
                 break;
            case 3:
                menus.Depositar(gerente);
                 break;
            case 4:
                 
                 break;
            case 5:
                banco.Saldo();      
                 break;
           }


           
        }while(opcao<6);   
        
        
    }
}    
    
 
  