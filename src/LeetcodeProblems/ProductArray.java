package LeetcodeProblems;
//leetcode 238
//product of array except self
public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        //1) create product front and product back array
        //2) element in o/p= prod front(i-1)* prodback(i+1)
        //3) consider all edge cases as well when creating the arrays

        int N=nums.length;

        //product front array
        int[]prodFront=new int[N];
        prodFront[0]=nums[0]; //edge case

        for (int i=1; i<N; i++) {
            prodFront[i]=prodFront[i-1]*nums[i];
        }

        //product back array
        int[]prodBack=new int[N];
        prodBack[N-1]=nums[N-1];

        for (int i=N-2; i>=0; i--) {
            prodBack[i]=prodBack[i+1]*nums[i];
        }

        int[]output=new int[N];

        for (int i=0; i<N; i++) {
            if (i==0) {
                output[0]=prodBack[i+1];
            }
            else if (i==N-1) {
                output[N-1]=prodFront[i-1];
            }
            else {
                output[i]=prodFront[i-1]*prodBack[i+1];
            }
        }
        return output;

    }
}
//TC is O(N), SC is O(N)
