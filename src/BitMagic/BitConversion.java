package BitMagic;

public class BitConversion {
    public static void main(String[] args) {
        String number = "5"; // Number
        int sBase = 10; // Source Base Octal
        int dBase = 2; // Destination Base Decimal
        System.out.println("Source 10 to Dest 2: "+ baseConversion(number, sBase, dBase));
    }
    public static String baseConversion(String number, int sBase, int dBase)
    {
        System.out.println("Source with Base 10: "+Integer.parseInt(number, sBase));
        return Integer.toString( Integer.parseInt(number),dBase );
    }
}
