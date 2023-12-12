import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {


        String regexToTest = "app=edi_adapter_splitter wingtipsTrace=225debfbe6e5fac7 poiFileName=Integration_test_" +
                "Contract INFO  LogUtils - POI file name: [Integration_test_Contract], total number of orders succes" +
                "sfully processed: [2]";
        Pattern pattern = Pattern.compile("orders[\\D^]*(\\d+)");
        Matcher matcher = pattern.matcher(regexToTest);
        matcher.find();
        String myRegex = matcher.group(1);
        System.out.println("There was "+myRegex+" order(s)");
        // I wasn't sure what was I supposed to do in this task I guess I shouldn't rely on knowledge about String,
        //but one can fairly assume that in any order related stuff there would be a word 'order' followed by some digit
        //I tried to use \K modifier then Regex would look like order[\D]*\K[\d] but for some reason it is not supported
    }
}
