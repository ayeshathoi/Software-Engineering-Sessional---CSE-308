package StructuralDesignPattern.Adapter.MediaPlayer;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audiotype, String filename) {
        if (audiotype.equalsIgnoreCase("mp3"))
            System.out.println("Playing mp3 file" + filename);
        else if (audiotype.equalsIgnoreCase("vlc")||audiotype.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audiotype);
            mediaAdapter.play(audiotype,filename);
        }
        else System.out.println("Invalid Format");
    }
}
