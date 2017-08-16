package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("HelloWorld");
	String name = JOptionPane.showInputDialog("Echo");
    JOptionPane.showMessageDialog(null,"Hi "+name+" I am your worst nightmare");
   
}
}
