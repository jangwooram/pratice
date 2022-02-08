package objectClass;

import java.util.Scanner;

public class BankApp {

        private String ano;
        private String owner;
        private int blance;

        public BankApp(String ano, String owner, int blance) {
            this.ano =ano;
            this.owner = owner;
            this.blance = blance;
        }

        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBlance() {
        return blance;
    }

    public void setBlance(int blance) {
        this.blance = blance;
    }
}
