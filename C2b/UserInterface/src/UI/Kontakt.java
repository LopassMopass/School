package UI;

import java.time.LocalDate;

public class Kontakt {
    private String name;
    private String sureName;
    private String email;
    //Bohuzel nevim jak zprovoznit tento program s LocalDate, a proto pouzivam String
    private String date;
    private String phone;

    public Kontakt(String name, String sureName, String email, String date, String phone) {
        this.name = name;
        this.sureName = sureName;
        this.email = email;
        this.date = date;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException{
        if (name.matches("^[A-Z][a-zA-Z]{2,}$")){
            this.name = name;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) throws IllegalArgumentException{
        if (sureName.matches("^[A-Z][a-zA-Z]{3,}$")){
            this.sureName = sureName;
        }else {
            throw  new IllegalArgumentException();
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException{
        if (email.matches("^[a-zA-Z0-9_!#$%&’*+=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")){
            this.email = email;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) throws IllegalArgumentException{
        if (date.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")){
            this.date = date;
        }else {
            throw  new IllegalArgumentException();
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws IllegalArgumentException{
        if (phone.matches("[0-9]{9}")){
            this.phone = phone;
        }else {
            throw  new IllegalArgumentException();
        }
    }

    public String toString() {
        return name+" "+sureName+", email: "+email+", date: "+date+"/ phone: "+ phone;
    }
}
