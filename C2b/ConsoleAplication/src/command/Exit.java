package command;

public class Exit extends Command{

    @Override
    public String execute() {
        return "EXIT CODE = 0";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
