package lessons.CountingElements.MaxCounters;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        int base = 0;

        for (int i=0; i<A.length; i++) {
            int idx = A[i] - 1;
            if (A[i] == (N+1)) {
                base = max;
            } else {
                if (base > result[idx]) {
                    result[idx] = base;
                    result[idx]++;
                } else {
                    result[idx]++;
                }

                // Set max
                if (result[idx] > max) {
                    max = result[idx];
                }
            }
        }

        // lazy update
        for (int i=0; i<result.length; i++) {
            if (result[i] < base) {
                result[i] = base;
            }
        }
        return result;
    }
}
