package imagetoolbox;
import java.util.Scanner;
import java.awt.image.BufferedImage;

class imageCropper extends imageEditor
{
    static Object keyboard;
    public BufferedImage applyEdit(BufferedImage bufferedImage)
    {    
        int height,width,x,y;
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("Please enter the x-axis corner to start from");
        x = keyboard.nextInt();
        System.out.println ("Please enter the y-axis corner to start from");
        y = keyboard.nextInt(); 
        System.out.println ("Please enter width");
        width = keyboard.nextInt();
        System.out.println ("Please enter height");
        height = keyboard.nextInt();
        keyboard.close(); 
        BufferedImage croppedImage = bufferedImage.getSubimage(x, y, width, height);
    	System.out.println ("Done :)");
        return croppedImage;        
    }
}