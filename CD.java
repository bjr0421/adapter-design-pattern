/**
 * CD, a type of Album
 * @author Brooks Robinson
 */
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /**
     * Constructor for CD object
     * @param song1 first song
     * @param song2 second song
     * @param song3 third song
     * @param song4 fourth song
     * @param song5 fifth song
     */
    public CD(String song1,
              String song2,
              String song3,
              String song4,
              String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        currentIndex = 0;
    }

    /**
     * Plays CD from beginning
     * @return Song at beginning of CD
     */
    @Override
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1: " + songs.get(currentIndex);
    }

    /**
     * Plays the song which is located at the given number
     * @param num song number
     * @return Song with the given number
     */
    @Override
    public String playSong(int num) {
        if (num >= 1 && num <= 5) {
            currentIndex = num + 1;
            return "Playing " + songs.get(currentIndex);
        }
        return "Not a valid song number";
    }

    /**
     * Plays the previous song on the CD
     * @return The song before the previouly current one
     */
    @Override
    public String prevSong() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing " + songs.get(currentIndex-1);
        }
        currentIndex = 0;
        return "Skipping back and playing " + songs.get(currentIndex); 
    }

    /**
     * Plays the next song on the CD
     * @return The next song on the CD
     */
    @Override
    public String nextSong() {
        if (currentIndex+1 <= 5) {
            currentIndex++;
            return "Playing: " + (currentIndex) + ": " + songs.get(currentIndex-1);
        } else {
            currentIndex = 0;
            return "Playing: " + currentIndex + ": " + songs.get(currentIndex);
        }
    }

    /**
     * Stops playback of the CD
     * @return message indicating the CD has been stopped
     */
    @Override
    public String stop() {
        currentIndex = 0;
        return "Stopping CD and ejecting";
    }

    /**
     * Pauses playback of the CD
     * @return message indicating the CD has been paused
     */
    @Override
    public String pause() {
        return "Pausing...";
    }
    
}
