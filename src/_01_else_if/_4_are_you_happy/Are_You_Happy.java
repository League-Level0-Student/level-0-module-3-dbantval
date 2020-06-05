package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
public static void main(String[] args) {
String happy = JOptionPane.showInputDialog("Are You Happy?");
if(happy.equals("yes")){
JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
}
else if (happy.equals("no")){
	String hapy = JOptionPane.showInputDialog("do you want to be happy?");
	if(hapy.equals("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	if(hapy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "change something");
	}
}
}
}