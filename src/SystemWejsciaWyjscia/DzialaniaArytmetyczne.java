package SystemWejsciaWyjscia;
import com.thaiopensource.relaxng.output.OutputDirectory;

import java.io.*;
/**
 * Created by War on 27.02.14.
 */
public class DzialaniaArytmetyczne {
    StreamTokenizer token=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));

 public void dzialaniaAR(){
     double b=0;
     double a=0;
     String s;
     System.out.println("Podaj  liczbe");

     try{
         token.nextToken();
         if(token.TT_NUMBER==token.ttype){
         a= token.nval;

         while(true){
            token.nextToken();
             s=token.sval;

            char c = s.charAt(0);
             switch(c){
                 case (int)'+':
                     try{token.nextToken(); }
                     catch(IOException e){System.out.println("Zly format danych");
                     continue;}
                     if(token.TT_NUMBER==token.ttype)
                         b=a+token.nval;
                     else{System.out.println("Wprowadz liczbe");continue;}

                 break;


                 case (int)'-' :
                     try{token.nextToken(); }
                     catch(IOException e){System.out.println("Zly format danych");
                         continue;}
                     if(token.TT_NUMBER==token.ttype)
                         b=a-token.nval;
                     else{System.out.println("Wprowadz liczbe");continue;}
                     break;

                 case (int)'*'  :
                     try{token.nextToken(); }
                     catch(IOException e){System.out.println("Zly format danych");
                         continue;}
                     if(token.TT_NUMBER==token.ttype)
                         b=a*token.nval;
                     else{System.out.println("Wprowadz liczbe");continue;}
                 break;

                 case (int)'/' :
                     try{token.nextToken(); }
                     catch(IOException e){System.out.println("Zly format danych");
                         continue;}
                     if(token.TT_NUMBER==token.ttype)
                         b=a/token.nval;
                     else{System.out.println("Wprowadz liczbe");continue;}
                     break;

                 case (int)'=' :
                     System.out.println("Wynik dzialania wyosi " + b);
                     return;

                 default :
                }

         }
     }
     }
     catch(IOException e){
         System.out.println("Zly format danych, wprowadz dane jeszcze raz");
     }
 }
}
