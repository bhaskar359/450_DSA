public class Solution {
    public int solve(int A) {
        int sum = 0;
        while(A > 0 || sum > 9){
            if(A == 0){
                A = sum;
                sum = 0;
            }
            int number = A%10;
            sum = sum + number;
            A = A/10;
        }
        return sum;
    }
}
