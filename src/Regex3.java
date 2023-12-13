import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {


        String regexToTest = "test 2667843 (test_email@griddynamics.com) test 67483 some string ";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+.[a-zA-Z0-9]+");
        Matcher matcher = pattern.matcher(regexToTest);
        matcher.find();
        String myRegex = matcher.group();
        System.out.println(myRegex);
    }
}
