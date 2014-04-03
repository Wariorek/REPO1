package SystemWejsciaWyjscia;
import java.io.*;
/**
 * Created by War on 27.02.14.
 */
public class PolskieZnaki {



    public void testPolskichZnakow(){
        PrintWriter outp=null;
        try{
            outp=new PrintWriter(new OutputStreamWriter(System.out,"Cp852"),true);

        }

        catch(UnsupportedEncodingException e){
            System.out.println("Nie mozna ustawic strony kodowej Cp1250") ;
            outp=new PrintWriter(new OutputStreamWriter(System.out),true);

        }
        //System.out.println("Test polskich znakow: łćśąóźń");
        outp.println("Test polskich znakow: łćśńąóź");
    }
    }

