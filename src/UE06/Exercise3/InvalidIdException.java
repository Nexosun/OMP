package UE06.Exercise3;

public class InvalidIdException extends Exception{
    public String getId() {
        return "null";  // returns null as String
    }
}
