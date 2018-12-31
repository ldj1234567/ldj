package com.ldj.homework;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calctulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		calc.setLocation(300, 100);
	}

}

class Calc extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField jta;
	private JTextField jta_out;
	
	private JButton num0 = new JButton("0");
	private JButton num1 = new JButton("1");
	private JButton num2 = new JButton("2");
	private JButton num3 = new JButton("3");
	private JButton num4 = new JButton("4");
	private JButton num5 = new JButton("5");
	private JButton num6 = new JButton("6");
	private JButton num7 = new JButton("7");
	private JButton num8 = new JButton("8");
	private JButton num9 = new JButton("9");
	private JButton jb_plus = new JButton("+");
	private JButton jb_minus = new JButton("-");
	private JButton jb_time = new JButton("*");
	private JButton jb_divide = new JButton("/");
	private JButton jb_equal = new JButton("=");
	private JButton jb_point = new JButton(".");
	private JButton jb_del = new JButton("del");
	private JButton jb_sqrt = new JButton("¡Ì");
	private JButton jb_remainder = new JButton("%");
	private JButton jb_clear = new JButton("C");
	
	public Calc() {
		setTitle("¼ÆËãÆ÷");
		setSize(260, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		setLayout(new GridBagLayout());
		
		jta = new JTextField();
		jta.setText("0");
		jta.setBackground(Color.white);
		jta.setEditable(false);
		jta.setHorizontalAlignment(JTextField.RIGHT);
		jta.setBorder(BorderFactory.createEtchedBorder());
		
		jta_out = new JTextField();
		jta_out.setEditable(false);
		jta_out.setHorizontalAlignment(JTextField.RIGHT);
		jta_out.setBorder(BorderFactory.createEmptyBorder());
		
		add(jta_out, new GBC(0,0,4,1).setFill(GBC.BOTH).setWeight(100, 100));
		add(jta, new GBC(0,1,4,1).setFill(GBC.BOTH).setWeight(100, 100));
		
		// % ¡Ì C delete
		add(jb_remainder, new GBC(0,2).setWeight(100, 100));
		add(jb_sqrt, new GBC(1,2).setWeight(100, 100));
		add(jb_clear, new GBC(2,2).setWeight(100, 100));
		add(jb_del, new GBC(3,2).setWeight(100, 100));
		//7 8 9 /
		add(num7, new GBC(0,3).setWeight(100, 100));
		add(num8, new GBC(1,3).setWeight(100, 100));
		add(num9, new GBC(2,3).setWeight(100, 100));
		add(jb_divide, new GBC(3,3).setWeight(100, 100));
		//4 5 6 *
		add(num4, new GBC(0,4).setWeight(100, 100));
		add(num5, new GBC(1,4).setWeight(100, 100));
		add(num6, new GBC(2,4).setWeight(100, 100));
		add(jb_time, new GBC(3,4).setWeight(100, 100));
		//1 2 3 +
		add(num1, new GBC(0,5).setWeight(100, 100));
		add(num2, new GBC(1,5).setWeight(100, 100));
		add(num3, new GBC(2,5).setWeight(100, 100));
		add(jb_plus, new GBC(3,5).setWeight(100, 100));
		//- 0 . =
		add(jb_minus, new GBC(0,6).setWeight(100, 100));
		add(num0, new GBC(1,6).setWeight(100, 100));
		add(jb_point, new GBC(2,6).setWeight(100, 100));
		add(jb_equal, new GBC(3,6).setWeight(100, 100));
		
		num0.addActionListener(event->write(num0));
		num1.addActionListener(event->write(num1));
		num2.addActionListener(event->write(num2));
		num3.addActionListener(event->write(num3));
		num4.addActionListener(event->write(num4));
		num5.addActionListener(event->write(num5));
		num6.addActionListener(event->write(num6));
		num7.addActionListener(event->write(num7));
		num8.addActionListener(event->write(num8));
		num9.addActionListener(event->write(num9));
		
		jb_point.addActionListener(event->action(jb_point));
		
		jb_plus.addActionListener(event->action(jb_plus));
		
		jb_minus.addActionListener(event->action(jb_minus));
		
		jb_time.addActionListener(event->action(jb_time));
		jb_divide.addActionListener(event->action(jb_divide));
		
		jb_del.addActionListener(event->action(jb_del));
		
		jb_clear.addActionListener(event->action(jb_clear));
		
		
		jb_remainder.addActionListener(event->action(jb_remainder));
		
		jb_sqrt.addActionListener(event->action(jb_sqrt));
		jb_equal.addActionListener(event->action(jb_equal));

	}

	private void write(JButton jb) {
		String content = jb.getText();
		this.jta.setText(content);
		
		String str = jta_out.getText();
		str += content;
		jta_out.setText(str);
		
	}
	
	private void action(JButton jb) {
		String flag = jb.getText();
		if(flag.equals("=")) {
			
		}else if(flag.equals(".")){
			
		}else {
			write(jb);
		}
	}
	
}

class GBC extends GridBagConstraints{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public GBC(int gx, int gy) {
		this.gridx = gx;
		this.gridy = gy;
	}
	
	public GBC(int gx, int gy, int gw, int gh) {
		this.gridx = gx;
		this.gridy = gy;
		this.gridwidth = gw;
		this.gridheight = gh;
	}
	
	public GBC setAnchor(int anchor) {
		this.anchor = anchor;
		return this;
	}
	
	public GBC setFill(int fill) {
		this.fill = fill;
		return this;
	}
	public GBC setWeight(double weightx, double weighty) {
		this.weightx = weightx;
		this.weighty = weighty;
		return this;
	}
	public GBC setInsets(int diatance) {
		this.insets = new Insets(diatance, diatance, diatance, diatance);
		return this;
	}
	public GBC setInsets(int top, int left, int bottom, int right) {
		this.insets = new Insets(top, left, bottom, right);
		return this;
	}
	public GBC setIpad(int ipadx, int ipady) {
		this.ipadx = ipadx;
		this.ipady = ipady;
		return this;
	}
}