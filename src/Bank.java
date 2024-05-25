//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


class Bank {
    public String name;
    private String iban;
    private double bakiye;

    public Bank(String name, String iban, double bakiye) {
        this.name = name;
        this.iban = iban;
        this.bakiye = bakiye;
    }

    public void paraYatir(double para) {
        this.bakiye += para;
    }

    public void paraCek(double para) {
        this.bakiye -= para;
    }

    public void paraGonder(double para, String iban) {
        this.bakiye -= para;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return this.iban;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return this.bakiye;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
