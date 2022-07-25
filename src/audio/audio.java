package audio;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

    File file = new File("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src/audio/Carti Beat.wav");
    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
    Clip clip = AudioSystem.getClip();
    clip.open(audioStream);

        String response = "";
        while(!response.equalsIgnoreCase("Q")){
        Scanner scanner = new Scanner(System.in);
        System.out.println("P - Play, S - Stop, R - Reset, Q = Quit ");
        System.out.print("Enter your choice: ");
        response = scanner.nextLine(); 
        System.out.println();
        
            if(response.equalsIgnoreCase("p")){
                clip.start();
            } else if (response.equalsIgnoreCase("s")){
                clip.stop();
            } else if (response.equalsIgnoreCase("r")){
                clip.setMicrosecondPosition(0);  
            } else if (response.equalsIgnoreCase("q")){
                clip.close();
            } else {
                System.out.println("Please enter a valid choice.");
            }
            
        }
        System.out.println("I hope you enjoyed the song! Would you like to play another song, but this time by J Cole? 1 - yes, 2 - no");
        Scanner scanner = new Scanner(System.in);
        int newSong = scanner.nextInt();
        
        if(newSong == 1){
            File file2 = new File("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src/audio/JCole Beat");
            AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
            Clip clip2 = AudioSystem.getClip();
            clip2.open(audioStream2);

            String response2 = "";
        while(!response2.equalsIgnoreCase("Q")){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("P - Play, S - Stop, R - Reset, Q = Quit ");
        System.out.print("Enter your choice: ");
        response2 = scanner2.nextLine(); 
        System.out.println();
        
            if(response2.equalsIgnoreCase("p")){
                clip2.start();
            } else if (response2.equalsIgnoreCase("s")){
                clip2.stop();
            } else if (response2.equalsIgnoreCase("r")){
                clip2.setMicrosecondPosition(0);  
            } else if (response2.equalsIgnoreCase("q")){
                clip2.close();
            } else {
                System.out.println("Please enter a valid choice.");
            }
            
        }
        } else if(newSong == 2){
            System.out.println("Alright. Have a great rest of your day.");
        }
    }
  
}
