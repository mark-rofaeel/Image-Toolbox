package imagetoolbox;
import java.awt.*;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.awt.image.RescaleOp;

class imageBrightness extends imageEditor 
{
	public BufferedImage applyEdit(BufferedImage bufferedImage)
	{
	    BufferedImage bi = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
	    Graphics bg = bi.getGraphics();
	    bg.drawImage(bufferedImage, 0, 0, null);
	    bg.dispose();
		Scanner keyboard = new Scanner (System.in);
    	System.out.println ("Enter a number from 1 to 4 to bright: ");
    	float x;
 		x = keyboard.nextFloat();
    	RescaleOp rescaleOp = new RescaleOp(x, 0, null);
	    rescaleOp.filter(bi, bi);
	    keyboard.close();
    	System.out.println ("Done :)");
	    return bi;
	}
}