package LeetcodeProblems;
//check if phrase is palindrome by keeping 2 pointers
//leetcode ques no 125
public class CheckIfPhrasePalindrome1 {
    public boolean isPalindrome(String s) {
        int N=s.length();

        StringBuilder sb=new StringBuilder();
        for (int i=0; i<N; i++) {
            if (s.charAt(i)>='a' && s.charAt(i)<='z') {
                sb.append(s.charAt(i));

            }
            else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
                int convertToInteger=(int)s.charAt(i)+32;
                char c=(char) convertToInteger;
                sb.append(c);

            }
            else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                sb.append(s.charAt(i));
            }
        }

        //now take 2 pointers, one on left and one on right
        int M=sb.length();
        int left=0;
        int right=M-1;

        while (left<right) {
            if (sb.charAt(left)==sb.charAt(right)) {
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;

    }
}
//O(N), SC is O(1)
