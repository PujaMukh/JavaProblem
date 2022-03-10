package java_sample_oned_array;

public class PrimalPower {
        //return the primal power which is the count of prime numbers present
        public int solve(ArrayList<Integer> A) {
            //1st we have to find factors of all numbers. If factor is 2, then it is prime numbers
            int N=A.size();
            int c1=0;
            for (int i=0; i<N; i++) {
                int c=0;

                for (int j=1; j<=A.get(i); j++) {
                    if ((A.get(i)%j)==0) {
                        c++;
                    }
                }
                if (c==2) {
                    c1++;
                }

            }
            return c1;
        }
    }


