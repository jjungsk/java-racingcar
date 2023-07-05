package calculatorrefactor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

    private static  String BASIC_REGEX = ",|:";

    // 0. text number list
    public static String[] split (String text) {
        if (text.isBlank()) return new String[]{"0"};

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (matcher.find()) {
            String customSeparator = matcher.group(1);
            return matcher.group(2).split(customSeparator);
        }
        return text.split(BASIC_REGEX);
    }

    public static int toInt (String value) {
        return Integer.parseInt(value);
    }
}
