package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ValidSudoku {
    public static int isValidSudoku(final List<String> A) {
        //all rows diff nmbs
        //all columns diff nos
        //all 3*3 box diff nos

        char[][] matrix=new char[9][9];
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++)   {
                matrix[i][j]=A.get(i).charAt(j);

            }       //matrix filled

        }
        HashSet<Character> hs=new HashSet<Character>();

        for (int i=0; i<9; i++) {
            hs.clear();
            for (int j=0; j<9; j++) {    //row
                if (matrix[i][j]!='.') {
                    if (hs.contains(matrix[i][j])) {
                        return 0;
                    }
                    else {
                        hs.add(matrix[i][j]);
                    }
                }

            }
        }
        hs.clear();

        for (int j=0; j<9; j++) {
            hs.clear();
            for (int i=0; i<9; i++) {    //column
                if (matrix[i][j]!='.') {
                    if (hs.contains(matrix[i][j])) {
                        return 0;
                    }
                    else {
                        hs.add(matrix[i][j]);
                    }
                }

            }
        }
        hs.clear();

        for (int outerRow=0; outerRow<9; outerRow=outerRow+3) {
            for (int outerColumn=0; outerColumn<9; outerColumn=outerColumn+3) {
                //    int outerRow=0;
                //    int outerColumn=0;
                //    while (outerRow<9 && outerColumn<9) {

                for (int i=outerRow; i<outerRow+3; i++) {
                    for (int j=outerColumn; j<outerColumn+3; j++) {
                        if (matrix[i][j]!='.') {
                            if (hs.contains(matrix[i][j])) {
                                return 0;
                            }
                            else {
                                hs.add(matrix[i][j]);
                            }
                        }
                    }
                }
                hs.clear();
                //   outerRow=outerRow+3;
                //   outerColumn=outerColumn+3;

                //    }

            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> A=new ArrayList<>();
        for (int i=0; i<9; i++) {

            A.add(sc.next());
        }
        System.out.println(isValidSudoku(A));

    }

}
