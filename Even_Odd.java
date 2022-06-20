/*5.Checking Number Is Even or Odd*/
import java.util.*;
class Even_Odd{
    public static void main(String args[]){
        int num;
        System.out.print("Enter any number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0){
            System.out.print("The Number"+" "+num+" "+"Is Even");
        }
        else{
            System.out.print("The Number"+" "+num+" "+"Is Odd");
        }
    }
}