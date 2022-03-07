package java_sample_twoD_array;
//check if both the matrices are equal
public class EqualMatrices {
    public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
            int N=A.size(); //number of rows
            int M=A.get(0).size(); //number of columns

            for (int i=0; i<N; i++) {    //logic loop
                for (int j=0; j<M; j++) {
                    if ((A.get(i).get(j)) !=(B.get(i).get(j))) {
                        return 0;
                    }
                }
            }
            return 1;
        }
    }


