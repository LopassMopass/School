package command;

import java.time.LocalDateTime;

public class Time extends Command{
    private LocalDateTime time;
    @Override
    public String execute() {
        return null;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
