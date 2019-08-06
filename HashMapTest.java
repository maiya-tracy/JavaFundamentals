import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		trackList.put("The Feel Good Drag", "I'm here for you, she said, And we can stay for awhile");
		trackList.put("The Unwinding Cable Car", "This is the correlation of salvation and love");
		trackList.put("Impossible", "Take what you want from me");
		trackList.put("Paperthin Hymn", "These thoughts run through my head");
		
		Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
//            System.out.println(trackList.get(key));  
        }
        String lyrics = trackList.get("The Feel Good Drag");
        System.out.println("Lyrics: " + lyrics);
	}

}
