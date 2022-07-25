package labels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class labels {
    public static void main(String[] args) {


        ImageIcon computerIcon = new ImageIcon("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src/labels/computer.png");

        JLabel computer = new JLabel();
        computer.setText("Jit, you even know how to code?");
        computer.setIcon(computerIcon);
        computer.setHorizontalTextPosition(JLabel.CENTER);
        computer.setVerticalTextPosition(JLabel.TOP);
        computer.setIconTextGap(-10);

        

        JFrame window1 = new JFrame();
        window1.setVisible(true);
        window1.setTitle("Dominic's Window");
        window1.setSize(750,750); 
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        window1.getContentPane().setBackground(Color.DARK_GRAY);       
        window1.add(computer);
    }
}
