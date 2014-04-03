package SystemWejsciaWyjscia;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.*;

/**
 * Created by War on 02.03.14.
 */
public class MyFileNameFilter implements FilenameFilter {
    Pattern pattern;


    public MyFileNameFilter(String mask){
         pattern=Pattern.compile(mask);
    }
    public boolean accept(File dir, String name) {
        Matcher matcher=pattern.matcher(name);

        return matcher.matches();
    }
}

/* listowanie plikow i porownywanie ich z wyrazeniem regularnym
if(args.length<1){
        System.out.println("Program zostal wywolany bez argumentow nastapi jego zamkniecie");
        return;
        }
        File file=new File(args[0]);
        String[] dirList=file.list();
        if(args.length<2)
        {
        dirList=file.list();
        }
        else{
        try{
        dirList=file.list((FilenameFilter) new MyFileNameFilter(args[1])) ;
        System.out.println("Cos sie dzieje");
        }
        catch(PatternSyntaxException e) {
        System.out.println("Nieprawidlowe wyrazenie regularne"+args[1]);
        return;
        }
        }
        for(int i=0;i<dirList.length;i++)
        {System.out.println(dirList[i]);
        }  */