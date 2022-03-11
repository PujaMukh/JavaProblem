package java_string;
import java.lang.*;
import java.util.*;
//take T which will  be the number of strings and then count number of vowels and consonants in string
public class CountVowelsConsonants {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt(); //take input for number for test cases

            for (int i=0; i<T; i++) {
                String S=sc.next(); //take input for string S. Taking next only since I know it will be 1 word

                int l=S.length(); //take the length of string S

                int c1=0; //initialize c1 as count of vowels
                int c2=0; //initialize c2 as count of consonants

                for (int j=0; j<l; j++) {
                    if (S.charAt(j)=='a' || S.charAt(j)=='e' || S.charAt(j)=='i' || S.charAt(j)=='o' || S.charAt(j)=='u')  {
                        c1++;
                    }
                    else {
                        c2++;
                    }
                }
                System.out.println(c1+" "+c2);
            }
        }
    }

