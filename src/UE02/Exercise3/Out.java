package UE02.Exercise3;

public class Out {

    public static void main(String[] args) {            // Test Main method
        Out.out(true);
        Out.out(5);
        Out.out(5.3);
        Out.out('a');
        Out.out("OUT");
        Out.out(new Object());
    }
    public static void out(boolean out){            // Overload of out-Method with different data types
        System.out.println(out);
    }

    public static void out(int out){
        System.out.println(out);
    }

    public static void out(double out){
        System.out.println(out);
    }

    public static void out(char out){
        System.out.println(out);
    }

    public static void out(String out){
        System.out.println(out);
    }
    public static void out(Object out){
        System.out.println(out);
    }
}
