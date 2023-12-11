import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Collection3 {
    static String lyrics = Lyrics.lyricsOfYellowSubmarine;

    public static void main(String[] args) {

        String preparedLyrics = Collection1.preparedString(lyrics);
        List<String> lyricsInAList = stringToList(preparedLyrics);
        lyricsInAList.removeIf(n -> (Objects.equals(n, "yellow")));
        lyricsInAList.removeIf(n -> (Objects.equals(n, "submarine")));
        for(String word : lyricsInAList){
            System.out.println(word);
        }


    }

   static List<String> stringToList (String text){
        return  new ArrayList<String>(Arrays.asList(text.split(" ")));

   }
}
