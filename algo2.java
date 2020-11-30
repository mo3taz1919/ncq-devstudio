package test;

public class algo2 {

    public int[] solution(int[] a, int[] b) {
        final int[] cn = new int[a.length < 2 ? 2 : a.length];
        cn[0] = 1;
        cn[1] = 2;
                for (int i = 2; i < a.length; i++) {
            
            cn[i] = (cn[i - 1] + cn[i - 2]) & ((1 << 30) - 1);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = cn[a[i] - 1] & ((1 << b[i]) - 1);
        }
        return a;
    }
}
