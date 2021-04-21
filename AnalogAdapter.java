public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }
 
    @Override
    public String play() {
        return album.nextSong();
    }

    @Override
    public String rewind() {
        return album.prevSong();
    }

    @Override
    public String ffwd() {
        return album.nextSong();
    }

    @Override
    public String pause() {
        return album.pause();
    }

    @Override
    public String stopEject() {
        return album.stop();
    }
    
}
