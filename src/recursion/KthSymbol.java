package recursion;
//google question- start a matrix with 0 and replace all 0 with 0 1 in next row and all 1 with 1 0
//continue the process and find Ath row and Bth index (B is 1 indexed)
public class KthSymbol {

    //if parent is in i index, child is in 2i and 2i+1 index
    //vice versa , for same children, parent is i/2
    static int find(int A, int B) {
        B=B+1; //since B is 1-indexed
        if (A==0) { //base condition or when to break (for row 0)
            return 0;
        }
        int p=find(A-1, B/2); //B/2 is parent (2i and 2i+1 are children and parent is i/2)
        if (B%2==0){  //if child is even(child=2i), then we can return same based on pattern
            return p;
        }
        else {
            return 1-p;   //else return opposite if child is odd (child=2i+1)
        }
    }
}
