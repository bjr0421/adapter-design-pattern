import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<String>();
    private int currentIndex;

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

    @Override
    public String playFromBeginning() {
        currentIndex = 0;
        return "Playing song 1: " + songs.get(currentIndex);
    }

    @Override
    public String playSong(int num) {
        if (num >= 1 && num <= 5) {
            currentIndex = num + 1;
            return "Playing " + songs.get(currentIndex);
        }
        return "Not a valid song number";
    }

    @Override
    public String prevSong() {
        if (currentIndex > 0) {
            currentIndex--;
            return "Skipping back and playing " + songs.get(currentIndex-1);
        }
        currentIndex = 0;
        return "Skipping back and playing " + songs.get(currentIndex); 
    }

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

    @Override
    public String stop() {
        currentIndex = 0;
        return "Stopping CD and ejecting";
    }

    @Override
    public String pause() {
        return "Pausing...";
    }
    
}
