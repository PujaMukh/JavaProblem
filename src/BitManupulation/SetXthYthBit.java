package BitManupulation;
//given x and y, set xth and yth bit in value 0

import java.lang.*;
import java.util.*;
public class SetXthYthBit {
    static int setBits(int x, int y) {

        return ((1<<x) | (1<<y)); //2^x+2^y
    }

    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(); //take input for size of array
        int y=sc.nextInt();
        System.out.println(setBits(x,y));
    }

}
//TC is O(1), SC is O(1)

//another way to do this is by using if else
//if x==y, then return either 1<<x or 1<<y
//else return 1<<x+1<<y (2^x+2^y)
