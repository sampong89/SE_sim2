public class checkISBN {
    /**
     * To check require character for 13
     * @param isbn is the isbn of each book
     */
    public void checkLength(String isbn) {
        int longs = isbn.length();
        if (longs < 13) {
            throw new IllegalArgumentException("ISBN should be at least 13 characters.");
        }
    }
}
