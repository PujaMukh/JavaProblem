package java_string;

import java.util.ArrayList;

//check if all characters in a string are from a-z or A-Z
public class Alpha {
    public int solve(ArrayList<Character> A) {
        for (int i=0; i<A.size(); i++) {
            if (A.get(i)>='a' && A.get(i)<='z') {

            }
            else if (A.get(i)>='A' && A.get(i)<='Z') {

            }
            else {
                return 0;
            }
        }
        return 1;
    }
}
//TC is O(N), SC is O(1)