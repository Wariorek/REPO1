package ApletyAplikacje;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by War on 23.03.14.
 */
public class CheckBox extends Frame implements ActionListener {
       TextField textField;
       List list;
   public CheckBox(){

       setVisible(true);
       setSize(500, 500);
       addWindowListener(
               new WindowAdapter() {
                   public void windowClosing(WindowEvent e) {
                       dispose();
                   }
               }
       );
       textField=new TextField();
       textField.setBounds(220,130,110,20);
       list= new List(20,true);
       list.setBounds(10,130,200,150);
       setLayout(null);

       Button butADD=new Button("Dodaj");
       butADD.setBounds(220,160,50,20);
       butADD.setActionCommand("Dodaj");
       butADD.addActionListener(this);

       Button butREM=new Button("Usuń");
       butREM.setBounds(220,190,50,20);
       butREM.setActionCommand("Usuń");
       butREM.addActionListener(this);


      add(butADD);
      add(butREM);
      add(list);
      add(textField);

   }


    public void actionPerformed(ActionEvent e) {
        String item=textField.getText();
        if(e.getActionCommand().equals("Dodaj")){
               if(!item.equals(""))
                   list.add(item);
           }
        else if(e.getActionCommand().equals("Usuń")){
                 String tab[]=list.getSelectedItems();
                 for(int i=0;i<tab.length;i++)
                   list.remove(tab[i]);
           }
    }
}
