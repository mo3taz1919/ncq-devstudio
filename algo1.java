package test;

public class algo1 {
	  public int[] solution(final int n, final int[] a) {
	        int max = 0;
	        int setmax = 0;
	        final int[] result = new int[n];
	        for (final int value : a) {
	            if (value >= 1 && value <= n) {
	                final int ci = value - 1;
	                if (result[ci] < setmax) {
	                    result[ci] = setmax;
	                }
	                result[ci]++;
	                if (result[ci] > max) {
	                    max = result[ci];
	                }
	            } else if (value == n + 1) {
	                setmax = max;
	            }
	        }
	        for (int i = 0; i < n; i++) {
	            if (result[i] < setmax) {
	                result[i] = setmax;
	            }
	        }
	        return result;
	    }
}
