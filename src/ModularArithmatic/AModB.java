package ModularArithmatic;
//given a ver very large number in the form of a string A and an int B, find A%B
public class AModB {
    public int findMod(String A, int B) {

        long sum=0;
        int N=A.length();

        for (int i=0; i<N; i++) {
           // (A+B)%M=(A%M+B%M)%M
            sum=((sum*10)%B+(A.charAt(i)-'0')%B)%B;
        }
        return (int)(sum%B);
    }

}
//TC is O(N), SC is O(1)
