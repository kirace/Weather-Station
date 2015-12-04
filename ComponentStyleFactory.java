package hw.hw6;

import java.awt.Color;


public class ComponentStyleFactory {

	private ComponentStyleFactory(){
		
	}
	
	public static ComponentStyleFactory instance(){
		return new ComponentStyleFactory();
	}
	
	public ComponentStyler create(Color c1, Color c2){
		return new ComponentStyler(c1, c2);
	}
	
	public ComponentStyler createMonochrome(Color c){
		int red = (int)(c.getRed() + (0.75 * (255 -c.getRed())));
		int blue = (int)(c.getBlue() + (0.75 * (255 -c.getBlue())));
		int green = (int)(c.getGreen() + (0.75 * (255 -c.getGreen())));
		Color lighterColor = new Color(red, green, blue);
		return new ComponentStyler(c, lighterColor);
	}
}
