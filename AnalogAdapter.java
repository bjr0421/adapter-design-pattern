/**
 * AnalogAdapter, an Adapter to convert a DigitalAlbum to an AnalogAlbum
 * @author Brooks Robinson
 */

public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Constructor for AnalogAdapter object
     * @param album the album being converted to an AnalogAlbum
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
 
    /**
     * Creates the analog equivalent to a digital album's nextSong
     * @return next song on the album
     */
    @Override
    public String play() {
        return album.nextSong();
    }

    /**
     * Creates the analog equivalent to a digital album's prevSong
     * @return previous song on the album
     */
    @Override
    public String rewind() {
        return album.prevSong();
    }

    /**
     * Creates the analog equivalent to a digital album's nextSong
     * @return next song on the album
     */
    @Override
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * Creates the analog equivalent to a digital album's pause
     * @return pauses the album
     */
    @Override
    public String pause() {
        return album.pause();
    }

    /**
     * Creates the analog equivalent to a digital album's stop
     * @return stops the album
     */
    @Override
    public String stopEject() {
        return album.stop();
    }
    
}
