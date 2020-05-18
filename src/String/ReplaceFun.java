package String;

public class ReplaceFun
{
    public static void main(String args[])
    {
        String A = "An apple a day keeps the doctor away, apple is good the";
        String B = "a";

        //A = A.replace('a','9'); //An 9pple 9 d9y keeps the doctor 9w9y
        //A = A.replace("apple",'9'); //ERROR
        //A = A.replace("apple","9"); // An 9 a day keeps the doctor away, 9 is good
        //A = A.replaceFirst("the", "9");//An apple a day keeps 9 doctor away, apple is good the
        //A = A.replaceFirst('a', '9'); //ERROR
        System.out.println(A);


    }
}
