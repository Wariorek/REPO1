package ApletyAplikacje;
import sun.awt.WindowClosingListener;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by War on 21.03.14.
 */
public class MyMenu implements  ItemListener, MouseListener {

    String tekst="";
    PopupMenu popupMenu;
    MenuItem miZamknij;
    MenuBar menuBar;
    Menu menu1;
    Menu menu2;
    Menu menu3;
    boolean zamknij=false;
    CheckboxMenuItem menuItem1,menuItem2;
    public MyMenu(){
        miZamknij=new MenuItem("Zamknij");
        menuBar=new MenuBar();

        menu1=new Menu("Menu1");
        menu2=new Menu("Menu2");
        menu3=new Menu("Menu3");

        menuBar.add(menu1);

        menuItem1=new CheckboxMenuItem("Pozycja1",true);
        menu1.add(menuItem1);
        menuItem1.setActionCommand("position1");
        menuItem2=new CheckboxMenuItem("Pozycja2",false);
        menu1.add(menuItem2);
        menuItem1.setActionCommand("position2");
        MenuItem menuItem11=new MenuItem("Nowe okno");
        MenuItem menuItem12=new MenuItem("item2");
        MenuItem menuItem13=new MenuItem("item3");
        MenuItem menuItem21=new MenuItem("item1");
        MenuItem menuItem22=new MenuItem("item2");
        MenuItem menuItem31=new MenuItem("item1");
        MenuItem menuItem32=new MenuItem("item2");

        menu1.add(menuItem11);
        menu1.add(menuItem12);
        menu1.add(menu2);
        menu1.addSeparator();
        menu1.add(miZamknij);
        menu2.add(menuItem13);
        menu2.add(menu3);
        menu2.add(menuItem21);
        menu2.add(menuItem22);
        menu3.add(menuItem31);
        menu3.add(menuItem32);

        popupMenu=new PopupMenu();
        popupMenu.add(new MenuItem("Pozycja1"));
        popupMenu.getItem(0).setActionCommand("position1");
        popupMenu.add(new MenuItem("Pozycja2"));
        popupMenu.getItem(1).setActionCommand("position2");
        popupMenu.addSeparator();
        popupMenu.add(miZamknij);
        popupMenu.getItem(3).setActionCommand("Zamknij");

    }


    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==menuItem1){
            if(menuItem1.getState())
                System.out.println("Pozycja 1 jest zaznaczona");
            else
                System.out.println("Pozycja 1 nie jest zaznaczona");
    }
    }

    public void mouseClicked(MouseEvent e) {
        if(e.getButton()==MouseEvent.BUTTON3){
            popupMenu.show((Component) e.getSource(),e.getX(),e.getY());
            tekst="Pozycja x="+e.getX()+" Pozycja y="+e.getY();
        }
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}


}
