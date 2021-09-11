package imagetoolbox;
import java.awt.*;
import java.util.Scanner;
import java.awt.image.BufferedImage;

class text extends imageEditor
{ 
    public BufferedImage applyEdit(BufferedImage bufferedImage)	
    {
        BufferedImage textImage = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = textImage.getGraphics();
        g.drawImage(bufferedImage, 0, 0, null);
        String h;
        int x,y;
    	Scanner s = new Scanner (System.in);
        System.out.println ("Please enter your text");
        h = s.nextLine();
        System.out.println ("Please enter the x-axis position");
        x = s.nextInt(); 
        System.out.println ("Please enter the y-axis position");
        y = s.nextInt();
        g.setColor(Color.red);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 26));
        g.drawString(h,x,y);
        g.dispose();
        s.close();
    	System.out.println ("Done :)");
		return textImage;
    }
}