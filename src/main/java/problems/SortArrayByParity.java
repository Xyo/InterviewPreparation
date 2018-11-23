https://leetcode.com/problems/sort-array-by-parity/

// With access to apache packages

import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

class Solution {
    public int[] sortArrayByParity(int[] A) {
        // convert primitive to object integer and sort by even > odd
        Integer[] sorted = ArrayUtils.toObject(A);
        Arrays.sort(sorted, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if (o2%2==0 && o1%2==0) return 0;
                if (o2%2==0 && o1%2==1) return 1;
                if (o2%2==1 && o1%2==0) return -1;
                if (o2%2==1 && o1%2==1) return 1;
            }
        });
        // convert back to primitive
        return list.stream().mapToInt(i->i).toArray();
    }
}

// Without apache packages
