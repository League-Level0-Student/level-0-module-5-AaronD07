package _07_skill_practice;
import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
          skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}
 
void skill1() {
	String a = JOptionPane.showInputDialog("How many dimes do you have?");
	JOptionPane.showMessageDialog(null, "You have " +a + "0 cents");
	String b = JOptionPane.showInputDialog("How tall are you?");
	int c = Integer.parseInt(b);
	if (c<36) {
		JOptionPane.showMessageDialog(null, "Eat your wheaties!");
	}
}
	void skill2( ) {
		for(int i = 1; i<31; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}
	void skill3() {
		Random x = new Random();
		int j = x.nextInt(20);
		System.out.println(j);
		Random i = new Random();
		int y = i.nextInt(10);
		System.out.println(y);
		JOptionPane.showMessageDialog(null, j-y + "");
		
		
	}
		

		
		void skill4() {
			String city = JOptionPane.showInputDialog("What city do you live in?");
			if (city.equals("San Diego")) {
				JOptionPane.showMessageDialog(null, "You live in America's finest city.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Move to San Diego");
			}
				int cars = 4;
				JOptionPane.showMessageDialog(null, "Between the cars there are 8 wheels.");
			
		}
		void skill5() {
			String a = JOptionPane.showInputDialog("What is the name of your school?");
			JOptionPane.showMessageDialog(null, a + " is a fantastic school.");
		}
		}

		
	
	


