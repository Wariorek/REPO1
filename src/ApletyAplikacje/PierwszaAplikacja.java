package ApletyAplikacje;

import org.apache.xmlbeans.SchemaTypeSystem;

import java.awt.*;

/**
 * Created by War on 07.03.14.
 */
public class PierwszaAplikacja extends Frame{
    Font[] fonts;
    String[] fontName;
    GraphicsEnvironment ge;
    public PierwszaAplikacja(){
        setSize(400,100);
        setVisible(true);
        ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
        fonts=ge.getAllFonts();
        fontName=ge.getAvailableFontFamilyNames();
        for(int i=0;i<fonts.length;i++)
            System.out.println(fonts[i]+"   "+fontName[i]);
    }



    public void paint(Graphics gDC){
        gDC.drawString("PierwszaAplikacja",100,100);

    }

}
