import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageConverter {
	public ImageConverter() {
		
	}
	
	public static BufferedImage readBufferedImage(String fileName) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
	
	public static int[][] to2DArray(BufferedImage image) {
		int width = image.getWidth();
		int height = image.getHeight();
		
		int[][] array = new int[width][height];
		
		for(int i = 0; i < width; i++)
		    for(int j = 0; j < height; j++)
		        array[i][j] = image.getRGB(i, j);
		return array;
	}
}