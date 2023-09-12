import java.util.*;

class Student{

 String name;
 double totalFees=0;
 int feesPaid;
     public void stnd(String name,Double totalFees){
         this.name = name;
         this.totalFees += totalFees;
         this.feesPaid=0;
     }
      public double remainingfees(){
          return totalFees - feesPaid;
     }
    
     public double feespaid(){
        return feesPaid;
     }

     public void payfees(double amount){
        feesPaid += amount;
     }
}

public class PROJECT2_feeManagement{
   
   public static void payFees(Student student){
    Scanner s = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = s.nextLine();

        System.out.println("Enter total fees payment");
        double totalFees = s.nextDouble();

        if(student != null){
            student.payfees(totalFees);
            System.out.println("Payment successful");
        }

      else{
        System.out.println("Student not found.");
      }
   }

  public static void Details(Student student){
      Scanner s = new Scanner(System.in);

      System.out.println("Enter student name: ");
        String name = s.nextLine();

      if(student != null){
        System.out.println(" total fees : " + student.totalFees);
        System.out.println(" fees paid : " + student.feesPaid);
        System.out.println(" remaining fees : " + student.remainingfees());
      }
      else{
        System.out.println("Student not found");
      }

  }
    public static void addStudent(Student student){

       Scanner s = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String name = s.nextLine();

        System.out.println("Enter total fees");
        double totalFees = s.nextDouble();

         student.stnd(name,totalFees);
        System.out.println("Student added successfully.");
    }
public static void main(String[] args){

    Scanner s = new Scanner(System.in);
    Student st = new Student();

    while(true){
        System.out.println("1. Add Student");
        System.out.println("2. Pay Fees");
        System.out.println("3. Display Fee Details");
        System.out.println("Enter Your Choice");

        int Choice = s.nextInt();

        if(Choice == 1){
            addStudent(st);
        }
        else if(Choice == 2){
            payFees(st);
        }
        else if(Choice == 3){
            Details(st);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
}
