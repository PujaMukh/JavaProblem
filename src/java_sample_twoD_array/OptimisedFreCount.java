package java_sample_twoD_array;
//frequency count of an arraylist and return the count in an arraylist
public class OptimisedFreCount {

        public ArrayList<Integer> solve(ArrayList<Integer> A) {

            ArrayList<Integer>B=new ArrayList<Integer>(); //create new arraylist B to store the output
            ArrayList<Integer>freq=new ArrayList<Integer>();

            for (int i=0; i<1001; i++) {
                freq.add(0);
            }
            for (int i=0; i<A.size(); i++) {
                int c=A.get(i);
                freq.set(c,freq.get(c)+1);
            }

            for (int i=0; i<A.size(); i++) {
                B.add(freq.get(A.get(i)));
            }
            return B;
        }
    }

