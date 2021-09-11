package imagetoolbox;
import java.util.Scanner;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class ImageToolBox 
{
	public static BufferedImage picture;
    public static void main(String[] args) throws IOException 
    {
    	System.out.println ("Welcome To our Image ToolBox :)");
	    picture=imageIO.load();
	  	System.out.println ("Do you want to edit or to save your image?");
	    System.out.println ("Press (1) if you want to edit or press (2) if you want to save");
		Scanner keyboard = new Scanner (System.in);
	    int x;
		x = keyboard.nextInt();
		switch(x)
	    {
			case 1:
			{
			      imageEditor.displayMenu(picture);
			      break;
		    }
			case 2:
		    {
		        imageIO.save(picture);
		        break;
		    }
	    }
		keyboard.close();      
    }
    public static void whatToDo(BufferedImage bufferedImage) throws IOException 
    {
    	System.out.println ("Do you want to do anything else or you want to save your edit?");
        System.out.println ("Press (1) if you want to do anything elso or press (2) if you want to save");
		Scanner keyboard = new Scanner (System.in);
        int choose;
        if(keyboard.hasNextInt()) 
        {
           choose = keyboard.nextInt();
	   		if(choose==1)
	        {
	            imageEditor.displayMenu(bufferedImage);
	        }
	        else
	        {
	            imageIO.save(bufferedImage);
	        }
        }
		keyboard.close();
    }
}