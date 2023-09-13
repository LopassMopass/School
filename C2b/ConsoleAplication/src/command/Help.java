package command;

public class Help extends Command{
    @Override
    public String execute() {
        return "help, time, quote, history";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
