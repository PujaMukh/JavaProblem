package ModularArithmatic;
//find if 2 rectangles overlap
public class RectanglesOverlap {
    public int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
        //hint: draw in a grap x and y axis
        //check if the rectangle is on top or bottom 1st
        if (F>=D || H<=B) {
            return 0;
        }
        else if(G<=A || C<=E) {
            return 0;
        }
        return 1;
    }
}
//TC is O(1), SC is O(1)
