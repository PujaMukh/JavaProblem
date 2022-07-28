package LeetcodeProblems;

import java.util.HashMap;
import java.util.Scanner;

//number 13
//convert roman to integer
public class RomanToInteger {
    //hint: take 2 at a time
    //if that is present in hm, work on it
    //or take 1
    public static int romanToInt(String s) {
        HashMap<Character, Integer>hm=new HashMap<Character, Integer>();
        hm.put('I',1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        HashMap<String,Integer>hm1=new HashMap<String, Integer>();
        hm1.put("IV", 4);
        hm1.put("IX", 9);
        hm1.put("XL", 40);
        hm1.put("XC", 90);
        hm1.put("CD", 400);
        hm1.put("CM", 900);


        int ptr1=0;
        int ptr2=1;
        int ans=0;
        StringBuilder sb=new StringBuilder();
        String temp="";
        int val=0;

        if (s.length()==1) { //edge case when length=1
            val=hm.get(s.charAt(0));
            ans=ans+val;
        }
        else {
            while (ptr2<s.length()) {

                sb.setLength(0);
                sb=sb.append(s.charAt(ptr1));
                sb.append(s.charAt(ptr2));
                temp=sb.toString();

                if (hm1.containsKey(temp)) {
                    val=hm1.get(temp);
                    ans=ans+val; //ans=1000+900+90+4
                    ptr1=ptr1+2;
                    ptr2=ptr2+2;


                }
                else {
                    val=hm.get(s.charAt(ptr1)); //M
                    ans=ans+val; //ans=1000
                    //eg X I I
                    //eg M CM XC IV
                    ptr1++;
                    ptr2++;


                }
                if (ptr2==s.length() && ptr1==s.length()-1) { //to handle cases like I I I etc
                    ptr2=s.length()-1;

                }

            }

        }

        return ans;


    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.print(romanToInt(s));
    }
}
