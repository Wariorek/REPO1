package ApletyAplikacje;
 import java.net.MalformedURLException;
 import java.net.URL;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by War on 16.03.14.
 */
public class MyMouseListener  implements MouseListener,MouseMotionListener{
     String tekst="";
    public void mouseClicked(MouseEvent evt){


    }
    public void mouseEntered(MouseEvent evt){}
    public void mouseExited(MouseEvent evt){}
    public void mousePressed(MouseEvent evt){
        String tekst="";
        int button=evt.getButton();
        switch(button){
            case MouseEvent.BUTTON1:
                tekst="Przycisk 1";
                break;
            case MouseEvent.BUTTON2:
                tekst="Przycisk 2";
                break;
            case MouseEvent.BUTTON3:
                tekst="Przycisk 3";
                break;
            default:
                tekst="";
                break;

        }
        tekst+="współrzędne: x="+evt.getX()+", y="+evt.getY();
        System.out.println(tekst);
    }
    public void mouseReleased(MouseEvent evt){}


    public void mouseDragged(MouseEvent e) {

    }


    public void mouseMoved(MouseEvent evt) {
        tekst="Wpolrzędne myszy przy wciśniętym klawiszu myszy";
         tekst+="x="+evt.getX()+", y="+evt.getY();
       System.out.println(tekst);
    }
}
