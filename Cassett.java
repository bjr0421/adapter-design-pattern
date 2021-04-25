/**
 * Cassett, a type of AnalogAlbum
 * @author Brooks Robinson
 */

import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

    /**
     * Constructor for the Cassett object
     * @param song1 first song
     * @param song2 second song
     * @param song3 third song
     * @param song4 fourth song
     * @param song5 fifth song
     */
    public Cassett(String song1,
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
     * Plays the cassette
     * @return the song currently playing
     */
    @Override
    public String play() {
        if (currentIndex >= 5)
            return "At the end of the cassette you need to rewind";
        currentIndex++;
        return "Playing song " + (currentIndex) + ": " + songs.get(currentIndex-1);
    }

    /**
     * Rewinds the cassette
     * @return the song that the cassette has been rewound to
     */
    @Override
    public String rewind() {
        if (currentIndex == 0)
            return "Fully rewound";
        currentIndex--;
        return "Rewinding to song " + (currentIndex+1);
    }

    /**
     * Fast-forwards the cassette
     * @return the song that is being fast-forwarded to
     */
    @Override
    public String ffwd() {
        if (currentIndex >= 4)
            return "Forwarded to the end of the cassette";
        currentIndex++;
        return "Forwarding to song " + (currentIndex+1);
    }

    /**
     * Pauses the cassette
     * @return a message indicating that the cassette has been paused
     */
    @Override
    public String pause() {
        return "Pausing...";
    }

    /**
     * Stops and ejects the cassette
     * @return a message indicating that the cassette has been stopped and ejected
     */
    @Override
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
