import java.util.*;

class AtmInterface{
   
    double balance=0;

    AtmInterface(double balance){
    this.balance =balance;
    }

    double Deposite(double depo){
         balance +=depo;
         return balance;
    }

    double WithDrawMoney(double withdraw){//<---------------
        if(balance>0 && balance>=withdraw ){
           balance -= withdraw;
           return balance;
        }
        else{
        return -1;
        }  
    }

    double CheckBalance(){
        return balance;
    }

}

public class Project3_atm_interface {
    public static void main(String args[]){
        double withdraw;
        double depo;
        double balance;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter complete balance you have in your account");
        balance = s.nextDouble();

        AtmInterface atm = new AtmInterface(balance);

        while(true){
        
        System.out.println("1 for deposite money");
        System.out.println("2 for withdraw money");
        System.out.println("3 for check balance");
        System.out.println("4 for Exit");

        double choose = s.nextInt();

        if(choose == 1){
            System.out.println("How much money you want to deposite?");
            depo = s.nextDouble();
            System.out.println("congratulation!! Your money has been successfully deposited");
            System.out.println("After deposition your total bank balance is: " +    atm.Deposite(depo));
        }

        else if(choose == 2){//<-------------------
            System.out.println("How much money you want to withdraw?");
            withdraw = s.nextDouble();
            double result = atm.WithDrawMoney(withdraw);

            if(result<0){
                System.out.println("Ohh!! you have no sufficient balance");
            }
            else{
                System.out.println("Congratulation!! your money has been withdrawed now you can take it");
               System.out.println("After withdrawl your total bank balance is: " +    result);
            }
            
        }

        else if(choose == 3){
            System.out.println("Your total bank balance is: " +    atm.CheckBalance());
        }
        else if(choose==4){
            System.out.println("We exited!!");
             break;
        }
        else{
            System.out.println("Choose valid option");
        }
        }

    }
}


