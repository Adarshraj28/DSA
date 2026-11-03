class Solution {
    public int[] closestDivisors(int num) {
        int[] a = find(num + 1);
        int[] b = find(num + 2);

        if (Math.abs(a[0] - a[1]) < Math.abs(b[0] - b[1])) {
            return a;
        }
        return b;
    }
    private int[] find(int n){
        for (int i = (int) Math.sqrt(n); i >= 1; i--){
            if (n % i == 0){
                return new int[]{i, n / i};
            }
        }
        return new int[]{1, n};
    }
}
