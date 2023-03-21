package Youtube;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDExtractor {
    private static final String REGEX = "(https:\\/\\/www\\.youtube\\.com\\/watch\\?v=)([0-9A-Za-z-?]+)";

    public static ArrayList<String> findVideoIds(String text){
        ArrayList<String> ids = new ArrayList<>();
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            ids.add(matcher.group(2));
        }
        return ids;
    }

}
