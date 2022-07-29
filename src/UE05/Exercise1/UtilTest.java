package UE05.Exercise1;
class Util {

    // liefert die kleinste Zahl des uebergebenen Arrays
    public static int minimum(int[] values) throws NullArrayException , EmptyArrayException{         // method signature with throws keyword and exceptions
        if(values == null){                         // if statements to throw an exception
            throw new NullArrayException();              //need to create a new Exception object
        }
        if(values.length == 0){
            throw new EmptyArrayException();
        }
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return min;
    }

    // konvertiert den uebergebenen String in einen int-Wert
    public static int toInt(String str) {
        int result = 0, factor = 1;
        char ch = str.charAt(0);
        switch (ch) {
            case '-':
                factor = -1;
                break;
            case '+':
                factor = 1;
                break;
            default:
                result = ch - '0';
        }
        for (int i = 1; i < str.length(); i++) {
            ch = str.charAt(i);
            int ziffer = ch - '0';
            result = result * 10 + ziffer;
        }
        return factor * result;
    }

    // liefert die Potenz von zahl mit exp,
    // also zahl "hoch" exp (number to the power of exp)
    public static long power(long number, int exp) throws MinusNumberException {
        if(number < 0){
            throw new MinusNumberException();
        }
        if (exp == 0) {
            return 1L;
        }
        return number * Util.power(number, exp - 1);
    }
}

public class UtilTest {

    // Testprogramm
    public static void main(String[] args) {

        int zahl = 2;

        try {                                   // try block
            System.out.println(zahl + " hoch " + zahl + " = " + Util.power(-1, zahl));
        } catch (MinusNumberException e){           // catch block
            System.out.println("MinusNumberException");
        }



        try {                               // try Block with code
            System.out.println(Util.minimum(new int[]{1, 6, 4, 7, -3, 2}));
            System.out.println(Util.minimum(new int[0]));
            System.out.println(Util.minimum(null));
        } catch (EmptyArrayException | NullArrayException e) {           // catch block with two exceptions to throw if something happens
          System.out.println("Array empty or null");
        }
    }
}


