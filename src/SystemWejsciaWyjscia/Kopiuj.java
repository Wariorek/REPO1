package SystemWejsciaWyjscia;
import java.io.*;
/**
 * Created by War on 06.03.14.
 */
public class Kopiuj {
    void kopiuj()  {

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
                while(true)
                {
                    System.out.println("Plik docelowy juz istnieje\nSkasowac istniejacy plik? Y/N");
                    String takczynie=Reader.readLine();
                    if("Y".equals(takczynie))
                    {
                        destfile.delete();
                        break;
                    }
                    if("N".equals(takczynie)){
                        return;
                    }

                }
            }
            RandomAccessFile rafSource=new RandomAccessFile(sourcefile,"r");
            RandomAccessFile rafDest=new RandomAccessFile(destfile,"rw");

           int count=0;
           int buffsize=10000;
           byte[] buff=new byte[buffsize];
            while((count=rafSource.read(buff))!=-1){
                rafDest.write(buff,0,count);

            }
            rafSource.close();
            rafDest.close();
        }
        catch(IOException e){
            System.out.println("Blad wejscia wyjscia");
        }

    }
}
