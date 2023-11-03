package exercise;

// BEGIN
public class NegativeRadiusException extends Exception {
    private final String errorCode;

    public NegativeRadiusException(String errorCode, String errorMessage) {
        super(errorMessage);

        this.errorCode = errorCode;
    }

    public NegativeRadiusException(String errorMessage) {
        super(errorMessage);

        this.errorCode = "";
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}
// END
