package subarray;

import java.util.ArrayList;

//given 0-1 subarray, return all the indices that can act as center of 2*B+1 length alternating subarray
public class AlternatingSubarray {
    static ArrayList<Integer> solve(ArrayList<Integer>A, int B) {
        int N=A.size();

        ArrayList<Integer>output=new ArrayList<Integer>(); //make an arraylist to store the output
        //find indices that can act as center of (2*B+1) 0-1 subarray and store in arraylist

        if(B==0) {   //if B is 0, length is 1, so all elements will be considered
            for (int i=0; i<N; i++) {
                output.add(i);
            }
        }

        //lets try using 2 pointer approach
        //logic: if 1st element=next element, move on using window sliding technique
        //else if different move into  a while loop and keep iterating we get same element
        //if no same and all alternative, return the mid index
        else if (B>0) {

            int length=(B*2)+1;
            int i=0;
            int j=length-1;
            int mid_index=(j-i)/2+i;

            while (i<=N-length){

                if (A.get(i)==A.get(i+1)) { //if equal, move on
                    i++;
                    j++;
                }

                else if (A.get(i)!=A.get(i+1)) {
                    int temp_i=i;
                    mid_index=(j-i)/2+i;

                    while (temp_i<(i+length-1) && A.get(temp_i)!=A.get(temp_i+1)) {
                        temp_i++;

                        if (temp_i==length+i-1) {
                            output.add(mid_index);
                        }
                    }
                    //if equal, loop will break
                    i++;
                    j++;
                    if (i==N-length+1 && j==N) {
                        return output;
                    }
                }
            }

        }

        return output;
    }
}
//TC is O(N^2), SC is O(1) as created arraylist coz that is the only way we have to return the output


    }
}
