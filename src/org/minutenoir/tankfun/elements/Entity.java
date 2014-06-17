package org.minutenoir.tankfun.elements;

import org.minutenoir.tankfun.utils.ImageConverter;

/**
 * This is the parent class of all the
 * elements presented in the game view.
 * This class also deals with the logics
 * like movements and collisions.
 */
public abstract class Entity {
	
	
	private int X=0, Y=0; //The left-top position of this element
	private int width, height; 
	
	private int[][] image;//The array of RGB pixels of this entity to present
	
	/**
	 * 
	 * @return
	 * The left position of this entity
	 */
	public final int getX(){
		return X;
	}
	
	/**
	 * @return
	 * The top position of this entity
	 */
	public final int getY(){
		return Y;
	}
	
	/**
	 * 
	 * @param posX
	 * The left position to set
	 * @param posY
	 * The top position to set
	 */
	public void setPosition(int posX, int posY){
		X=posX;
		Y=posY;
	}
	
	public void setImage(int[][] image){
		this.image=image;
		width=image[0].length;
		height=image.length;
		
	}
	
	/**
	 * @return
	 * The width of this entity
	 */
	public final int getWidth(){
		return width;
	}
	
	/**
	 * @return
	 * The height of this entity
	 */
	public final int getHegiht(){
		return height;
	}
	
	
	public int[][] getRotated(Rotation degree){
		int[][] result=null;
		switch(degree){
		case DEG_0:
			result=image;
			break;
		case DEG_90:
			result=new int[image[0].length][image.length];
			for(int i=0; i<image.length; i++){
				for(int j=0; j<image[0].length; j++){
					result[j][image.length-i]=image[i][j];
				}
			}
			break;
		case DEG_180:
			result=new int[image.length][image[0].length];
			for(int i=0; i<image.length; i++){
				for(int j=0; j<image[0].length; j++){
					result[image.length-i][image[0].length-j]=image[i][j];
				}
			}
			break;
		case DEG_270:
			result=new int[image[0].length][image.length];
			for(int i=0; i<image.length; i++){
				for(int j=0; j<image[0].length; j++){
					result[image[0].length-j][i]=image[i][j];
				}
			}
			break;
		}
		
		
		return result;
	}
	
	/**
	 * 
	 * @param imagePath
	 * The full path of the image file to be used as the image of this entity
	 */
	public Entity(String imagePath){
		image=ImageConverter.convert(imagePath);
		width=image[0].length;
		height=image.length;
	}
	
	/**
	 * 
	 * @param imagePath
	 * The full path of the image file to be used as the image of this entity
	 * @param posX
	 * The left position of this entity to be set
	 * @param posY
	 * The top position of this entity to be set
	 */
	public Entity(String imagePath, int posX, int posY){
		image=ImageConverter.convert(imagePath);
		width=image[0].length;
		height=image.length;
		X=posX;
		Y=posY;
	}
	
	
	/**
	 * 
	 *The rotation that can be performed
	 *
	 */
	public static enum Rotation{DEG_0, DEG_90, DEG_180, DEG_270};
}
