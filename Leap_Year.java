/*6.Program to Check Leap Year or Not Using If / Else*/
import java.util.*;
class Leap_Year{
    public static void main(String args[]){
        int year;
        System.out.print("Enter Any Year: ");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
        if(year % 4 == 0 && (year %400 == 0 || year % 100!=0)){
            System.out.print("The Year"+" "+year+" "+"Is Leap Year");
        }
        else{
            System.out.print("The Year"+" "+year+" "+"Is Not Leap Year");
        }
    }
}