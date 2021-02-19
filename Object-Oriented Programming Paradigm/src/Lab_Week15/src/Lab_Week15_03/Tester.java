package Lab_Week15_03;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tester {

	public static void main(String[] args) {
		JFrame fr = new JFrame(); 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		fr.setBounds(100,100,450,250); 
		fr.setTitle("My Calculator");
		fr.getContentPane().setLayout(null); 
		String[] Operator = {"+","-","x","/"};
		JLabel label1 = new JLabel("Number1");
		JLabel label2 = new JLabel("Operator");
		JLabel label3 = new JLabel("Number2");
		label1.setBounds(40,40,200,14);
		label2.setBounds(140,40,200,14);
		label3.setBounds(240,40,200,14);
		fr.getContentPane().add(label1);
		fr.getContentPane().add(label2);
		fr.getContentPane().add(label3);
		JTextField num1 = new JTextField();
		num1.setBounds(40,60,70,20);
		fr.getContentPane().add(num1);
		JComboBox op = new JComboBox(Operator);
		op.setBounds(140,60,50,20);
		fr.getContentPane().add(op);
		JButton btn1 = new JButton("Calculate");
		btn1.setBounds(130,100,100,23);
		fr.getContentPane().add(btn1);
		JTextField num2 = new JTextField();
		num2.setBounds(240,60,70,20);
		fr.getContentPane().add(num2);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Number1=Integer.parseInt(num1.getText());
				int Number2=Integer.parseInt(num2.getText());
				if(op.getSelectedItem()=="+") {
					JOptionPane.showMessageDialog(fr,num1.getText()+" + "+num2.getText()+" = "+(Number1+Number2));
				}else if(op.getSelectedItem()=="-") {
					JOptionPane.showMessageDialog(fr,num1.getText()+" - "+num2.getText()+" = "+(Number1-Number2));
				}else if(op.getSelectedItem()=="x") {
					JOptionPane.showMessageDialog(fr,num1.getText()+" x "+num2.getText()+" = "+(Number1*Number2));
				}else {
					JOptionPane.showMessageDialog(fr,num1.getText()+" / "+num2.getText()+" = "+(Number1/Number2));
				}
				
			}
			});
		fr.setVisible(true);
	}

}
