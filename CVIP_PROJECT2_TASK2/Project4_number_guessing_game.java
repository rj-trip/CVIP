import java.util.*;
import java.lang.Math;
public class Project4_number_guessing_game {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
          int random_num =(int)( Math.random()*10);
          System.out.println("Enter integer value between 0-10");
          int user_num = s.nextInt();
          System.out.println("the random number is: " + random_num);
          if(random_num==user_num){
            System.out.println("Congratulations!! Your guess is right.");
          }
           else  if(random_num>user_num){
            System.out.println("Ohh! Your guess is less than the random number...Let's try again.");
          }
          else{
            System.out.println("Ohh! Your guess is more than the random number...Let's try again.");
          }
         
        }
    }
    
}
