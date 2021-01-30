
import java.util.Set;
import java.util.HashMap;

public class Hashmatique{
    public static void main(String[] args) {
        //Create a trackList of type HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();


        //Add in at least 4 songs that are stored by title
        trackList.put("Cherry wine", "The way she tells me I'm hers and she is mine");
        trackList.put("To Be Alone", "But you don't know what hell you put me through ");
        trackList.put("Wasteland, Baby!", "Wasteland, baby I'm in love, I'm in love with you");
        trackList.put("Nina Cried Power", "It's not the waking, it's the rising ");
        System.out.println("*****************************************\n");

        // Pull out one of the songs by its track title
        String title = trackList.get("Wasteland, Baby!");
        System.out.println(title);

        System.out.println("*****************************************\n");

        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> Lyrics = trackList.keySet();
        for(String key : Lyrics){
            System.out.println((key)+" : "+trackList.get(key));
        }
    }
}
