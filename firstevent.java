import javax.swing.*;
import java.awt.event.*;

// Java Project

class event_testing implements ActionListener{ //If you want to control event, you must implements this interface; ActionListener
    JButton button = new JButton("Not clicked :-("); //Remembar; this button MUST be here  
    public void go(){
        JFrame frame = new JFrame();
        button.addActionListener(this); //if you want you can put the class here. This = you must have void; actionPerfomed, where you can control what happend if you click this button
        frame.getContentPane().add(button); //Addding button to you'r frame

        frame.setVisible(true); // Now you can see this frame
    }
        public void actionPerformed(ActionEvent zdarzenie){
            button.setText("Clicked!");
            System.out.println("The button is clicked!!");
        }
    }

class testing{
    public static void main(String[] args) {
        event_testing et = new event_testing();
        et.go();
    }
}

// You can add a lot of frames... if you want
