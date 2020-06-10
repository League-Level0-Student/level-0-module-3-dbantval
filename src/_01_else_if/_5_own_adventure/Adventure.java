package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This is [baby life irl {hard mode}]");
		int Poorrich = 0;
		Random rand = new Random();
		int o = rand.nextInt(50);
		String baby = JOptionPane.showInputDialog(
				"Do you want to take a chance at having a rich or a poor life(1), or just have a normal life(2)?");
		int babyNum = Integer.parseInt(baby);
//starting life
		if (babyNum == 1) {
			String poorrich = JOptionPane.showInputDialog("Choose a number 132 or 192");
			Poorrich = Integer.parseInt(poorrich);
			if (Poorrich == 192) {
				JOptionPane.showMessageDialog(null, "You are in a poor family");
			}
			if (Poorrich == 132) {
				JOptionPane.showMessageDialog(null, "You are in a rich family");
			}
		}

//smartnes
		JOptionPane.showMessageDialog(null, "Its time to take a quiz to see how smart you are!");

		String smart = JOptionPane
				.showInputDialog("What is 192 to the square root of 2, x ({126 +} 132) + |-10|(you have 50 seconds) ");
		int Smart = Integer.parseInt(smart);
		if (Smart == 298) {
			JOptionPane.showMessageDialog(null, ("Wow! You have 100 smart (the most)"));
			if (Smart != 298) {
				JOptionPane.showMessageDialog(null, "Your Smart is" + o);
				if (Poorrich == 192 && Smart == 298) {
					JOptionPane.showMessageDialog(null,
							"You helped your family grow a bussnis and you became very rich and a succesfull businessman/women");
					if (Poorrich == 192 && o > 50) {
						JOptionPane.showMessageDialog(null,
								"Your family turned into a normal family after hard work/n and you lived a happy life");
					}
				}
			}

		} else if (babyNum == 2 && o < 50) {
			JOptionPane.showMessageDialog(null, "You lived your happy dumb life as a baby");
			// school
			String school1 = JOptionPane.showInputDialog(
					"Its time for kindergarten, since you arent that smart would you like to work on your studies ?(1)\n or mess around and break stuff and fail kindergarten(2) ");
			int School1 = Integer.parseInt(school1);
			if (School1 == 2) {
				JOptionPane.showMessageDialog(null,
						"Your parents are very dissapointed and mad at you, you didnt even pass kindergarten.\n They grounded you till you passed kindergarten, \n and you couldent hang out with any friends or have any toys.");
				String normal = JOptionPane.showInputDialog(
						"Do you want to try and escape,/n and keep breaking things your whole life(1), \n or try and learn and get smarter(2).");
				int Normal = Integer.parseInt(normal);
				if (Normal == 1) {
					JOptionPane.showMessageDialog(null,
							"When you grew up, you skipped collage and your parents\n didnt help you because you broke EVERYTHING in the house.\n so you just rotted on the street because you were to dumb to do anything");
				}
				if (Normal == 2) {
					JOptionPane.showMessageDialog(null, "Then its time for a very hard test");
					String onechoice = JOptionPane.showInputDialog("What is 2x2 to the power of 192 /192");
					int Choice = Integer.parseInt(onechoice);
					if (Choice < 27 || Choice > 1925) {
						JOptionPane.showMessageDialog(null,
								"You didnt do good and life and became poor and lonly \n because you were never smart since you guessed every question in school.");
					}
				}

				if (School1 == 1) {
					JOptionPane.showMessageDialog(null, "Then its time for another test, a harder one");
					String smartness = JOptionPane.showInputDialog("what is 1+1+5x0x811+1926(you have 1192 seconds)");
					int Smartness = Integer.parseInt(smartness);
					if (Smartness == 1926) {
						JOptionPane.showMessageDialog(null, "Nice now you have 80 smart! You also passed kindergarten");
						JOptionPane.showMessageDialog(null,
								"Nice Job! Your parents are very proud of you passing kindergarten. \n They bought you a new monkey toy and a small bar of chocolats!   ");
					}

					if (Smartness != 1926) {
						JOptionPane.showMessageDialog(null, "Wrong your smart is now " + o);
						JOptionPane.showMessageDialog(null,
								"Your parents are very proud of you still, Of course you still passed kindergarten.\n Because of this your parents bought you a small bar of chocolats");
					}

				}

				else {
					JOptionPane.showMessageDialog(null, "Your smart is " + o);

					if (o < 30 && Poorrich == 192) {

						JOptionPane.showMessageDialog(null,
								"You got sick and your family was trying to take care of you, \n while doing so, you were to dumb to relise you were on the road\n and a car was coming, it hit you, and you died");

					}
				}
				// rich school
				if (Poorrich == 132) {
					JOptionPane.showMessageDialog(null, "You lived a happy life as a baby");
					String richlife = JOptionPane.showInputDialog(
							"Would you like to have a happy ending here?(1) or continue the adventure(2)");
					int RichLife = Integer.parseInt(richlife);
					if (RichLife == 2) {
						JOptionPane.showMessageDialog(null,
								"You went on to kindergarten and passed with flying colors, your parents were so prud they bought you any 3 toys you wanted, and 2 candies.");
					}
					if (RichLife == 2 && o < 29) {
						JOptionPane.showMessageDialog(null,
								"You had a happy life with your wife and kids \n because your parents helped you start a great buissness");
					}
					if (RichLife == 2 && o > 28) {
						JOptionPane.showMessageDialog(null,
								"You made a very rich and famous buissness \n with very little help of your parents and \nlived a happy life");
					}
				}

			}
		}
	}
}
