package SystemWejsciaWyjscia;
import java.lang.Math.*;
import java.io.*;
import java.util.StringTokenizer;
import java.util.regex.*;

/**
 * Created by War on 25.02.14.
 */
public class MainWejscieWyjscie

{



    public static void main(String args[]){
        KopiujBajtPoBajcie kopiujBajtPoBajcie=new KopiujBajtPoBajcie();
        kopiujBajtPoBajcie.kopiujpobajcie();

        BufferedReader brIn=null;

        try{

            brIn=new BufferedReader(new FileReader("D:\\dokument.txt"));
        }
        catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }

       String linia="";
        double b=0;
        StreamTokenizer tokener=null;
       try{

           while((linia=brIn.readLine())!=null) {
           b+=Double.parseDouble(linia);
       }

       }
       catch(IOException e ){

       }
        System.out.println("Suma liczb wynosi "+b);
        // DzialaniaArytmetyczne dzialaniaArytmetyczne= new DzialaniaArytmetyczne();
    //    dzialaniaArytmetyczne.dzialaniaAR();
        RownanieKwadratowe rownanie=new RownanieKwadratowe();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));




        String st="";
        Getnumber getnumber=new Getnumber(new InputStreamReader(System.in));
        System.out.println("Wprowadz znak z klawiatury");
              String s;

        try{

            while(true){
            StringTokenizer token=new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
              StreamTokenizer tok=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
                tok.nextToken();
                String string=tok.sval;


               // char c = string.charAt(0);
               // System.out.println(c);
            while(token.hasMoreElements()) {
            if("quit".equals(s=token.nextToken())){
                System.out.println("Koniec programu");
            return;
            }
                System.out.println(s);
            }
            }
           // System.out.println("Wprowdz pierwszy wspolczynnik, czyli a");
          //  double a= rownanie.pobierzToken(token);
          //  System.out.println("Wprowdz drugi wpolczynnik, czyli b");
           // double b=rownanie.pobierzToken(token);
           // System.out.println("Wprowdz trzeci wspolczynnik, czyli c");
           // double c=rownanie.pobierzToken(token);

         //  rownanie.ObliczRownanieKwadratowe(a,b,c);


            // st=getnumber.readLine();

            // char c = (char) System.in.read();
            // System.out.print("Wprowadzony znak to ");
            //System.out.println(c);
            //System.out.print("Jego kod to");
            //System.out.println((byte) c);
            // System.out.println("Teraz wprowadz ciag znakow i zakoncz wprowadzanie poprzez nacisniecie klawisza enter");

            //  System.out.println("Wprowadzona linia znakow to: ");
            //    String s="";
            //while(!"quit".equals(s)){
            //    s=bfr.readLine();
            //    System.out.println(s);
         //    System.out.println("koniec wczytywania danych");
           }
        catch(IOException e){
           System.out.println("Blad wprowadzania znaku");
            return;
       }
        catch(NullPointerException e){
            System.out.println("Koniec programu");
            return;
        }
       // try{

           // System.out.println("Liczba 2*a typu int wynosi "+2* getnumber.getInt(st));
           // System.out.println("Liczba 2*a wynosi typu double "+2*getnumber.getDouble(st));

       // }


             //   catch(NumberFormatException e){
              //      System.out.println("Zly format danych");
              //  }


                 //  if(token.ttype!=StreamTokenizer.TT_NUMBER){
                  //     System.out.println("To nie jest liczba");
                //      return;
                //   }
        //System.out.println("Wprowadzona liczba to: "+token.nval);

       // PolskieZnaki polskieZnaki=new PolskieZnaki();
      //  polskieZnaki.testPolskichZnakow();

    }


}
