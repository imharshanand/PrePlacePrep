package OOP;

//Java program to illustrate the concept of single inheritance
import java.util.*;

class A
{
    public int getNo()
    {
        return 1;
    }
}

class B extends A
{
    public int getNo()
    {
        return 2;
    }
}
// Driver class
public class Inheritance
{
    public static void main(String[] args)
    {
        A a = new B();
        System.out.println(a.getNo());
    }
}
