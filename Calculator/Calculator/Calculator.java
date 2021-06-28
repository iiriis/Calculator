/*
author @iiriis
*/


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import java.util.*;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField textField;
	String s="";
	int op=0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	String res="";
	private void initialize() {
		
		Stack<String> st=new Stack<>();
		
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 286, 440);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textField.setBackground(SystemColor.control);
		textField.setBounds(1, 0, 268, 50);
		textField.setColumns(10);
		frmCalculator.getContentPane().add(textField);
		
		
		JButton btnNewButton_2 = new JButton("M+");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(135, 50, 67, 50);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_1 = new JButton("MR");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(68, 50, 67, 50);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		JButton btnNewButton = new JButton("MC");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(1, 50, 67, 50);
		frmCalculator.getContentPane().add(btnNewButton);
		frmCalculator.getContentPane().add(btnNewButton_1);
		frmCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("M-");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(202, 50, 67, 50);
		frmCalculator.getContentPane().add(btnNewButton_3);
		
		JButton button_13 = new JButton("%");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_13.setBounds(1, 100, 67, 50);
		button_13.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_13);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s="";
				st.clear();
				op=0;
				
				textField.setText("0");
			}
		});
		btnCe.setBounds(68, 100, 67, 50);
		btnCe.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s="";
				textField.setText("0");
			}
		});
		btnC.setBounds(135, 100, 67, 50);
		btnC.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnC);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
				s=s.substring(0,s.length()-1);
				textField.setText(s);
				}
				else
				textField.setText("");
			}
		});
		btnDel.setBounds(202, 100, 67, 50);
		btnDel.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnDel);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
					st.push(s);		
					
					op=7;
					s="";	
			}
		});
		btnx.setBounds(1, 150, 67, 50);
		btnx.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnx);
		
		JButton btnX = new JButton("x\u00B2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
					st.push(s);		
					
					op=6;
					s="";	
			}
		});
		btnX.setBounds(68, 150, 67, 50);
		btnX.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnX);
		
		JButton btnx_1 = new JButton("\u221Ax");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				{
					st.push(s);		
					res = Double.toString(Math.sqrt(Double.parseDouble(st.pop())));
					st.push(res);
					textField.setText(res);
				}
						
					op=0;
					s="";	
			}
		});
		btnx_1.setBounds(135, 150, 67, 50);
		btnx_1.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(btnx_1);
		
		JButton button_12 = new JButton("\u00F7");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
					st.push(s);		
					
					op=4;
					s="";	
			}
		});
		button_12.setBounds(202, 150, 67, 50);
		button_12.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_12);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+="7";
				textField.setText(s);
			}
		});
		button.setBounds(1, 200, 67, 50);
		button.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button);
		
		JButton button_3 = new JButton("8");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s+=8;
				textField.setText(s);
			}
		});
		button_3.setBounds(68, 200, 67, 50);
		button_3.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_3);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=9;
				textField.setText(s);
			}
		});
		button_7.setBounds(135, 200, 67, 50);
		button_7.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_7);
		
		JButton button_17 = new JButton("\u00D7");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
					st.push(s);		
					
					op=3;
					s="";	
			}
		});
		button_17.setBounds(202, 200, 67, 50);
		button_17.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_17);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=4;
				textField.setText(s);
			}
		});
		button_1.setBounds(1, 250, 67, 50);
		button_1.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_1);
		
		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=5;
				textField.setText(s);
			}
		});
		button_5.setBounds(68, 250, 67, 50);
		button_5.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_5);
		
		JButton button_8 = new JButton("6");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=6;
				textField.setText(s);
			}
		});
		button_8.setBounds(135, 250, 67, 50);
		button_8.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_8);
		
		JButton button_18 = new JButton("\u2500");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
					st.push(s);		
					
					op=2;
					s="";				
			}
		});
		button_18.setBounds(202, 250, 67, 50);
		button_18.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_18);
		
		JButton button_9 = new JButton("1");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=1;
				textField.setText(s);
			}
		});
		button_9.setBounds(1, 300, 67, 50);
		button_9.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("2");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=2;
				textField.setText(s);
			}
		});
		button_10.setBounds(68, 300, 67, 50);
		button_10.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("3");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=3;
				textField.setText(s);
			}
		});
		button_11.setBounds(135, 300, 67, 50);
		button_11.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_11);
		
		JButton button_19 = new JButton("+");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(s.length()>0)
				st.push(s);		
				
				op=1;
				s="";				
				
			}
		});
		button_19.setBounds(202, 300, 67, 50);
		button_19.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_19);
		
		JButton button_2 = new JButton("\u00B1");
		button_2.setBounds(1, 350, 67, 50);
		button_2.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_2);
		
		JButton button_4 = new JButton("0");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=0;
				textField.setText(s);
			}
		});
		button_4.setBounds(68, 350, 67, 50);
		button_4.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_4);
		
		JButton button_6 = new JButton(".");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s+=".";
				textField.setText(s);
			}
		});
		button_6.setBounds(135, 350, 67, 50);
		button_6.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_6);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(op==1)
					res = Double.toString(Double.parseDouble(st.pop())+Double.parseDouble(s));
				else if(op==2)
					res = Double.toString(Double.parseDouble(st.pop())-Double.parseDouble(s));
				else if(op==3)
					res = Double.toString(Double.parseDouble(st.pop())*Double.parseDouble(s));
				else if(op==4)
					res = Double.toString(Double.parseDouble(st.pop())/Double.parseDouble(s));
				else if(op==5)
					res = Double.toString(Double.parseDouble(st.pop())-Double.parseDouble(s));
				
				
				st.push(res);
				textField.setText(res);
				
				//System.out.println(res);
				
				op=0;
				s="";				
			}
		});
		
		button_14.setBounds(202, 350, 67, 50);
		button_14.setBackground(new Color(211, 211, 211));
		frmCalculator.getContentPane().add(button_14);
	}
	
	public String calculate(String a, String b)
	{
		return Double.toString(Double.parseDouble(a)+Double.parseDouble(b));
	}
}
