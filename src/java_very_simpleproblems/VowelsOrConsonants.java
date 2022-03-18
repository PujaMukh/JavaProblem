package java_very_simpleproblems;

public class VowelsOrConsonants {
    public static int isvowel(char c){
        int result=0;
        if ((c=='a') || (c=='e') || (c=='i') || (c=='o') || (c=='u')) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
