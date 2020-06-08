package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		int Poorrich = 0;
		Random rand = new Random();
		int o = rand.nextInt(100);
		String baby = JOptionPane.showInputDialog(
				"Do you want to take a chance at having a rich or a poor life(1), or just have a normal life(2)?");
		int babyNum = Integer.parseInt(baby);
//starting life
		if (babyNum == 1) {
			String poorrich = JOptionPane.showInputDialog("Choose a number 1 or 2");
			Poorrich = Integer.parseInt(poorrich);
			if (Poorrich == 1) {
				JOptionPane.showMessageDialog(null, "You are in a poor family");
			}
			if (Poorrich == 2) {
				JOptionPane.showMessageDialog(null, "You are in a rich family");
			}
		}
		if (babyNum == 2 && o < 50) {
JOptionPane.showMessageDialog(null, "You lived your happy dumb life :) {for now}");
		}
//smartness
		JOptionPane.showMessageDialog(null, "Its time to take a quiz to see how smart you are!");
		String smart = JOptionPane.showInputDialog("What is 15+ 7 /7 x18?(you have 16 seconds)");
		int Smart = Integer.parseInt(smart);
		if (Smart == 33) {
			JOptionPane.showMessageDialog(null, ("Wow! You have 100 smart (the most)"));
		}
//ending
		else {
			JOptionPane.showMessageDialog(null, "Your smart is " + o);

			if (o < 50) {
				if (Poorrich == 1) {
					JOptionPane.showMessageDialog(null,
							"You got sick an your family was trying to take care of you, while doing so, you were to dumb to relise you were on the road and a cor was coming, it hit you, and you died");
				}
			}
		}
		if (Poorrich == 2) {
			JOptionPane.showMessageDialog(null, "You lived a happy life with your family {so far}");
		}
	}
}
