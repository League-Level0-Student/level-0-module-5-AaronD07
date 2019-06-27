package _02_fibonacci;

import javax.swing.JOptionPane;

public class fibonacci {
public static void main(String[] args) {
	int a = 1;
	int b =1;
	int c; 
	JOptionPane.showMessageDialog(null, "1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144");
	for(int i=0; i<4; i++) {
		c= a+b;
		JOptionPane.showMessageDialog(null, a + ", ");
		a=b+c;
		JOptionPane.showMessageDialog(null, b + ", ");
		b=a+c;
		JOptionPane.showMessageDialog(null, c + ", ");
		
	}
}
}
