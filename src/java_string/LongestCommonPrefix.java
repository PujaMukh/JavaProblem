package java_string;

import java.util.ArrayList;

//given an array of strings, find the longest common prefix.
//eg abcd abe abb, ans=ab
public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        int N=A.size();
        String S1="";
        if (N==0) {
            return "";
        }
        if (N==1) {
            return A.get(0);
        }
        else {
            S1=A.get(0);
            int j=1;

            StringBuilder sb=new StringBuilder();

            while (j<A.size()) {

                String S2=A.get(j);

                int i=0;


                while (i<S1.length() && i<S2.length()) {
                    if (S1.charAt(i)==S2.charAt(i)) {
                        sb.append(S1.charAt(i));
                    }
                    else {
                        break;
                    }
                    i++;
                }
                S1=sb.toString();
                sb.setLength(0);
                j++;


            }

        }
        return S1;

    }
}
