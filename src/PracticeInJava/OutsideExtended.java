package PracticeInJava;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 04.02.14
 * Time: 20:20
 * To change this template use File | Settings | File Templates.
 */
public class OutsideExtended extends Outside{
    public void h(){
        System.out.println("klasa OutsideExtended");

    }
    public class InsideExtended     {
                   public void l(){
                       System.out.println("Funkcja klasy ExtendeInside");
                   }
    }
}
