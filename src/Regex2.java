import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {

        String regexToTest = "app=edi_adapter_converter wingtipsTrace=8faeae6709355291 INFO  OrderCreateClient - action=EDIOrderSent originalFilename=Integration_test_Contract customerName=0005084863 orderUUID=d34149d8-88ab-4791-bb0a-46c96e034200 poNum=Test_TS5155079515 lineCount=3";
        Pattern pattern = Pattern.compile("orderUUID");
        Matcher matcher = pattern.matcher(regexToTest);
        matcher.find();
        String regexString = matcher.group();
        System.out.println(regexString);
    }
}
