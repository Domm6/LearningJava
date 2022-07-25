package fileWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Happy_Birthday.txt");
            writer.write("Happy Birthday to you\n Happy Birthday to you\n Happy Birthday to Dominic\n Happy Birthday to you!");
            writer.close();

        } catch(IOException e){
        }
    }
}
