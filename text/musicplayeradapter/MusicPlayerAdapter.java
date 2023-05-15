/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicplayeradapter;

/**
 *
 * @author abkar
 */
public class MusicPlayerAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       AudioPlayer audioPlayer = new AudioPlayer();

       
       MediaPlayer adaptToMp4 = new MediaAdapter(new Mp4Player ());
       adaptToMp4.play("my heart will go on.mp4");
       
       
        MediaPlayer adaptToVlc = new MediaAdapter(new VlcPlayer ());
       adaptToVlc.play("baby one more time.vlc");
       
     
       MediaPlayer mp3 = new AudioPlayer();
       mp3.play("Whenever.mp3");
    }
    
}
