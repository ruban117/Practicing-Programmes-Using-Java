/*2.Find the Greatest Among Three Numbers*/
import java.util.*;
class Greatest_Num{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        a=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        b=sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        c=sc.nextInt();
        if(a>=b && a>=c){
            System.out.print(a+" "+"Is Greater");
        }
        else if(b>=a && b>=c){
            System.out.print(b+" "+"Is Greater");
        }
        else {
            System.out.print(c+" "+"Is Greater");
        }
    }
}