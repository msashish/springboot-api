package learn.basic.springbootapi.database;

public class Quote implements Record {

    private String message; // Can be book name or a simple message library
    private Key key; // the identification key


    public Quote(String quote, Key k) {
        this.message = quote;
        this.key = k;
    }

    /** getBalance reports the current account balance
     * @return the balance */
    public String getMessage() { return message; }


    /** getKey returns the account’s key
     * @return the key */
    public Key getKey() { return key; }

}
