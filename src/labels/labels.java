package labels;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;

public class labels {
    public static void main(String[] args) {


        ImageIcon computerIcon = new ImageIcon("/Users/dom/Files/VSCode /Java/LearningJava/GitHub/src/labels/computer.png");
        Border computerBorder = BorderFactory.createLineBorder(Color.BLUE);

        JLabel computer = new JLabel();
        computer.setText("Jit, you even know how to code?");
        computer.setIcon(computerIcon);
        computer.setHorizontalTextPosition(JLabel.CENTER);
        computer.setVerticalTextPosition(JLabel.TOP);
        computer.setForeground(Color.BLUE); // font color
        computer.setFont(new Font("MV Boli",Font.ITALIC,50));
        computer.setIconTextGap(-10);
        computer.setBackground(Color.BLACK);
        computer.setOpaque(true);
        computer.setBorder(computerBorder);
        computer.setVerticalAlignment(JLabel.CENTER);
        computer.setHorizontalAlignment(JLabel.CENTER);

        

        JFrame window1 = new JFrame();
        window1.setVisible(true);
        window1.setTitle("Dominic's Window");
        window1.setSize(750,750); 
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        window1.getContentPane().setBackground(Color.DARK_GRAY);       
        window1.add(computer);
        window1.pack();
    }
}
