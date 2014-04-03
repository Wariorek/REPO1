package KlasyWewnetrzne;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 04.02.14
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
public class A {

    private B obiektB=new B();

         public  class B{
            int liczba;

        }
    public static class C{
        public static void f(){
            System.out.println("metoda statyczna f klasy statycznej C");
        }
    }

    B getClassB(){
        return new B();
    }

     public int OdczytLiczby(){
        return obiektB.liczba;
     }

    public void ZapisLiczby(int liczba){
       obiektB.liczba=liczba;
    }

}
