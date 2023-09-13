import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        /*Random rnd = new Random();
        int rnd1 = rnd.nextInt(32)+1990;
        int rnd2 = rnd.nextInt(11)+1;
        int rnd3 = rnd.nextInt(29)+1;
        int rnd4 = rnd.nextInt(23);
        int rnd5 = rnd.nextInt(59);
        int rnd6 = rnd.nextInt(59);
        int rnd7 = rnd.nextInt(999999)+100000;*/

        HashSet<Log> set = new HashSet<>();

        set.add(new Log(LocalDateTime.of(2020, 12, 13, 16, 39, 34), 567839, "Error"));
        set.add(new Log(LocalDateTime.of(2010, 10, 15, 6, 0, 32), 566439, "Warning"));
        set.add(new Log(LocalDateTime.of(2012, 9, 5, 5, 38, 13), 147566, "Info"));
        set.add(new Log(LocalDateTime.of(2014, 7, 1, 4, 34, 58), 293874, "Error"));
        set.add(new Log(LocalDateTime.of(2017, 8, 9, 7, 36, 45), 297464, "Warning"));
        set.add(new Log(LocalDateTime.of(2011, 3, 5, 8, 27, 3), 834658, "Info"));
        set.add(new Log(LocalDateTime.of(2004, 4, 3, 2, 50, 2), 296465, "Error"));
        set.add(new Log(LocalDateTime.of(2006, 6, 4, 0, 23, 4), 487547, "Warning"));
        set.add(new Log(LocalDateTime.of(2009, 1, 9, 9, 47, 6), 597634, "Info"));
        set.add(new Log(LocalDateTime.of(2000, 2, 8, 3, 45, 7), 234876, "Error"));
        set.add(new Log(LocalDateTime.of(2017, 5, 7, 5, 12, 8), 384764, "Warning"));
        set.add(new Log(LocalDateTime.of(2019, 8, 5, 9, 59, 0), 124776, "Info"));
        set.add(new Log(LocalDateTime.of(2004, 11, 10, 15, 45, 22), 472557, "Error"));
        set.add(new Log(LocalDateTime.of(2001, 10, 17, 16, 58, 56), 667839, "Warning"));
        set.add(new Log(LocalDateTime.of(2005, 5, 12, 12, 14, 34), 357692, "Info"));
        set.add(new Log(LocalDateTime.of(2000, 4, 13, 13, 24, 56), 357865, "Info"));
        set.add(new Log(LocalDateTime.of(2018, 3, 14, 10, 29, 54), 559678, "Warning"));
        set.add(new Log(LocalDateTime.of(1999, 2, 10, 18, 26, 6), 276845, "Info"));
        set.add(new Log(LocalDateTime.of(1995, 8, 30, 23, 24, 8), 375974, "Warning"));
        set.add(new Log(LocalDateTime.of(2004, 9, 26, 18, 23, 0), 490376, "Error"));

        for (Log i : set) {
            System.out.println(i);
        }
    }
}
