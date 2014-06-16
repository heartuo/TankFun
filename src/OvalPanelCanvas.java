import java.awt.image.BufferedImage;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OvalPanelCanvas extends JPanel {

	public OvalPanelCanvas() {
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
	    int width = getWidth();
	    int height = getHeight();
	    g.setColor(Color.black);
	    g.fillRect(0, 0, width, height);
	    g.setColor(Color.white);
	    g.drawOval(0, 0, width, height);
	    g.drawString("Hello world! ", 75, 75);
	  }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Oval Sample");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.add(new OvalPanelCanvas());
	    frame.setSize(300, 200);
	    frame.setVisible(true);
	    
	    BufferedImage image = ImageConverter.readBufferedImage("assets/images/watch_dog.png");
	    int[][] test = ImageConverter.to2DArray(image);
	    for (int j = 0; j < test[0].length; j++) {
	    	for (int i = 0; i < test.length; i++) {
	    		System.out.printf("%X ", test[i][j]);
	    	}
	    	System.out.println();
	    }
	}

}