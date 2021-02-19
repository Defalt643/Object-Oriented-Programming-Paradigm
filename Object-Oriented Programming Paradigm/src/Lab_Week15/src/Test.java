import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test {
	public static void main(String[] args) {
		JFrame fr = new JFrame();
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setBounds(100, 100, 343, 273);
		fr.getContentPane().setLayout(null);
		JLabel l1 = new JLabel("What is your name?");
		l1.setBounds(90, 40, 200, 14);
		fr.getContentPane().add(l1);
		JTextField tf = new JTextField();
		tf.setBounds(90, 70, 100, 20);
		fr.getContentPane().add(tf);
		JButton btnSave = new JButton("Submit");
		btnSave.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(fr,"Hello, "+tf.getText());
		}
		});
		btnSave.setBounds(90,110, 89, 23);
		fr.getContentPane().add(btnSave);
		fr.setVisible(true);
	}
	}
	
