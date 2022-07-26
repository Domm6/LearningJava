package panel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class panel {
    public static void main(String[] args) {
        ImageIcon computer = new ImageIcon("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src/panel/60x60-icon-9.jpg");

        JLabel title = new JLabel();
        title.setText("This is the title!");
        title.setIcon(computer);
        title.setBounds(0,0,50,50);


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        JFrame window1 = new JFrame();
        window1.setVisible(true);
        window1.setTitle("Dominic's Window");
        window1.setSize(500,500); 
        window1.setLayout(null);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        window1.getContentPane().setBackground(Color.BLACK); 
        window1.add(redPanel);
        redPanel.add(title);
        window1.add(bluePanel);
        window1.add(greenPanel);
    }
}
