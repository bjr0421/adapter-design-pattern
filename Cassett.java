import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

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

    @Override
    public String play() {
        if (currentIndex >= 5)
            return "At the end of the cassette you need to rewind";
        String res = "Playing song " + (currentIndex+1) + ": " + songs.get(currentIndex);
        currentIndex++;
        //return "Playing song " + currentIndex+1 + ": " + songs.get(currentIndex);
        return res;
    }

    @Override
    public String rewind() {
        if (currentIndex == 0)
            return "Fully rewound";
        currentIndex--;
        return "Rewinding to song " + (currentIndex+1);
    }

    @Override
    public String ffwd() {
        if (currentIndex >= 4)
            return "Forwarded to the end of the cassette";
        currentIndex++;
        return "Forwarding to song " + (currentIndex+1);
    }

    @Override
    public String pause() {
        return "Pausing...";
    }

    @Override
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
