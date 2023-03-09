package main.java;

import javax.swing.*;

public class testForJOption {
    public static void main(String[] args) {
        ImageIcon obamium = new ImageIcon("obamium.jpg");//Obamium of ImageIcon is the file in the Root Directory and the file name has to be the name of the file Duh
        JOptionPane.showMessageDialog(null, "We need to go to the lab", "DisplayIMG", JOptionPane.INFORMATION_MESSAGE, obamium); //To show images of obamium
    }
}