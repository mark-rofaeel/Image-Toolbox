package imagetoolbox;
import java.awt.*;
import java.awt.image.BufferedImage;

class imageConversion extends imageEditor
{
    public BufferedImage applyEdit(BufferedImage bufferedImage) 
    {
        BufferedImage result = new BufferedImage(
        		bufferedImage.getWidth(),
        		bufferedImage.getHeight(),
                BufferedImage.TYPE_BYTE_BINARY);
        Graphics2D graphic = result.createGraphics(); //Creates a Graphics2D, which can be used to draw into this BufferedImage
        graphic.drawImage(bufferedImage, 0, 0, Color.WHITE, null);
        graphic.dispose();
    	System.out.println ("Done :)");
		return result;
    }
}