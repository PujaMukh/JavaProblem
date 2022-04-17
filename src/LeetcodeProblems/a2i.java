package LeetcodeProblems;
//leetcode ques no 8
public class a2i {
        public int myAtoi(String s) {
            //check the constraints and build according to the constraints

            int N=s.length(); //length of the original string

            StringBuilder sb=new StringBuilder();
            int num=1;
            int start=0;

            if (N==0) {
                return 0;
            }

            if (s.charAt(0)>='a' && s.charAt(0)<='z' || s.charAt(0)>='A' && s.charAt(0)<='Z') {
                return 0;
            }

            while (start<N && s.charAt(start)==' ') {
                start++;
            }

            if (start==N) {
                return 0;
            }

            if (s.charAt(start)=='-') {
                num=num*(-1);
                start++;
            }

            else if (s.charAt(start)=='+') {
                start++;
            }



            if (N==0) {
                return 0;
            }

            for (int i=start; i<N; i++) {
                if (s.charAt(i)>='0' && s.charAt(i)<='9') {
                    sb.append(s.charAt(i));
                }


                else {
                    break;
                }
            }


            //now is the time to convert to integer
            //things to remember: convert from string to integer
            //should be in int range
            //add -1 at back if number was -ve

            int M=sb.length(); //length of the stringbuilder to be converted to int

            for (int i=0; i<M; i++) {
                System.out.print(sb.charAt(i));
            }
            int rev=0;

            for (int i=0; i<M; i++) {


                if (rev>Integer.MAX_VALUE/10) {

                    if (num==-1) {
                        return Integer.MIN_VALUE;
                    }
                    else {
                        return Integer.MAX_VALUE;
                    }
                }

                else if (rev==Integer.MAX_VALUE/10) {

                    if (num==1 && (sb.charAt(i)-'0')>7) {
                        return Integer.MAX_VALUE;
                    }

                    else if (num==-1 && (sb.charAt(i)-'0')>8) {
                        return Integer.MIN_VALUE;
                    }


                }

                rev=rev*10+sb.charAt(i)-'0';
            }

            if (num==-1) {
                return (num)*rev;
            }
            return rev;
        }
    }

//TC O(N), SC is O(1)







