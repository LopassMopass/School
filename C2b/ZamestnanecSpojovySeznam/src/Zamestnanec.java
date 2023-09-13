

public class Zamestnanec{
    private String firstName;
    private String secondName;
    private int pay;

    public Zamestnanec(String firstName, String secondName, int pay) {
        setFirstName(firstName);
        setSecondName(secondName);
        setPay(pay);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Zamestnanec{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", pay=" + pay +
                '}';
    }
}
