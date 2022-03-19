package java_simpleprograms;
//return ceil value of volume of sphere

import java.lang.*;
import java.util.*;
public class VolumeOfSphere {
    static int findVolume(int A) {
        double result=(4*3.14159265358979323846*A*A*A)/3;
        int area=(int) result;

        if (result-area>0) {
            return area+1;
        }
        return area;
    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print(findVolume(A));
    }

}
