package java_simpleprograms;
//return ceil value of area of circle where radius is given
import java.lang.*;
import java.util.*;
public class AreaOfCircle {
    static int findArea(int A) {
        double result=3.14*A*A;
        int area=(int)result;
        if (result-area>0) {
            return area+1;
        }
        return area;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(findArea(A));
    }
}
