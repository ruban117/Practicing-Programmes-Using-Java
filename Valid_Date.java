/*Given Date Month and the Year Is Correct or Not Using If-Else*/
import java.util.*;
class Valid_Date{
    public static void main(String[] args){
        int d,m,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Date: ");
        d= sc.nextInt();
        System.out.print("Enter Month: ");
        m=sc.nextInt();
        System.out.print("Enter Year: ");
        y=sc.nextInt();
        if(valid_date(d ,m ,y)){
            System.out.print("The Date Is:"+" "+d+"/"+m+"/"+y+" "+"Is Valid");
        }
        else if(!leap_year(y)){
            System.out.print("The Date Is:"+" "+d+"/"+m+"/"+y+" "+"Is Not Valid");
        }
        else{
            System.out.print("The Date Is:"+" "+d+"/"+m+"/"+y+" "+"Is Not Valid");
        }
    }
    static boolean leap_year(int y){
        if(y % 4 == 0 &&(y % 400 ==0 || y % 100 != 0))
            return true;
        else
            return false;
    }
    static boolean valid_date(int d , int m , int y){
        if(d < 1 || d > 31){
            return false;
        }
        if(m < 1 || m > 12){
            return false;
        }
        if(y <= 1800 || y>=9999){
            return true;
        }
        if(m == 2) {
            if (leap_year(y)) {
                if (d > 29)
                    return false;
                else
                    return true;
            }
            else
                return false;
        }
        if(m==4 || m==6 || m==9 || m==11){
            if(d<=30){
                return true;
            }
            else
                return false;
        }
        return  true;
    }
}
