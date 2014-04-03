package SystemWejsciaWyjscia;

import  java.io.*;



/**
 * Created by War on 06.03.14.
 */
public class KopiujBajtPoBajcie {

    void kopiujpobajcie()  {

    BufferedReader Reader=new BufferedReader(new InputStreamReader(System.in));
    try{
    System.out.println("Wprowadz ścieżkę pliku, który chcesz przekopiować");
    String Source=Reader.readLine();
    System.out.println("Wprowadz ścieżkę pliku docelowego");
    File sourcefile=new File(Source);
    if(!sourcefile.exists()){
        System.out.println("Plik źródłowy nie istnieje");
        return;
    }
    String Dest=Reader.readLine();
    File destfile=new File(Dest);
    if(destfile.exists()){
        System.out.println("Plik docelowy juz istnieje");
        return;
    }
        //RandomAccessFile rafSource=new RandomAccessFile(sourcefile,"r");
       // RandomAccessFile rafDest=new RandomAccessFile(destfile,"rw");
          BufferedInputStream bufSource=null;
          BufferedOutputStream bufDest=null;

            bufSource=new BufferedInputStream(new FileInputStream(sourcefile));
            bufDest=new BufferedOutputStream(new FileOutputStream(destfile));




            int b;
        int count=0;
        int buffsize=10000;
        byte[] buff=new byte[buffsize];
        while((count=bufSource.read(buff))!=-1){
            bufDest.write(buff,0,count);
        }
        //while((b=bufSource.read())!=-1){
       // bufDest.write(b);

      // }
        bufSource.close();
        bufDest.close();
    }
    catch(IOException e){
        System.out.println("Blad wejscia wyjscia");
    }

    }

}

