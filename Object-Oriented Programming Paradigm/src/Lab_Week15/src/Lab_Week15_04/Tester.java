package Lab_Week15_04;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Tester {
	public static void main(String[] args) {
		JFrame fr = new JFrame(); 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		fr.setBounds(100,100,400,300); 
		fr.setTitle("GUI Tutorial");
		fr.getContentPane().setLayout(null); 
		JLabel label1 = new JLabel("Register Data");
		JLabel label2 = new JLabel("Username :");
		JLabel label3 = new JLabel("Password :");
		JLabel label4 = new JLabel("Confirm Password :");
		JLabel label5 = new JLabel("Name :");
		JLabel label6 = new JLabel("Email :");
		label1.setBounds(150,20,200,14);
		label2.setBounds(40,50,200,14);
		label3.setBounds(40,80,200,14);
		label4.setBounds(40,110,200,14);
		label5.setBounds(40,140,200,14);
		label6.setBounds(40,170,200,14);
		fr.getContentPane().add(label1);
		fr.getContentPane().add(label2);
		fr.getContentPane().add(label3);
		fr.getContentPane().add(label4);
		fr.getContentPane().add(label5);
		fr.getContentPane().add(label6);
		JTextField txt1 = new JTextField();
		txt1.setBounds(180,48,85,20);
		fr.getContentPane().add(txt1);
		JPasswordField pass = new JPasswordField();
		pass.setBounds(180,78,85,20);
		fr.getContentPane().add(pass);
		JPasswordField copass = new JPasswordField();
		copass.setBounds(180,108,85,20);
		fr.getContentPane().add(copass);
		JTextField txt2 = new JTextField();
		txt2.setBounds(180,138,144,20);
		fr.getContentPane().add(txt2);
		JTextField txt3 = new JTextField();
		txt3.setBounds(180,168,144,20);
		fr.getContentPane().add(txt3);
		JButton btn1 = new JButton("Save");
		btn1.setBounds(140,210,100,23);
		fr.getContentPane().add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txt1.getText().length()==0) {
					JOptionPane.showMessageDialog(fr,"Please input your username");
				}else if(pass.getPassword().length==0) {
					JOptionPane.showMessageDialog(fr,"Please input your password");
				}else if(!(pass.getText().equals(copass.getText()))) {
					if(copass.getText().length()!=0) {
						JOptionPane.showMessageDialog(fr,"Password Not Match! Try Again please");
					}else {
						JOptionPane.showMessageDialog(fr,"Please confirm your password");
					}
				}else if(txt2.getText().length()==0) {
					JOptionPane.showMessageDialog(fr,"Please input your name");
				}else if(txt3.getText().length()==0) {
					JOptionPane.showMessageDialog(fr,"Please input your email");
				}else{
					Person p = new Person(txt1.getText(),pass.getText(),txt2.getText(),txt3.getText());
					JOptionPane.showMessageDialog(fr,"Register Data Successfully\n"+p.toString());
				}
				
			}
			});
		fr.setVisible(true);
	}
}
