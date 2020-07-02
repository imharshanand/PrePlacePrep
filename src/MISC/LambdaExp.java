package MISC;
import java.util.Arrays;
public class LambdaExp
{
    public static void main(String[] args) {
        int [][] arr = {{3,4},{1,2},{7,10},{10,5},{8,3}};
        //Arrays.sort(arr, (a,b) -> a[0] < b[0] ? a[]);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
        System.out.println(Arrays.toString(arr[4]));
    }
}
