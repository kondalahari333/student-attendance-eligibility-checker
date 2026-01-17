import java.util.*;
public class attendenceeligibility {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total working days:");
        int t=sc.nextInt();
        System.out.println("Enter attended days:");
        int a=sc.nextInt();
        float attendance=(a*100)/t;
        System.out.println("Attendance percentage:"+attendance+"%");
        if(attendance>=75){
            System.out.println("Eligible for exam");
        }
        else if(attendance<75){
            System.out.println("Not eligible for exam.");
        }
        else{
            System.out.println("Invalid");
        }
    }

}