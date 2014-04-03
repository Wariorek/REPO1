package ApletyAplikacje;

import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import sun.plugin2.message.ShowStatusMessage;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;

/**
 * Created by War on 07.03.14.
 */
public class PierwszyAplet extends Applet implements MouseMotionListener {
    MyAudioClip myAudioClip;
    AudioClip audioClip;
    boolean update;
    Image img;
    Color color=null;
    Font font=null;
    String tekst="bla";
    Font Serif;
    Font SansSerif;
    Font czcionka;
    int widthaplet;
    int heighaplet;

    public PierwszyAplet() {
        System.out.println("konstruktor");
    }
    public void init(){
     myAudioClip=new MyAudioClip();
    audioClip=getAudioClip(getDocumentBase(),"[Sailor Moon R Movie] 14 Fukkatsu no Serenade.wav");
    addMouseListener(new MyMouseListener());
    addMouseMotionListener(this);
        System.out.println(getDocumentBase());
        img=getImage(getCodeBase(),"universe.jpg");
        font=new Font("SansSerif",Font.BOLD,36);
        Serif=new Font("Serif",Font.BOLD,36);
        color=new Color(200,100,150);
        System.out.println("Inicjalizacja Apletu");
    }
    public void start(){
        System.out.println("Uruchamianie Apletu");
       myAudioClip.play();
    }
    public void stop(){
        System.out.println("Zatrzymywanie Apletu");

    }



    public void paint(Graphics gDC){
        gDC.setFont(font);
        gDC.setFont(Serif);
        gDC.drawImage(img,20,20,this);

        FontMetrics fm=gDC.getFontMetrics();
        int strWidth=fm.stringWidth(tekst);
        int strHeight=fm.getHeight();
        int x=(getWidth()-strWidth)/2;
        int y=(getHeight()+strHeight)/2;
        gDC.drawString(tekst,x,y);
        widthaplet=getWidth();
        heighaplet=getHeight();
    }



    public void mouseDragged(MouseEvent e) {

    }


    public void mouseMoved(MouseEvent e) {


    }
}

