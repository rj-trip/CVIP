import java.util.*;
public class PROJECT1_bmical{
   public static void main(String[] args){
     Scanner s = new Scanner(System.in);

     System.out.println("enter height in cm");
     double height=s.nextDouble();

     System.out.println("enter weight in kg");
     double weight=s.nextDouble();

      if(height<=0||weight<=0){
        System.out.println("Please enter valid height and weight");
     }
      
     double bmi = (weight/((height*height)/10000));

     System.out.println("Some useful information:");
     System.out.println("bmi is under 18.5 -> underweight");
     System.out.println("bmi is between 18.5 and 24.9 -> normal weight");
     System.out.println("bmi is above 24.9 -> overweight");
     System.out.println();
     System.out.println("Your bmi is " + String.format("%.2f", bmi));
   
     
     if(bmi<18.5){
        System.out.println("Ohh!! You are underweight");
     }
     else if(18.5<bmi&& bmi<24.9){
        System.out.println("Congratulations!! You are Healthy");
     }
     else{
        System.out.println("Ohh! You are overweight");
     }
   }
}
