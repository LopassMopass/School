package Logs;

import java.time.LocalDateTime;
import java.util.Objects;

public class Log implements Comparable<Log> {

    public int ID;
    public String comment;
    public LocalDateTime dateTime;
    public LogType logType;

    //Override constructor -> dateTime from variables or logType default
    public Log(int ID, String comment, LocalDateTime dateTime, LogType logType) {
        this.setID(ID);
        this.setComment(comment);
        this.setDateTime(dateTime);
        this.setLogType(logType);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return getID() == log.getID() && getLogType() == log.getLogType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getID(), getLogType());
    }


    @Override
    public int compareTo(Log o) {
        return this.getDateTime().compareTo(o.getDateTime());
    }

    @Override
    public String toString() {
        return "Logs.Log{" +
                "ID=" + ID +
                ", comment='" + comment + '\'' +
                ", dateTime=" + dateTime +
                ", logType=" + logType +
                '}';
    }

    //region Getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if (ID < 0) throw new IllegalArgumentException("ID cannot be negative");
        this.ID = ID;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        if (dateTime.compareTo(LocalDateTime.now()) > 0)
            throw new IllegalArgumentException("Date and Time of the Logs.Log cannot be in the future");
        this.dateTime = dateTime;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    //endregion
}
