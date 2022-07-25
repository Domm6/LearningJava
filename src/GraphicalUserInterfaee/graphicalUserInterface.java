package GraphicalUserInterfaee;
import java.awt.Color;
import javax.swing.JFrame;

class graphicalUserInterface {
    public static void main(String[] args) {
        Window window1 = new Window();
    }
}
    class Window extends JFrame{

        Window(){
            this.setVisible(true);
            this.setTitle("Dominic's Window");
            this.setSize(500,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.getContentPane().setBackground(Color.DARK_GRAY);
            }  
    }
