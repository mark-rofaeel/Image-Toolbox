package imagetoolbox;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class imageIO
{
    public static BufferedImage load() throws IOException 
    {
    	File imageFile = new File("C:\\Users\\Mark Rofaeel\\Desktop\\1.png");
    	BufferedImage bufferedImage = ImageIO.read(imageFile);
    	return bufferedImage;
    }
    public static File save(BufferedImage newImage) throws IOException
    {
    	File imageFile = new File("C:\\Users\\Mark Rofaeel\\Desktop\\1-new.png");
    	ImageIO.write(newImage,"png", imageFile);
    	System.out.println ("Done :)");
	    return imageFile;
    }
}