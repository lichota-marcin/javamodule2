import java.io.*;

public class Collection4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, BeatlesException {
        saveLyricsToFile("lyrics.txt", Lyrics.lyricsOfYellowSubmarine);
        String lyrics = readLyricsFromFile("lyrics.txt");
        //System.out.println(lyrics);
        boolean a = findSubstringInString("Show must go on!", lyrics); //case sensitive
        System.out.println(a);
    }
    static void saveLyricsToFile(String fileName, String lyrics) throws IOException {
    try(FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(lyrics);
            objectOutputStream.flush();
        }
    }
    static String readLyricsFromFile(String fileName) throws IOException, ClassNotFoundException {
    try ( FileInputStream fileInputStream = new FileInputStream(fileName);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
        return (String) objectInputStream.readObject();
         }
    }
    static boolean findSubstringInString(String substring, String searchable) throws BeatlesException {
        if(searchable.contains(substring)) return true;
        else {throw new BeatlesException("Beatles");}
    }
    public static class BeatlesException extends Exception {
        public BeatlesException(String s) {
            // Call constructor of parent Exception
            super(s);
        }
    }
}

