class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
    int c1 = coordinate1.charAt(0) - 'a', c2 = coordinate2.charAt(0) - 'a';
	int r1 = coordinate1.charAt(1) - '1', r2 = coordinate2.charAt(1) - '1';
	boolean b1Black = r1 % 2 == 0 ? c1 % 2 == 0 : c1 % 2 != 0;
	boolean b2Black = r2 % 2 == 0 ? c2 % 2 == 0 : c2 % 2 !=0;
	return b1Black == b2Black;
    }
}