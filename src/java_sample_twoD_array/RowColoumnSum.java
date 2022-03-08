package java_sample_twoD_array;
//sum of row and coloumn
public class RowColoumnSum {
        public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

            int N=A.size(); //number of rows
            int M=A.get(0).size(); //number of coloumns

            ArrayList<Integer>B=new ArrayList<Integer>(); //create arraylist B to store output

            for (int i=0; i<N; i++) { //loop to get sum of rows
                int sum1=0;
                for (int j=0; j<M; j++) {
                    sum1=sum1+A.get(i).get(j);
                }
                B.add(sum1);
            }


            for (int j=0; j<M; j++) { //loop to get sum of columns
                int sum2=0;
                for (int i=0; i<N; i++) {
                    sum2=sum2+A.get(i).get(j);
                }

                B.add(sum2);
            }
            return B;
        }
    }


