package java_sample_twoD_array;
//using arraylist
public class MatrixMultiplication {

        public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

            int M=A.size(); //number of rows in matrix A r1
            int N=A.get(0).size(); //number of columns in matrix A c1


            int P=B.get(0).size(); //number of columns in matrix B c2

            //now create a new matrix C to store the output
            ArrayList<ArrayList<Integer>>C=new ArrayList<ArrayList<Integer>>();

            for (int i=0; i<M; i++) {
                ArrayList<Integer>temp=new ArrayList<Integer>();
                for (int j=0; j<P; j++) {

                    int sum=0;
                    for (int k=0; k<N; k++) {
                        sum=sum+(A.get(i).get(k)*B.get(k).get(j));
                    }
                    temp.add(sum);
                }
                C.add(temp);
            }

            return C;
        }
    }


