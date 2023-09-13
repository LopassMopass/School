public class Date {
    //Uplne zbytecne, je na to metoda v Jave => TimeDate
    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) throws Exception{
        if(day > 31 || day < 1){
            throw new Exception(day+"Cannot be a type of Day");
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) throws Exception{
        if (month > 12 || month < 1){
            throw new Exception(month+"Cannot be a type of Month");
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) throws Exception{
        if (year > 2022 || year < 1990){
            throw  new Exception(year+"Cannot be a type of Year");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return   "("+ day +". "+ month +"/ "+ year +")";
    }
}
