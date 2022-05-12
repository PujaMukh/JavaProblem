package LeetcodeProblems;
//leetcode no 28. Return the index of 1st occurance of needle in haystack, if not return -1
//if needle is empty string return 0
public class NeedleHaystack {
    public int strStr(String haystack, String needle) {
        int startIndex=-1;

        if (needle.length()==0) { //edge case for empty string needle
            return 0;
        }
        int i=0;
        while (i<haystack.length()) {

            if ((haystack.charAt(i))==(needle.charAt(0))) {
                startIndex=i; //store the startindex
                int p=i+1;
                int q=1;

                while (p<haystack.length() && q<needle.length()) {
                    if(haystack.charAt(p)==(needle.charAt(q))) {
                        p++;
                        q++;
                    }
                    else{
                        startIndex=-1; //reset start Index
                        break;
                    }
                }
                if (q==needle.length()&& startIndex!=-1) { //if needle is finished and we have value for startindex, just return it
                    return startIndex;
                }
                else if(p==haystack.length()&& q!=needle.length()) { //edgecase=aaa, aaaa
                    return -1;   //if haystack is finished and needle is not, return -1
                }
            }
            i++;
        }
        return startIndex;

    }
}
//TC is almost O(N^2) if considering large substring, SC is O(1)