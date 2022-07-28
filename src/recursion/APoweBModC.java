package recursion;
//find A^B%C using recursion
public class APoweBModC {
    public int pow(int A, int B, int C) {
        if(A == 0){
            return 0;
        }
        if(B==0){
            return 1;
        }
        long p=pow(A, B/2, C);
        long m=((p+C)%C);
        if(B%2==0){
            return (int)((m*m)%C);
        }
        else{
            return (int)((((A+C)%C)*((m*m)%C)+C)%C);
        }
    }
}
