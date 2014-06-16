package org.minutenoir.tankfun.utils;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageConverter {
	/**
	 * 
	 * @param path: The path of the image to read
	 * @return The pixel array
	 */
	public static int[][] convert(String path){
		int [][] pix=null;
		try {
			BufferedImage image=ImageIO.read(new File(path));
			int w=image.getWidth();
			int h=image.getHeight();
			pix=new int[h][w];
			
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					pix[i][j]=image.getRGB(j, i);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pix;
	}

}
