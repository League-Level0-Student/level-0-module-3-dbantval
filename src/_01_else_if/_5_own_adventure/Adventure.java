package _01_else_if._5_own_adventure;

import java.util.Random;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "This is [baby life irl {hard mode}]");
		int Poorrich = 0;
		Random rand = new Random();
		int o = rand.nextInt(60);
		String baby = JOptionPane.showInputDialog(
				"Do you want to take a chance at having a rich or a poor life(1), or just have a normal life(2)?");
		int babyNum = Integer.parseInt(baby);
//starting life
		if (babyNum == 1) {
			String poorrich = JOptionPane.showInputDialog("Choose a number 4 or 18");
			Poorrich = Integer.parseInt(poorrich);
			if (Poorrich == 4) {
				JOptionPane.showMessageDialog(null, "You are in a poor family");
			}
			if (Poorrich == 18) {
				JOptionPane.showMessageDialog(null, "You are in a rich family");
			}
		}
		
//smartness
		JOptionPane.showMessageDialog(null, "Its time to take a quiz to see how smart you are!");
		String smart = JOptionPane.showInputDialog("What is 4 to the square root of 2, x ({126 +} 18) + |-10|(you have 50 seconds) ");
		int Smart = Integer.parseInt(smart);
		if (Smart == 298) {
			JOptionPane.showMessageDialog(null, ("Wow! You have 100 smart (the most)"));
			if(Poorrich== 4 && Smart==298) {
				JOptionPane.showMessageDialog(null, "You helped your family grow a bussnis and you became very rich and a succesfull businessman/women");
				if(Poorrich== 4 && o>50) {
					JOptionPane.showMessageDialog(null, "Your family turned into a normal family after hard work, and you lived a happy life");
				}
			}
		}
		else if (babyNum == 2 && o < 50) {
			JOptionPane.showMessageDialog(null, "You lived your happy dumb life as a baby");
			//school
String school1 =JOptionPane.showInputDialog("Its time for kindergarten, since you arent that smart would you like to work on your studies (If you get it wrong your smart could go down or up)?(1) or mess around and break stuff and fail kindergarten(2) ");
int School1 = Integer.parseInt(school1);
if (School1 == 2) {
	JOptionPane.showMessageDialog(null, "Your parents are very dissapointed and mad at you, you didnt even pass kindergarten. Thye grounded you till you passed kinddergarten, and you couldent hang out with any friends or have any toys.");
}
if (School1== 1) {
	JOptionPane.showMessageDialog(null, "Then its time for another test, a harder one");
	String smartness=JOptionPane.showInputDialog("what is 1+1+5x0x811+46(you have 14 seconds)");
	int Smartness= Integer.parseInt(smartness);
	if(Smartness == 46) {
		JOptionPane.showMessageDialog(null, "Nice now you have 80 smart! You also passed kindergarten");
		JOptionPane.showMessageDialog(null, "Nice Job! Your parents are very prooud of you passing kindergarten, Thye bought you a new monkey toy and a small bar of chocolats!   ");
		 if (Smartness != 46) {
			 JOptionPane.showMessageDialog(null, "Wrong your smart is now"+o);
			 JOptionPane.showMessageDialog(null, "Your parents are very proud of you still, Of course you still passed kindergarten, and because your parents bought you a small bar of chocolats");
		 }
	}
}

					}
		else {
			JOptionPane.showMessageDialog(null, "Your smart is " + o);

			if (o < 50) {
				if (Poorrich == 4) {
					JOptionPane.showMessageDialog(null,
							"You got sick an your family was trying to take care of you, while doing so, you were to dumb to relise you were on the road and a cor was coming, it hit you, and you died");
				}
			}
		}
		//rich school
		if (Poorrich == 18) {
			JOptionPane.showMessageDialog(null, "You lived a happy life as a baby");
			String richlife=JOptionPane.showInputDialog("Would you like to have a happy ending here?(1) or continue the adventure(2)");
			int RichLife=Integer.parseInt(richlife);
			if (RichLife == 2){
			JOptionPane.showMessageDialog(null, "You went on to kindergarten and passed with plying colors, your parents were so prud they bought you any 3 toys you wanted, and 2 candies.");	
			}
		}
		

	}
}
