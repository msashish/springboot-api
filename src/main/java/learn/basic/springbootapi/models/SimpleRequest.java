package learn.basic.springbootapi.models;

import learn.basic.springbootapi.database.IntegerKey;

public class SimpleRequest {
    private String message;
    private int key;


    public String getMessage() {
        return message;
    }

    public IntegerKey getKey() {
        return new IntegerKey(key);
    }

}
