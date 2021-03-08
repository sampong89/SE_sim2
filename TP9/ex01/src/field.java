// import java.util.*;

    /**
     * 
     * this function is used for check the input is empty or not
     * @Param field is the variable's name
     * @Param label is the name of the input
     * @throw {@link NullPointerException} in case for skip the input
     * {@link IllegalArgumentException} in case for input space or tab
     */
public class field {
    public void checkNullEmptyBlank(String field, String label) {
        if (field == null) {
            throw new NullPointerException("Name should not be null");
        }
        if (field.isEmpty() || field.isBlank()) {
            throw new IllegalArgumentException("Name should not be blank or empty ");
        }
    }
}
