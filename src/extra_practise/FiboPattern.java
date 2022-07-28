package extra_practise;
//print fibonacci pattern
//eg for N=4
//0
//1 1
//2 3 5
//8 13 21 34

public class FiboPattern {
    static void printFibo(int N) {
        for (int i = 1; i <=2; i++) {
            //printing 1st 2 rows 1st
            if (i == 1) {
                System.out.println("0");
            }
            else if (i==2) {
                System.out.println("1"+" "+"1");
            }
        }
        int sum1=1;
        int sum2=1;
        for (int i=3; i<=N; i++) {
            for (int j=1; j<=i; j++) {
                int temp=sum1; //2
                sum1=sum1+sum2; //2
                System.out.print(sum1+" ");
                sum2=temp; //1
            }
            System.out.println();
        }
    }
}
