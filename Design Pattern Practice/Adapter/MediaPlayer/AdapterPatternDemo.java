package StructuralDesignPattern.Adapter.MediaPlayer;

public class AdapterPatternDemo {

    public static void main(String[] args) {
	AudioPlayer audioPlayer = new AudioPlayer();
    audioPlayer.play("mp3","beyond");
    audioPlayer.play("mp4","hello");
    audioPlayer.play("vlc","jaab");
    }
}
