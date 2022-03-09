package java_simpleprograms;
import java.lang.*;
import java.util.*;
//convert a binary number to decimal
public class BinaryToDecimal {
        static int Binary(String A) {
            int num=0;
            for (int i=0; i<A.length(); i++) {
                num=num*2+A.charAt(i)-'0';
            }
            return num;
        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.nextLine();
            System.out.print(Binary(A));
        }
    }

