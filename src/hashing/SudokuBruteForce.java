package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SudokuBruteForce {
    static int isValidSudoku(final ArrayList<String> A) {
        char[][] matrix=new char[9][9];
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                matrix[i][j]=A.get(i).charAt(j);
            }
        }
        HashSet<Character> hs=new HashSet<Character>();
        for (int i=0; i<9; i++) {    //row
            hs.clear();
            for (int j=0; j<9; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }
            }
        }
        hs.clear();

        for (int j=0; j<9; j++) { //column
            hs.clear();
            for (int i=0; i<9; i++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }
            }
        }
        hs.clear();


        for (int i=0; i<3; i++) { //each box
            for (int j=0; j<3; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=0; i<3; i++) {
            for (int j=3; j<6; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=0; i<3; i++) {
            for (int j=6; j<9; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=3; i<6; i++) {
            for (int j=0; j<3; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=3; i<6; i++) {
            for (int j=3; j<6; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=3; i<6; i++) {
            for (int j=6; j<9; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=6; i<9; i++) {
            for (int j=0; j<3; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=6; i<9; i++) {
            for (int j=3; j<6; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        hs.clear();
        for (int i=6; i<9; i++) {
            for (int j=6; j<9; j++) {
                if (hs.contains(matrix[i][j])) {
                    return 0;
                }
                else if (matrix[i][j]=='.') {

                }
                else {
                    hs.add(matrix[i][j]);
                }

            }
        }

        return 1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<String>A=new ArrayList<>();
        for (int i=0; i<9; i++) {

            A.add(sc.next());
        }
        System.out.println(isValidSudoku(A));

    }

}
