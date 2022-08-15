package buttons;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class buttonsLamda {
    public static void main(String[] args) {
        new window1();
    }
}
    class window1 extends JFrame {

        JButton button1;
        JLabel buttonLabel;

        window1(){
            buttonLabel = new JLabel();
            buttonLabel.setBounds(150,250,150,150);
            buttonLabel.setVisible(false);

            button1 = new JButton();
            button1.setBounds(75,100,300,200);
            button1.addActionListener(e -> System.out.println("Heem!"));
            button1.setText("I'm a Button!");
            button1.setFocusable(false);
            button1.setForeground(Color.MAGENTA);
            button1.setBackground(Color.blue);
            button1.setBorder(BorderFactory.createEtchedBorder());
    
            this.setVisible(true);
            this.setTitle("Dominic's Window");
            this.setSize(500,500);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(Color.BLACK);
            this.add(button1); 
            this.add(buttonLabel);

            }
    }