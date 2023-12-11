import java.util.Objects;
import java.util.Scanner;

public class Collection1 {
    static String lyrics = Lyrics.lyricsOfYellowSubmarine;

    public static void main(String[] args) {
        String preparedLyrics = preparedString(lyrics);
        String[] preparedArray = arrayOfLyrics(preparedLyrics);
        System.out.println("Type a desired word: ");
        Scanner myObj = new Scanner(System.in);
        String word = myObj.nextLine().toLowerCase();
        System.out.println("Word "+word+" appeared "+howManyTimesWordAppears(preparedArray, word)+" time(s)");
        }

    static public String preparedString(String lyrics){
         String noMoreQuotes = lyrics.replaceAll("[\",()]", "");
         String singleLine = noMoreQuotes.replaceAll("\\n", " ");
        return singleLine.toLowerCase();
    }
    static public String[] arrayOfLyrics(String stringToArray){
        return stringToArray.split(" ");
    }
    static public int howManyTimesWordAppears(String[] lyricsArray, String word) {
        int occurences = 0;
        for (int i =0; i<lyricsArray.length-1;i++) {
            if (Objects.equals(lyricsArray[i], word)){
                occurences++;
            }
        }
        return occurences;
    }
}




