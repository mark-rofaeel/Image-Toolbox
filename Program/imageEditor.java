package imagetoolbox;
import java.util.Scanner;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class imageEditor 
{
	public static void displayMenu(BufferedImage pic)
    {
	    int choice;
	    BufferedImage pic2;
	    Scanner x = new Scanner (System.in);
	    System.out.println ("Choose a tool by pressing the number");
	    System.out.println ("Press (1) Add text");
	    System.out.println ("Press (2) Resize");
	    System.out.println ("Press (3) Crop");
	    System.out.println ("Press (4) Bright");
	    System.out.println ("Press (5) Convert to black and white");
	    System.out.println ("Press (6) Sharpen filter");
	    System.out.println ("Press (7) Smooth filter");
	    System.out.println ("Press (8) Detect Edge");
	    System.out.println ("===>");
	    choice = x.nextInt();  
		    switch (choice)
		    {
		        		case 1:
                        {
                        	imageEditor obj = new text(); 
                            pic2=obj.applyEdit(pic);
                            try {
								//ImageToolBox.whatToDo(pic2);
                	            imageIO.save(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 2:
                        {
                        	imageEditor obj = new imageResizer();
                            pic2=obj.applyEdit(pic);
                            try {
								//ImageToolBox.whatToDo(pic2);
                	            imageIO.save(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 3:
                        {
                        	imageEditor obj = new imageCropper();
                            pic2=obj.applyEdit(pic);
                            try {
								//ImageToolBox.whatToDo(pic2);
                	            imageIO.save(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 4:
                        {
                        	imageEditor obj = new imageBrightness();
                            pic2=obj.applyEdit(pic);
                            try {
								//ImageToolBox.whatToDo(pic2);
                	            imageIO.save(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 5:
                        {
                        	imageEditor obj = new imageConversion();
                            pic2=obj.applyEdit(pic);
                            try {
								ImageToolBox.whatToDo(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 6:
                        {
                            imageFilteration obj = new sharpenFilter();
                            pic2=obj.applyFilter(pic);
                            try {
								ImageToolBox.whatToDo(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 7:
                        {
                        	imageFilteration obj = new smoothFilter();
                            pic2=obj.applyFilter(pic);
                            try {
								//ImageToolBox.whatToDo(pic2);
                	            imageIO.save(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
                        case 8:
                        {
                        	imageFilteration obj = new edgeDetectionFilter();
                            pic2=obj.applyFilter(pic);
                            try {
								ImageToolBox.whatToDo(pic2);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
                            break;
                        }
		    }
		    x.close();
    }
	public BufferedImage applyEdit(BufferedImage bufferedImage) 
	{
		return null;
	}
}