package com.ldj.homework;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calctulator_sec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcSec acl = new CalcSec();
		acl.setVisible(true);
	}

}

class CalcSec extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField jtf_in;
	private JTextField jtf_out;
	
	public CalcSec() {
		setTitle("Calctulator");
		setSize(400, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		JPanel panel = new JPanel(new GridLayout(2, 1));
		
		jtf_in = new JTextField();
		jtf_in.setText("0");
		jtf_in.setBorder(BorderFactory.createEmptyBorder());
		jtf_in.setBackground(Color.white);
		jtf_in.setEditable(false);
		jtf_in.setHorizontalAlignment(JTextField.RIGHT);
		
		jtf_out = new JTextField();
		jtf_out.setBorder(BorderFactory.createEtchedBorder());
		jtf_out.setEditable(false);
		jtf_out.setHorizontalAlignment(JTextField.RIGHT);
		
		
		panel.add(jtf_out);
		panel.add(jtf_in);
		add(panel, new GBC(0,0,4,1).setFill(GBC.BOTH).setWeight(100, 100));
		
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5, 4, 1, 1));
		String[] str = {
				"%","¡Ì","CE","¡û",
				"7","8","9","/",
				"4","5","6","*",
				"1","2","3","+",
				"-","0",".","="};
		pAc pac = new pAc(jtf_in, jtf_out); 
		for (int i = 0; i < str.length; i++) {
			JButton jb = new JButton(str[i]);
			jb.setBorder(BorderFactory.createRaisedBevelBorder());
			panel1.add(jb);
			jb.addActionListener(pac);
		}
		add(panel1, new GBC(0,1,4,5).setFill(GBC.BOTH).setWeight(100, 100));
	}
	
}

class pAc implements ActionListener{
	private JTextField jta_in;
	private JTextField jta_out;
	private boolean flag = false;
	
	public pAc(JTextField jta_in, JTextField jta_out) {
		this.jta_in = jta_in;
		this.jta_out = jta_out;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String str_out = jta_out.getText();
		String str_in = jta_in.getText();
		// TODO Auto-generated method stub
		String name = e.getActionCommand();
		if(flag) {
			str_in = "0";
			flag = false;
		}
		switch(name) {
		case "0":
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
			if(str_out.equals("") && str_in.equals("0")) {
				str_in = name;
			}else if(str_out.equals("") && !str_in.equals("0")){
				str_in += name;
			}else {
				if("+-*/%¡Ì".contains(str_in)) {
					str_in = "";
					str_in += name;
					break;
				}
				if(panLast(str_out)) {
					str_in += name;
				}	
			}	
			break;
		case "+":
		case "-":
		case "*":
		case "/":
		case "¡Ì":
		case "%":
			if("+-*/%¡Ì".contains(str_in)) {
				str_in = name;
				str_out = str_out.substring(0, str_out.length() - 1) + name;
			}else {
				if(panNum(str_in)) {
					str_out += str_in;
					str_in = name;
					str_out += name;
				}
			}
			break;
		case "CE":
			str_out = "";
			str_in = "0";
			break;
		case "¡û":
			str_out = str_out.substring(0, str_out.length() - 1);
			str_in = "0";
			break;
		case ".":
			if(str_in.matches("\\d+")) {
				str_in += name;
			}else {
				str_in = "0.";
			}
		case "=":
			if(panNum(str_in)) {
				str_out += str_in;
			}
			if("+-*/%¡Ì".contains(str_out.substring(str_out.length() - 1, str_out.length()))) {
				System.out.println("Wrong!");
				break;
			}
			str_in = getResult(str_out);
			str_out = "";
			flag = true;
		}
		jta_in.setText(str_in);
		jta_out.setText(str_out);
	}
	
	private boolean panLast(String str) {
		String str0 = str.substring(str.length() - 1, str.length());
		if("+-*/%¡Ì".contains(str0)) {
			return true;
		}
		if(str0.equals(".")||str0.matches("[1-9]")) {
			return true;
		}else if(str0.equals("0")){
			 return panLast(str.substring(0, str.length() - 1));
		}else {
			return false;
		}
	}
	private boolean panNum(String str) {
		if(str.matches("[1-9][0-9]*(\\.)?[0-9]*") || str.matches("0\\.[0-9]+")) {
			return true;
		}else {
			return false;
		}
	}
	private String getResult(String str) {
		
		return str;
	}
}