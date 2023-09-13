import java.util.Objects;

public class Volic implements Comparable<Volic>{
    private String firstName;
    private String secondName;
    private int cisloObcanky;

    public Volic(String firstName, String secondName, int cisloObcanky) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.cisloObcanky = cisloObcanky;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.matches("([A-Z])([a-z])*$")){
            this.firstName = firstName;
        }else {
            throw new IllegalArgumentException("Invalid First Name");
        }

    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        if(firstName.matches("^[A-Z][A-Za-z]{2,}$")){
            this.firstName = firstName;
        }else {
            throw new IllegalArgumentException("Invalid Second Name");
        }
    }

    public int getCisloObcanky() {
        return cisloObcanky;
    }

    public void setCisloObcanky(int cisloObcanky) {
        if(firstName.matches("")){
            throw new IllegalArgumentException("Invalid Obcansky prukaz");
        }else {
            this.cisloObcanky = cisloObcanky;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volic volic = (Volic) o;
        return cisloObcanky == volic.cisloObcanky;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cisloObcanky);
    }

    @Override
    public String toString() {
        return "Volic{" + "firstName='" + firstName + '\'' + ", secondName='" + secondName + '\'' + ", cisloObcanky=" + cisloObcanky + '}';
    }

    @Override
    public int compareTo(Volic o) {
        return this.getSecondName().compareTo(o.getSecondName());
    }
}
