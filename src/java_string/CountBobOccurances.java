package java_string;
//given a string, check how many times bob is present in the string
public class CountBobOccurances {
    public int solve(String A) {
        int count=0;
        if (A.length()==1 || A.length()==2) {
            return 0;
        }
        int ptr1=0;
        int ptr2=1;
        while (ptr2<A.length()) {

            if (A.charAt(ptr2)=='o') {
                if (A.charAt(ptr2-1)=='b' && A.charAt(ptr2+1)=='b') {
                    count=count+1;
                }
                ptr2=ptr2+2;;
                ptr1=ptr2-1;

            }
            else {
                ptr2++;
                ptr1++;
            }
        }
        return count;
    }
}
//TC is O(N), SC is O(1)