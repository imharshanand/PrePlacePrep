package Arrays;

import java.util.Arrays;

public class SortByParity {
    public static void main(String[] args) {
        int [] A = {4,2,5,7};
        for (int i = 0, j = 1; i < A.length; i += 2)
        {
            while (j < A.length && A[j] % 2 == 1) //find next odd-index item A[j] with even value.
            {
                j += 2;
            }

            if (A[i] % 2 == 1) // if odd-index item A[i] is odd, swap it with A[j].
            {
                int t = A[i];
                A[i] = A[j];
                A[j] = t;
                j += 2;
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
