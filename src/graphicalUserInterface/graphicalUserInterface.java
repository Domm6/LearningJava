package graphicalUserInterface;

import javax.swing.JOptionPane;

class graphicalUserInterface {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Hello, what is your name? ");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        String day = JOptionPane.showInputDialog(null, "How has your day been? ");
        JOptionPane.showMessageDialog(null, "I'm gad to see that you are having a " + day + " day.");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you ?"));
        JOptionPane.showMessageDialog(null,"Wow, " + age + " is a great age to be alive!");
        JOptionPane.showMessageDialog(null, "You are an absolute loser " + name);
        


    }
    
}
