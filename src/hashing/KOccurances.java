package hashing;
import java.lang.*;
import java.util.*;
//take the sum of all elements with freq==k, if not there, return -1;
public class KOccurances {
    static int getSum(int A, int B, ArrayList<Integer> C) {
        //create a freq hashmap and add to sum if freq==k
        //return sum%10^9+7
        //if nothing return -1
        int sum=-1;

        HashMap<Integer,Integer>eleToFreq=new HashMap<>(); //declare the hashmap
        //key=ele, value=freq
        for (int i=0; i<A; i++) { //A is size given

            if (eleToFreq.containsKey(C.get(i))) { //if there...
                int val=eleToFreq.get(C.get(i)); //get the value
                eleToFreq.put(C.get(i), val+1);

            }
            else {
                eleToFreq.put(C.get(i), 1);
            }

        }
        //now iterate through freq hashmap again and see if it is equal to B
        int N=eleToFreq.size();//size of hashmap
        Set<Integer>keyContainer=eleToFreq.keySet();  //gives set of all keys in hashmap
        for(int key : keyContainer) { //keycontainer name is keyset and key is like i
           if (eleToFreq.get(key)==B) {
               if (sum==-1) {
                   sum=key;
               }
              else {
                   sum=sum+key;
               }
           }

        }
        return sum;

    }
    public static void main(String args[])   {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt(); //take input for size of array
        ArrayList<Integer>B=new ArrayList<>();
        for (int i=0; i<A; i++) {
            B.add(sc.nextInt());
        }
        int C=sc.nextInt();
        System.out.println(getSum(A,C,B));
    }

}
//TC is O(N), SC is O(N)
