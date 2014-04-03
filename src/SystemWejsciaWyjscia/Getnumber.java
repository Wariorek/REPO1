package SystemWejsciaWyjscia;

import java.io.BufferedReader;
import java.io.Reader;

/**
 * Created by War on 25.02.14.
 */
public class Getnumber extends BufferedReader{



    public Getnumber(Reader reader) {
        super(reader);
    }


    public int getInt(String s){
  try{
       return Integer.parseInt(s);
  }
  catch(NumberFormatException e){
      System.out.println("Blad formatu danych, wprowadz poprawne dane typu int");
          return 0;
        }
   }
    public double getDouble(String s){
       try{ return Double.parseDouble(s);
       }
       catch(NumberFormatException e){
           System.out.println("Blad formatu danych, wprowadz poprawne dane typu double");
           return 0;
       }
       }

}
