package java_simpleprograms;
import java.lang.*;
import java.util.*;
//return the rounded number for A/200
public class roundedNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(); //take input for integer A and storing in double to get exact valur for result
        double B=200; //taking 200 in double B to get exact decimal value for result

        double result = A /B; //get the exact decimal value
        int X = (int) (result); //convert the decimal to integer value

        if (A == 0) {    //edge case
            System.out.print("0");
        }
        else if (A > 0) {
            if ((result - X) < 0.50) {
                System.out.print(X);
            }
            else {
                System.out.print(X + 1);
            }
        }

        else if (A< 0){
            if ((result-X)< (-0.50)) {
                System.out.print(X-1);
            }
            else {
                System.out.print(X);
            }
        }

    }
}
