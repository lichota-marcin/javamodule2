import java.util.*;
import java.util.stream.Stream;

public class Collection2 {
    static String lyrics = Lyrics.lyricsOfYellowSubmarine;

    public static void main(String[] args) {
        String preparedLyrics = Collection1.preparedString(lyrics);
        String[] preparedArray = Collection1.arrayOfLyrics(preparedLyrics);
        int wordCount = arrayToList(preparedArray).size();
        System.out.println("This list contains "+wordCount+" words");
        List<String> list = distinctiveList(arrayToList(preparedArray));
        sortList(list);
        for (String word: list ){
            System.out.println(word);
        }
    }
    static List<String> arrayToList(String[] array){
        return Arrays.asList(array);
    }
    static List<String> distinctiveList(List <String> list){
        Stream<String> stream = list.stream().distinct();
       return new ArrayList<>(stream.toList());
        // In previous attempt I accidentally created immutable list and sorting wouldn't work, that's way I initialize new List.
        //Also, after I finished I realised I could've use Sets and this was probably the purpose of this task
    }

    static void sortList(List <String> list){
        CompareStrings cc = new CompareStrings();
        list.sort(cc);
    }

    static class CompareStrings implements Comparator<String>{
        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
}}
