public class checkfield {

    /**
     * This function is used for check the input from user whether it is null, empty or blank
     * @param field value is got from user
     * @param label variable name
     */

    public void checkConditionField(String field, String label) {
        if (field == null) {
            throw new NullPointerException("The argument is needed");
        }else if (field.isEmpty() || field.isBlank()) {
            throw new IllegalArgumentException("The argument should not be blank or empty.");
        }
    }
}
