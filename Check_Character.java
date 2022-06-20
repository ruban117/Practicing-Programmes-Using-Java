/*1.Program to Check Character Is Uppercase, Lowercase Alphabet or a Digit or a Special Symbol*/
import java.util.*;
class Check_Character{
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        ch=sc.next().charAt(0);
        System.out.print("Your Entered Character Is:\n");
        if(ch>='A' && ch<='Z'){
            System.out.print("Uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.print("Lowercase");
        }
        else if(ch>='0' && ch<='9'){
            System.out.print("Digit");
        }
        else if(ch>9){
            System.out.print("Number");
        }
        else{
            System.out.print("Special Character");
        }
    }
}