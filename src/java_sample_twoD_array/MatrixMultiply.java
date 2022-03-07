package java_sample_twoD_array;

public class MatrixMultiply {

        public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

            int N=A.size(); //row size
            int M=A.get(0).size(); //coloumn size

            ArrayList<ArrayList<Integer>>D=new ArrayList<ArrayList<Integer>>();
            //create new matrix D to store the output

            for (int i=0; i<N; i++) {
                ArrayList<Integer>temp=new ArrayList<Integer>();
                //create new arraylist temp to store each output row
                for (int j=0; j<M; j++) {
                    temp.add((A.get(i).get(j))*B); //store each row in temp arraylist
                }
                D.add(temp); //after loop finishes, store all the temps in D matrix which is the output
            }
            return D; //return D matrix
        }
    }

