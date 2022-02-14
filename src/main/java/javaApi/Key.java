package javaApi;

public class Key {
    int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key ckey = (Key) obj;
            if (this.number == ckey.number) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return number;
    }
}
