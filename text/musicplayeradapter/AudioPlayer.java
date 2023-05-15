/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicplayeradapter;

public class AudioPlayer implements MediaPlayer {
  // MediaAdapter mediaAdapter; 

   @Override
   public void play( String fileName) {		

       System.out.println("Playing mp3 file. Name: "+ fileName);
   }   
}
