package subarray;
//given A is o/p size of no of beggars. B is 2 D array where 0th index is left,
//1st index is right and next index is value
//return final o/p after performing addition operations
import java.util.ArrayList;
import java.util.Scanner;

public class BeggarsOutsideTemple {
    public static int[] solve(int A, int[][]B) {
        int[] output=new int[A]; //output=[0,0,0,0,0] //for eg problem
        for (int i=0; i<B.length; i++) { //row

            int left=B[i][0]-1; //0 (-1 here and below coz of indexing 0)
            int right=B[i][1]-1; //1
            int value=B[i][2]; //10
            //this value has to be put in above index in o/p array
            for (int j=left; j<=right; j++) {
                output[j]=output[j]+value;

            }

        }

        return output;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //final size
        int r=sc.nextInt();
        int[][] B=new int[r][3];
        for (int i=0; i<r; i++) {
            for (int j=0; j<3; j++) {
                B[i][j]=sc.nextInt();
            }
        }
        int[]output=solve(A,B);
        for (int i=0; i<output.length; i++) {
            System.out.print(output[i]+" ");
        }


    }
}
