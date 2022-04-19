package LeetcodeProblems;
//ques no 258
//find digital root in O(1) time using formula
public class DigitalRootUsingFormula {
    static int findDigitalRoot(int num) {
        if (num==0) {
            return 0;
        }
        if (num%9==0) {
            return 9;
        }
        return num%9;
    }
}
//TC is O(1), sC is O(1)
