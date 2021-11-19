class Solution {
    int isPalindrome(String S) {
        int low = 0;
        int high = S.length()-1;
        while(low < high){
            if(low == high){
                return 1;
            }
            else if(S.charAt(low) == S.charAt(high)){
                low++;
                high--;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
};