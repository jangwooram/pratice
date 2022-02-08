package exercise;

public class Account {
    private int blance;
    private final int min = 0;
    private final int max = 1000000;

    public Account(int blance) {
        if (blance <= max && blance >= min) {
            this.blance = blance;
        }
    }
    public Account(){

    }


    void setBlance(int blance) {
        if (blance <= max && blance >= min){
            this.blance = blance;
        }
    }

    int getBlance() {
        return blance;
    }
}
