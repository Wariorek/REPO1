package SystemWejsciaWyjscia;

import java.io.File;

/**
 * Created by War on 05.03.14.
 */
public class Delete {
    public void delete(){
    File file=new File("D:\\FolderDoUsuniecia");
    int iloscPlikow=0;
    int iloscKatalogow=0;
    File[] DirList=file.listFiles();
    String[] SDirList=file.list();
    for(int i=0;i<DirList.length;i++){
        if(!DirList[i].isDirectory()){
            DirList[i].delete();
            System.out.println("Erased "+DirList[i]);
            iloscPlikow=++iloscPlikow;

        }
        else{
            DirList[i].delete();
            iloscKatalogow=++iloscKatalogow;
            System.out.println("Erased "+DirList[i]);
        }
        file.delete();
    }
    System.out.println("Ilosc usunietych katalogow wynosi :"+iloscKatalogow);
    System.out.println("Ilosc usunietych plikow wynosi :"+iloscPlikow);
    }
}
