import java.awt.*;
import Test.*;

public class Main
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() -> {
            try
            {
                new First();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
    }
}
