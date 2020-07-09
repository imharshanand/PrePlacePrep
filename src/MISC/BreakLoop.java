package MISC;

public class BreakLoop {
    public static void main(String[] args) {
        int i= 0 , j = 0;
        outer:
        for(i=0; i<5; i++)
        {
            for (j = 0; j < 2; j++)
            {
                System.out.println("i*j = " + i*j);
                if(i*j == 4)
                    break outer;
            }

        }
    }
}
