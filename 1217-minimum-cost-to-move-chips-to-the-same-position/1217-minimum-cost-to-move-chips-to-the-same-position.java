class Solution {
    public int minCostToMoveChips(int[] position) {
        int E = 0;
        int O = 0;
        int n = position.length;
        for(int i = 1; i <= n; i++){
            if(position[i - 1] % 2 == 0){
                E += 1;
            }
            else{
                O += 1;
            }
        }
        return(Math.min(E,O));
        
    }
}