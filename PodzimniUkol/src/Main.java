import Logs.Log;
import Logs.LogType;
import Logs.Logger;
import Youtube.IDExtractor;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.add(new Log(1, "Error log", LocalDateTime.of(2022,11,4,10,54), LogType.ERROR));
        logger.add(new Log(2, "Warning Logs.Log", LocalDateTime.of(2021,11,4,10,54), LogType.WARNING));
        logger.add(new Log(3, "Info Logs.Log 1", LocalDateTime.of(2020,11,4,10,54), LogType.INFO));
        logger.add(new Log(3, "Info Logs.Log 2", LocalDateTime.of(2020,11,4,10,54), LogType.INFO));
        System.out.println(logger);

        System.out.println(IDExtractor.findVideoIds("a aa dsd https://www.youtube.com/watch?v=0PMsyNgRwFw  asdasd https://www.youtube.com/watch?v=0PMasfgaA7yNgRwFw&ASD"));
    }
}