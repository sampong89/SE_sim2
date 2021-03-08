public class checkField {
    /**
     * use for check the input from user
     * @param field every field in {@link categories}
     */
    public void checkEmptyOrNull(String field){
        if (field == null){
            throw new NullPointerException("This field should not be empty.");
        }
        if (field.isBlank() || field.isEmpty()){
            throw new IllegalArgumentException("This Field shouldn't be left blank.");
        }
    }
}
