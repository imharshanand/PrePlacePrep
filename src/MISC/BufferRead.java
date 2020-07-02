package MISC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferRead
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println("Integer: " + a);

        double d = Double.parseDouble(br.readLine());
        System.out.println("Double: " + d);

        String s = br.readLine();
        System.out.println("String: " + s);

        char c1 = (char)br.read();
        System.out.println("Char: " + c1);
        char c2 = (char)br.read();
        System.out.println("Char: " + c2);

        //Array Input
        int arr [] = new int[10];
        for(int i=0; i<10; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));
    }
}
