package buttons;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class buttons {
    public static void main(String[] args) {
        new window();
    }
}
    class window extends JFrame implements ActionListener{
        JButton button;
        window(){

            button = new JButton();
            button.setBounds(200,100,100,50);
            button.addActionListener(this);
    
            this.setVisible(true);
            this.setTitle("Dominic's Window");
            this.setSize(500,500);
            this.setLayout(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(Color.BLACK);
            this.add(button); 

            }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button){
                System.out.println("Heem!");
            }            
        }
    }

