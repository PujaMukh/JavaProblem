package arrays_maths;
//find largest value in X such that A%X==0 and gcd of X and b=1
public class LargestCoPrimeDivisor {
    //since max value of X will be A, if gcd of A and B==1, return A
    //else remove largest divisor one by one from A


    static int gcd(int a, int b) {
        if (a==0) {
            return b;
        }
        return gcd(b%a, a);
    }
    public int cpFact(int A, int B) {
        //find max valued
        //A%X=0
        //gcd(X,B)=1
        //observation: X will be max A
        if (gcd(A,B)==1) {
            return A;
        }
        return cpFact(A/gcd(A,B), B);
        //or
        //while(GCD(A,B) != 1) //the loop will break when we get gcd of a and b =1
        //{
        //A=A/GCD(A,B);
        //}
        //return A;
        //}





    }
}
