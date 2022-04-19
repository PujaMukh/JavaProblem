package BitManupulation;
//given 2 binary strings, add and return a string
public class AddBinaryStrings {
    //factors to consider: string might be same length or different

    public String addBinary(String A, String B) {
        int N=A.length();
        int M=B.length();

        int i=N-1;
        int j=M-1;
        int sum=0;
        int carry=0;
        int digit=0;
        StringBuilder sb=new StringBuilder();

        while (i>=0 && j>=0) {
            sum=(A.charAt(i)-'0')+ (B.charAt(j)-'0')+carry;
            carry=sum/2;
            digit=sum%2;
            sb.append(digit);

            i--;
            j--;
        }



        if (j>=0 && N!=M) {

            while (j>=0) {
                sum=B.charAt(j)-'0'+carry;
                carry=sum/2;
                digit=sum%2;
                sb.append(digit);
                j--;

            }

        }

        else if (i>=0 && N!=M) {
            while(i>=0) {
                sum=A.charAt(i)-'0'+carry;
                carry=sum/2;
                digit=sum%2;
                sb.append(digit);
                i--;
            }
        }

        if (carry>0) {
            sb.append(carry);
        }

        //now reverse the StringBuilder

        return sb.reverse().toString();


    }
}
//TC is O(N) and SC is O(1) when not considering o/p
