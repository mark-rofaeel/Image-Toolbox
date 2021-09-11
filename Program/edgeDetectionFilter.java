package imagetoolbox;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

class edgeDetectionFilter implements imageFilteration 
{
    public BufferedImage applyFilter(BufferedImage bufferedImage)
    {   
    	BufferedImage edgeImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),BufferedImage.TYPE_INT_ARGB);
    	Kernel kernel = new Kernel(3, 3, new float[] { -1 , -1 , -1 , -1 , 8 , -1 , -1 , -1 , -1 }); 
    	BufferedImageOp op = new ConvolveOp(kernel);
        System.out.println ("Done :)");
        return edgeImage = op.filter(bufferedImage, null);
    }  
}