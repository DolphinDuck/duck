/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplayeradapter;

/**
 *
 * @author abkar
 */
public class MediaAdapter  implements MediaPlayer {
    AdvancedMediaPlayer advance; 
 
    MediaAdapter(AdvancedMediaPlayer player)
    {
            advance = player; 
    }
    public void play(String fileName){
        //if (m_type=="mp4")
        if (fileName.contains(".mp4"))
            advance.playMp4(fileName);
        else  if (fileName.contains(".vlc"))
            advance.playVlc(fileName);
            
    }
}
