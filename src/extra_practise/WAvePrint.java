package extra_practise;

import java.util.Scanner;

//given a matrix, wave print it column wise
public class WAvePrint {
    //eg i/p= 4 4
    //  0   1  2  3
    //0-11 12 13 14
    //1-21 22 23 24
    //2-31 32 33 34
    //3-41 42 43 44
    //o/p= 11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END

    static void wavePrint(int[][] A) {
        int i=0;
        int j=0;
        while (i<A.length && j<A[0].length) { //while (0<4 && 2<4)

                System.out.print(A[i][j]+" "); //11 21 31 41 42 32 22 12 13 23 33 43 44 34 24 14 end
                i++; //i=4

            if (i==A.length) {
                j++; //j=3
                i--;
                while (i>=0) {
                    System.out.print(A[i][j]+" ");
                    i--; //i=-1
                }
                i=0; //i=0;
                j++; //j=4
            }
            if (i==0 && j==A[0].length) {
                System.out.print("END");
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt(); //take input for number of rows
        int C=sc.nextInt(); //take input for number of column

        int[][] A=new int[R][C]; //create new array A with size R and C

        for (int i=0; i<R; i++) {
            for (int j=0; j<C; j++) {
                A[i][j]=sc.nextInt(); //taking inputs for all elements of the matrix
            }
        }
        wavePrint(A);

    }

}
