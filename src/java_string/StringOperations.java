package java_string;
//Concatenate the string with itself.
//Delete all the uppercase letters.
//Replace each vowel with '#'.
public class StringOperations {
    public String solve(String A) {
        StringBuilder sb=new StringBuilder();
        for (int i=0; i<A.length(); i++) {
            if (A.charAt(i)>='a' && A.charAt(i)<='z') {
                if (A.charAt(i)=='e' ||A.charAt(i)=='i' ||A.charAt(i)=='o' ||A.charAt(i)=='u' || A.charAt(i)=='a') {
                    sb.append('#');
                }
                else {
                    sb.append(A.charAt(i));
                }

            }

        }
        sb.append(sb);
        return sb.toString();


    }
}
