package Problems;

// https://leetcode.com/problems/hamming-distance/description/
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        String xorResult = Integer.toBinaryString( x^y);
        for( char c : xorResult.toCharArray()){
            if(c == '1') ++count;
        }
        return count;
    }
}
