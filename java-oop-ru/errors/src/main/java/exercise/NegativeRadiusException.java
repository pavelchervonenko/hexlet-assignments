package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    private String string;

    public NegativeRadiusException(String string) {
        this.string = string;
    }
}
// END
