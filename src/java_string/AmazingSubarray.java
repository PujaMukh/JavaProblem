package java_string;
//count the number of substrings that start with a vowel
//logic: start from last and keep a count. When you get a vowel, do ans=ans+count
public class AmazingSubarray {
    public long solve(String A) {
        long count=0;
        long ans=0;
        for (int i=A.length()-1; i>=0; i--) {
            if (A.charAt(i)=='a' ||A.charAt(i)=='e' ||A.charAt(i)=='i' ||A.charAt(i)=='o' ||A.charAt(i)=='u' ||A.charAt(i)=='A' ||A.charAt(i)=='E' ||A.charAt(i)=='I' ||A.charAt(i)=='O' || A.charAt(i)=='U') {
                count=count+1;
                ans=ans+count;
            }
            else{
                count=count+1;
            }


        }
        return ans%10003;
    }
}
