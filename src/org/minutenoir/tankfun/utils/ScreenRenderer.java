package org.minutenoir.tankfun.utils;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ScreenRenderer {
	public final static int widthInBlocks = 400;
	public final static int heightInBlocks = 225;
	public final static int blockSideLength = 3;
	//so that the size of the game screen is locked to 1200 * 675 in pixels
	
	public JPanel canvas;
	
	public ScreenRenderer(JPanel canvas) {
		this.canvas = canvas;
	}
	
	public void drawSprite(int[][] image, int xInBlocks, int yInBlocks) {
		
		Graphics g = canvas.getGraphics();
		
		for (int i = 0; i < image[0].length; i++) {
			for (int j = 0; j < image.length; j++) {
				g.setColor(new Color(image[j][i], true));
				g.fillRect(i * blockSideLength + xInBlocks * blockSideLength, j * blockSideLength + yInBlocks * blockSideLength, blockSideLength, blockSideLength);
			}
		}
	}
}
