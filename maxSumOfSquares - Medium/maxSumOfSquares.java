class Solution {
    public String maxSumOfSquares(int num, int sum) {

        int[] numT = new int[num];

        StringBuilder resultat = new StringBuilder("");

        if (sum > num * 9) {
            return "";
        }

        for (int i = 0; i < numT.length; i++) {
            if (sum >= 9) {
                sum -= 9;
                numT[i] = 9;
            }

            else {
                numT[i] = sum;
                sum = 0;
            }
        }
        for (int n : numT) {
            resultat.append(n);
        }

        return resultat.toString();
    }

}