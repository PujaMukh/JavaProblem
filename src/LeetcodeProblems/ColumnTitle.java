package LeetcodeProblems;
//leetcode no 168
//given a string return its column number. eg AB will be 28
public class ColumnTitle {
    //edge case will be mod 26. Handle it separately
    public String convertToTitle(int columnNumber) {

        StringBuilder sb=new StringBuilder();

        char[] ch=new char[27];
        ch[0]='#';

        for (int i=0; i<26; i++) {
            ch[i+1]=(char)('A'+i);
        }


        while (columnNumber>0) {

            if (columnNumber<=26) {
                sb.append(ch[columnNumber]);
                break;
            }


            int d=columnNumber%26;

            if (d==0) {
                sb.append('Z');
                columnNumber=columnNumber-1;
            }

            else {
                sb.append(ch[d]);
            }

            columnNumber=columnNumber/26;

        }

        return sb.reverse().toString();

    }
}
