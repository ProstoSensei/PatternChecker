package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static String timeCheck(String text)
    {
        String timeCheck = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
        Matcher matcher = Pattern.compile(timeCheck).matcher(text);
        if(matcher.find())
        {
            return matcher.group();
        }
        else
        {
            return "В указанном тексте время не найдено.";
        }
    }

    public static boolean macCheck(String text)
    {
        String macCheck = "(([a-fA-F0-9][a-fA-F0-9][-:.]){5}[a-fA-F0-9][a-fA-F0-9])";
        Matcher matcher = Pattern.compile(macCheck).matcher(text);
        return matcher.find();
    }

    public static boolean emailCheck(String text)
    {
        String emailCheck = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@((localhost)|([A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})))$";
        Matcher matcher = Pattern.compile(emailCheck).matcher(text);
        return matcher.find();
    }
}