package Lab_Week15_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tester {

	public static void main(String[] args) {
		JFrame fr = new JFrame(); 
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		fr.setBounds(100,100,350,450); 
		fr.setTitle("Welcome to Java GUI");
		fr.getContentPane().setLayout(null); 
		String[] Education = {"High school","Bechelor","Master's Degree","Ph.D"};
		JLabel label1 = new JLabel("Name");
		JLabel label2 = new JLabel("Password");
		JLabel label3 = new JLabel("Address");
		JLabel label4 = new JLabel("Gender");
		JLabel label5 = new JLabel("Skills");
		JLabel label6 = new JLabel("Education");
		label1.setBounds(40,20,200,14);
		label2.setBounds(40,40,200,14);
		label3.setBounds(40,60,200,14);
		label4.setBounds(40,117,200,14);
		label5.setBounds(40,140,200,14);
		label6.setBounds(40,282,200,14);
		fr.getContentPane().add(label1);
		fr.getContentPane().add(label2);
		fr.getContentPane().add(label3);
		fr.getContentPane().add(label4);
		fr.getContentPane().add(label5);
		fr.getContentPane().add(label6);
		JTextField txt1 = new JTextField();
		JPasswordField pass = new JPasswordField();
		pass.setBounds(110,40,144,20);
		fr.getContentPane().add(pass);
		txt1.setBounds(110,20,144,20);
		fr.getContentPane().add(txt1);
		JTextArea ta = new JTextArea(5,120);
		ta.setBounds(110, 60,144,30);
		fr.getContentPane().add(ta);
		JScrollPane scroll = new JScrollPane(ta);
		scroll.setBounds(110,60,144,50);
		fr.getContentPane().add(scroll);
		JButton btn1 = new JButton("OK");
		btn1.setBounds(140,370,80,23);
		fr.getContentPane().add(btn1);
		JRadioButton sex1 = new JRadioButton("Male");
		sex1.setBounds(110,115,60,20);
		fr.getContentPane().add(sex1);
		JRadioButton sex2 = new JRadioButton("Female");
		sex2.setBounds(170,115,75,20);
		fr.getContentPane().add(sex2);
		JCheckBox cb1 = new JCheckBox("C");
		cb1.setBounds(110,140,100,14);
		fr.getContentPane().add(cb1);
		JCheckBox cb2 = new JCheckBox("C++");
		cb2.setBounds(110,160,100,14);
		fr.getContentPane().add(cb2);
		JCheckBox cb3 = new JCheckBox("Java");
		cb3.setBounds(110,180,100,14);
		fr.getContentPane().add(cb3);
		JCheckBox cb4 = new JCheckBox("Python");
		cb4.setBounds(110,200,100,14);
		fr.getContentPane().add(cb4);
		JCheckBox cb5 = new JCheckBox("PHP");
		cb5.setBounds(110,220,100,14);
		fr.getContentPane().add(cb5);
		JCheckBox cb6 = new JCheckBox("R");
		cb6.setBounds(110,240,100,14);
		fr.getContentPane().add(cb6);
		JComboBox edu = new JComboBox(Education);
		edu.setBounds(110,280,144,20);
		fr.getContentPane().add(edu);
		ButtonGroup group = new ButtonGroup();
		group.add(sex1);
		group.add(sex2);
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				String skill = "";
				if(cb1.isSelected()) {
					skill+=cb1.getText()+" ";
				}if(cb2.isSelected()) {
					skill+=cb2.getText()+" ";
				}if(cb3.isSelected()) {
					skill+=cb3.getText()+" ";
				}if(cb4.isSelected()) {
					skill+=cb4.getText()+" ";
				}if(cb5.isSelected()) {
					skill+=cb5.getText()+" ";
				}if(cb6.isSelected()) {
					skill+=cb6.getText();
				}
				if(sex1.isSelected()) {
					JOptionPane.showMessageDialog(fr,"Your Information\n"+label1.getText()+" : "+txt1.getText()+"\n"+label3.getText()+" :"+ta.getText()+"\n"+label4.getText()+" :"+sex1.getText()+"\n"+label5.getText()+" : "+skill+"\n" +label6.getText()+" : "+edu.getSelectedItem());
				}else if(sex2.isSelected()) {
					JOptionPane.showMessageDialog(fr,"Your Information\n"+label1.getText()+" : "+txt1.getText()+"\n"+label3.getText()+" :"+ta.getText()+"\n"+label4.getText()+" :"+sex2.getText()+"\n"+label5.getText()+" : "+skill+"\n" +label6.getText()+" : "+edu.getSelectedItem());
				}
			}
		});
		fr.setVisible(true);
		
	}
}
