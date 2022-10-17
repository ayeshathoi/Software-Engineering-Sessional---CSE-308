package StructuralDesignPattern.Adapter.MediaPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(String audioType)
    {
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VlcPlayer();
        else if (audioType.equalsIgnoreCase("mp4"))
            advancedMediaPlayer = new Mp4Player();
    }
    @Override
    public void play(String audiotype, String filename) {
        if (audiotype.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(filename);
        if (audiotype.equalsIgnoreCase("mp4"))
            advancedMediaPlayer.playMp4(filename);
    }
}
