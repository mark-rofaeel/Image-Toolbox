package imagetoolbox;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

class imageResizer extends imageEditor
{
	public BufferedImage applyEdit(BufferedImage bufferedImage)
    {
        int height,width;
		Scanner keyboard = new Scanner (System.in);
        System.out.println ("Please enter height");
        height = keyboard.nextInt();
        System.out.println ("Please enter width");
        width = keyboard.nextInt();
		Image tmp = bufferedImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        keyboard.close();
    	System.out.println ("Done :)");
        return resized;
    }
}