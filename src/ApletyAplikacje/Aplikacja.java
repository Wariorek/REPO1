package ApletyAplikacje;

import javafx.scene.control.Separator;
import javafx.scene.input.MouseButton;

import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by War on 17.03.14.
 */
public class Aplikacja extends Frame implements ActionListener, TextListener {
    int x=150;
    int y=150;
    MyMenu mymenu=new MyMenu();
    Font serif;
    TextField textField;
    TextArea textArea;

    public Aplikacja(){
        serif=new Font("Serif",Font.BOLD,15);

        setMenuBar(mymenu.menuBar);
        add(mymenu.popupMenu);
        addMouseListener(mymenu);
        mymenu.menu1.addActionListener(this);
        mymenu.menuItem1.addItemListener(mymenu);
        mymenu.menuItem2.addItemListener(mymenu);
        mymenu.miZamknij.addActionListener(this);

        addWindowListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e) {
                        dispose();
                    }
                }
        );

        setVisible(true);
        setSize(500,300);
        mymenu.popupMenu.addActionListener(this);
        System.out.println(getSize());


        setLayout(null);
        Label label1=new Label("Pierwsza etykieta");
        label1.setBounds(100,80,150,20);

        Label label2=new Label();
        label2.setText("Etykieta2");
        label2.setBounds(100,100,150,20);

        add(label1);
        add(label2);
        textField=new TextField();
        textField.setBounds(100,160,150,30);
        textField.addTextListener(this);

        textArea=new TextArea();
        textArea.setBounds(300,300,400,400);
        add(textArea);

       Button button3=new Button("Save");
       button3.setBounds(420,730,150,30);
       button3.addActionListener(this);
       button3.setActionCommand("Save");

       Button button1=new Button("Przycisk1");
       button1.setBounds(100,200,150,30);
       button1.addActionListener(this);
       button1.setActionCommand("showtitle");

       Button button2=new Button();
       button2.setLabel("Przycisk2");
       button2.setBounds(100,240,150,30);
       button2.addActionListener(this);
       button2.setActionCommand("Zamknij");

      add(textField);
      add(button1);
      add(button2);
      add(button3);
    }

    public void paint(Graphics gDC){

        setFont(serif);
        FontMetrics fm=gDC.getFontMetrics();
        int strWidth=fm.stringWidth("Aplikacja");
        int strHeight=fm.getHeight();
        x=(getWidth()-strWidth)/2;
        y=(getHeight()+strHeight)/2;

        gDC.drawString(mymenu.tekst,x,y);
    }

    public void save(){
       String text=textArea.getText();
        FileWriter fileWriter=null;
        try{
        fileWriter=new FileWriter("D:\\test.txt",false);
        fileWriter.write(text,0,text.length());
        fileWriter.close();

        }
        catch(IOException e){
            System.out.println("blad wejscia wyjscia");
        }

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Zamknij")){
            dispose();
        }
        if(e.getActionCommand().equals("Nowe okno")){
            Aplikacja nowaAplikacja=new Aplikacja();
        }
        if(e.getActionCommand().equals("showtitle")){
            setTitle(textField.getText());
        }

        if(e.getActionCommand().equals("Save")){
            save();

        }


    }


    public void textValueChanged(TextEvent e) {
     setTitle(textField.getText());
    }
}










