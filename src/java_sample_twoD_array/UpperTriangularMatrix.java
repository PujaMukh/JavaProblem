package java_sample_twoD_array;
//return 1 if the matrix is upper triangular matrix, else return 0
public class UpperTriangularMatrix {

        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public int solve(final List<ArrayList<Integer>> A) {
            //A[i][j] will be 0 for all j<i if it is true

            int N=A.size(); //size same for row and coloumn

            for (int i=1; i<N; i++) {
                for (int j=0; j<N-1; j++) {
                    while(j<i) { //enter loop while j<i
                        if (A.get(i).get(j)==0) { //if it is 0, continue
                        }
                        else {
                            return 0; //if not 0, then break and return 0
                        }
                        break;
                    }
                }

            }
            return 1; //if all loop completes and is true, return 1
        }
    }


