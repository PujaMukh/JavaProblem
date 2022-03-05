package java_sample_oned_array;
import java.lang.*;
import java.util.*;

public class ArrayListNewspaper {
    public static int solve(int A, ArrayList<Integer> B) {
        int c=A;
        int i=0;
        
        while(c>0) {
            for (i=0; i<B.size(); i++) {
                c=c-B.get(i);
                if (c<=0) {
                  break;
                }
            }
        }
       return i+1;
        }
        public static void main(String args[]) {
        ArrayList<Integer>B=new ArrayList<Integer>();
        int A=2;
        B.add(1);
            B.add(0);
            B.add(0);
            B.add(0);
            B.add(0);
            B.add(0);
            B.add(0);
            System.out.print(solve(A,B));
        }
    }



