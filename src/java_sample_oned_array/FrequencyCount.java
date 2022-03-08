package java_sample_oned_array;
//given an arraylist A, return the frequency count of elements in arraylist B of same size

public class FrequencyCount {
        public ArrayList<Integer> solve(ArrayList<Integer> A) {

            ArrayList<Integer>B=new ArrayList<Integer>(); //create new arraylist B to store the output

            for (int i=0; i<A.size(); i++) {
                int c=0;
                for (int j=0; j<A.size(); j++) {
                    if (A.get(i)==A.get(j)) {
                        c++;
                    }
                }
                B.add(c);
            }
            return B;
        }
    }

