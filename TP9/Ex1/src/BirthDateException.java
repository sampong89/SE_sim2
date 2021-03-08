public class BirthDateException extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = -2570597919309692419L;

    public BirthDateException() {
        super("Invalid date of birth");
    }

    public BirthDateException(String message) {
        super(message);
    }
}
