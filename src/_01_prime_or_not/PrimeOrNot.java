package _01_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("Choose a number");
	int y = Integer.parseInt(x);
	for(int i=2; i<y/2; i++) {
		
		if (y%i==0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			System.exit(0);
		}

			
			
			
			
			
		
			
			
		
	}
	JOptionPane.showMessageDialog(null, "Your number is prime.");
}
}
