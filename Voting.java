/*3.Checking You Are Eligible for Voting or Not*/
import java.util.*;
class Voting{
    public static void main(String args[]){
        int age;
        System.out.print("Enter Your Age: ");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age<18){
            System.out.print("You are not eligible for voting");
        }
        else if(age>=18){
            System.out.print("You are eligible for voting");
        }
    }
}