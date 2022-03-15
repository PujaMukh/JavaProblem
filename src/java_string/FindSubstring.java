package java_string;
//You are given two character strings A and B
//You have to find the first occurrence of string B in string A, as a substring, and return the starting position of first occurrence.

import java.lang.*;
import java.util.*;

public class FindSubstring {
    static int findIndex(String A, String B) { //return type will be int
        //1st convert both the strings to character array since strings are immutable
        char[] ch1 = A.toCharArray(); //character array of string A
        char[] ch2 = B.toCharArray(); //character array of string B

        int N = ch1.length; //length of character array ch1
        int M = ch2.length; //length of character array ch2


       int output=isPresent(ch1,ch2); //calling isPresent function to return the index
       if (output==-1) {
           return -1;
       }
       else {
           return output;
       }

    }
      static int isPresent(char[]D, char[]E)   {
        //char D represents parent character array and char E represents sub array
          int P=D.length; //length of parent charcter array
          int Q=E.length; //length of sub charcter array

          int i=0;
          while (i<P) {
          int temp=i;
              int j=0;
              while (j<Q) {
                  if (D[temp]==E[j]) {
                      j++;
                      temp++;
                  }
                  else {
                      break;
                  }
              }
              if(j==Q) {
                  return i+1;
              }
              i=i+1;

          }
          return -1;

      }

      public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //take input of A string
        String B=sc.next(); //take input of B string
          System.out.print(findIndex(A,B));
      }
    }



