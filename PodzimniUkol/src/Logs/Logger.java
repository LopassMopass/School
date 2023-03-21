package Logs;

import Logs.Log;

import java.util.TreeSet;

public class Logger extends TreeSet<Log> {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Log log : this) {
            sb.append(log).append("\r\n");
        }
        return sb.toString();
    }
}
