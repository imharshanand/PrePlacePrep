package BitMagic;

public class BitConversion {
    public static void main(String[] args) {
        String number = "555"; // Number
        int sBase = 10; // Source Base Octal
        int dBase = 2; // Destination Base Decimal
        System.out.println("Octal to Decimal: "+ baseConversion(number, sBase, dBase));
        dBase = 16; // Destination Base Hexadecimal
        System.out.println("Octal to Hex: "+ baseConversion(number, sBase, dBase));
    }
    public static String baseConversion(String number, int sBase, int dBase)
    {
        System.out.println("Source Base: "+Integer.parseInt(number, sBase));
        return Integer.toString( Integer.parseInt(number, sBase),dBase );
    }
}
