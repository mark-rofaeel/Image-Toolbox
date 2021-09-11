package imagetoolbox;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

class smoothFilter implements imageFilteration
{
	public BufferedImage applyFilter(BufferedImage bufferedImage)
	{
		 float val=1f/9f;
	     float[]data={ val, val, val,val, val, val, val, val, val };
		 Kernel kernel = new Kernel(3, 3,data);
		 BufferedImageOp ConOp = new ConvolveOp(kernel);
		 bufferedImage = ConOp.filter(bufferedImage, null);
		 System.out.println ("Done :)");
		 return bufferedImage;
	}
}