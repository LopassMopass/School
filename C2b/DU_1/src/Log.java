import java.time.LocalDateTime;
import java.util.Objects;


public class Log implements Comparable<Log>{
    private LocalDateTime time;
    private int ID;
    private String typeOfProblem;

    @Override
    public int compareTo(Log o){
        return this.time.compareTo(o.time);
    }

    public Log(LocalDateTime time , int ID, String typeOfProblem) {
        this.setTime(time);
        this.setID(ID);
        this.setTypeOfProblem(typeOfProblem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return ID == log.ID && typeOfProblem.equals(log.typeOfProblem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, typeOfProblem);
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {

        this.time = time;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public String getTypeOfProblem() {
        return typeOfProblem;
    }

    public void setTypeOfProblem(String typeOfProblem) {
        this.typeOfProblem = typeOfProblem;
    }

    @Override
    public String toString() {
        return "Log{" + "date='" + time + ", ID='" + ID + ", typeOfProblem='" + typeOfProblem + '}';
    }
}
