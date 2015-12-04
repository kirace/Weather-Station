package hw.hw6;
import java.awt.Color;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;

public class ComponentStyler {
	private Color color1;
	private Color color2;
	
	public ComponentStyler(Color c1, Color c2){
		this.color1 = c1;
		this.color2 = c2;
	}
	
	public JButton createButton(String text){
		JButton button = new JButton(text);
		Border border1 = new LineBorder(color1,4);
	    button.setBorder(border1);
		button.setBackground(color2);
		button.setOpaque(true);
		return button;
	}
	
	public JLabel createLabel(String text){
		JLabel label = new JLabel(text);
		//Border border1 = new LineBorder(color1,4);
	    //label.setBorder(border1);
		//label.setBackground(color2);
		//label.setOpaque(true);
		label.setForeground(color1);
		return label;
	}
	
	public JTextField createTextField(int i){
		JTextField textField = new JTextField(i);
		Border border1 = new LineBorder(color1,4);
		textField.setBorder(border1);
		textField.setBackground(color2);
		textField.setOpaque(true);
		return textField;
	}
	
	public JTextArea createTextArea(int i1, int i2){
		JTextArea textArea = new JTextArea(17, 35);
		Border border1 = new LineBorder(color1,4);
	    textArea.setBorder(border1);
		textArea.setBackground(color2);
		textArea.setOpaque(true);
		return textArea;
	}

}
