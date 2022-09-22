package com.lessons;

//will be working with the JOptionPane class
import javax.swing.JOptionPane;

public class GUIintro {

    public static void main(String[] args) {

        //a box that prompts for a name
        String name = JOptionPane.showInputDialog("Enter your name");

        //a dialog box that will display our name along with a message
        JOptionPane.showMessageDialog(null, "Hello "+name);

        //need to convert a string into an integer Integer.parseInt();
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        //a dialog box that will display our age along with a message
        JOptionPane.showMessageDialog(null, "You are " +age+" years old");

        //lets try with a double data type
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));

        //a dialog box that will display our height along with a message
        JOptionPane.showMessageDialog(null, "You are " +height+" cm tall");
    }
}
