package org.minutenoir.tankfun;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.minutenoir.tankfun.utils.ImageConverter;
import org.minutenoir.tankfun.utils.ScreenRenderer;

public class OvalPanelCanvas extends JPanel {
	public OvalPanelCanvas() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    int width = getWidth();
	    int height = getHeight();
	    g.setColor(Color.white);
	    g.fillRect(0, 0, width, height);
	    g.setColor(Color.white);
	    g.drawOval(0, 0, width, height);
	    g.setColor(Color.BLUE);
	    g.fillRect(0, 0, 10, 10);
	    //g.drawString("Hello world! ", 75, 75);
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] watchDog = ImageConverter.convert("assets/images/watch_dog.png");
	    int[][] steelworker = ImageConverter.convert("assets/images/steelworker.png");
	    int[][] harmonizer = ImageConverter.convert("assets/images/harmonizer.png");
		
		JFrame frame = new JFrame("Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    OvalPanelCanvas tmp = new OvalPanelCanvas();
	    frame.add(tmp);
	    frame.setSize(1200, 675);
	    frame.setVisible(true);
	    frame.setResizable(false);
	    
		ScreenRenderer renderer = new ScreenRenderer(tmp);
		renderer.drawSprite(watchDog, 64, 36);
		renderer.drawSprite(steelworker, 100, 30);
		renderer.drawSprite(harmonizer, 200, 105);
		
		/*
		for (int i = 0; i < watchDog.length; i++) {
			for (int j = 0; j < watchDog[0].length; j++) {
				System.out.printf("%X ", watchDog[i][j]);
			}
			System.out.println("");
		}
		*/
	}

}