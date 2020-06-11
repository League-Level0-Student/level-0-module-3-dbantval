
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		
		// 1. Call the method below to play the sound
		// 2. Ask the user how many shiny objects they want
		// 3. Play the sound that many times

String num =JOptionPane.showInputDialog("How many shiny obects do you want?");
int Num =Integer.parseInt(num);
for (int i = 0; i < Num; i++) {
	playMisterZee();
}
	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		try {
			//AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			//sound.play();
			//Thread.sleep(3400);
		JOptionPane.showMessageDialog(null, "Mr.Zee requirs shiny objects");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
