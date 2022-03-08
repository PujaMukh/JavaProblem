package java_sample_oned_array;
import java.lang.*;
import java.util.*;
//given an arraylist A and an integer B, return an arraylist which is the sum of each element of A
public class CopyArray {
    static ArrayList<Integer> solve(ArrayList<Integer>A, int B) {

        ArrayList<Integer>C=new ArrayList<Integer>(); //create new arraylist to store the output

        for (int i=0; i<A.size(); i++) { //make a loop to add all elements to arraylist C
            C.add(A.get(i)+B);
        }
        return C;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
         ArrayList<Integer>A=new ArrayList<Integer>();

        for (int i=0; i<N; i++) {
            int num=sc.nextInt();
            A.add(num);               //loop to add values to the input arraylist A
        }
        int B=sc.nextInt();

        ArrayList<Integer>temp=solve(A,B);

        for (int i=0; i<N; i++) {
            System.out.print(temp.get(i)+" ");
        }
    }
}
