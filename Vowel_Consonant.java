import java.util.*;
class Vowel_Consonant{
    public static void main(String args[]){
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Character: ");
        ch=sc.next().charAt(0);
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.print("Your entered character"+" "+ch+" "+"is Vowel");
        }
        else{
            System.out.print("Your entered character"+" "+ch+" "+"is Consonant");
        }
    }
}