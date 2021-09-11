package imagetoolbox;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

class sharpenFilter implements imageFilteration
{
    public BufferedImage applyFilter(BufferedImage bufferedImage)
    {  
    	    BufferedImage sahrpenImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),BufferedImage.TYPE_INT_ARGB);
    	    Kernel kernel = new Kernel(3, 3, new float[] { -1, -1, -1, -1, 9, -1, -1,-1, -1 }); 
    	    BufferedImageOp op = new ConvolveOp(kernel);
        	System.out.println ("Done :)");
    	    return sahrpenImage = op.filter(bufferedImage, null);
    }
}