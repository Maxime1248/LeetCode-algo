
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int resultat = 0;
        int y = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 1 || nums[i] > 50) {
                return 0;
            }
            if (n % y == 0) {
                resultat += nums[i] * nums[i];
                System.out.println(nums[i]);
            }
            y++;
        }
        return resultat;
    }
}