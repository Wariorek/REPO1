package KlasyWewnetrzne;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 04.02.14
 * Time: 22:07
 * To change this template use File | Settings | File Templates.
 */
public class Example implements PierwszyInterfejs {
    private int liczba;

    public void setLiczba(int liczba){
             this.liczba=liczba;
    }
          public int getLiczba(){
              return liczba;

          }
    public int setAndgetLiczba(int liczba){
        this.liczba=liczba;
        return liczba;
    }
    public void f(){
        System.out.println("Funkcja f klasy example");
    }
    public String toString(){
        return "Pole liczba wynosi "+liczba;
    }
    PierwszyInterfejs getI1(){
        PierwszyInterfejs pi=new PierwszyInterfejs() {
               private int liczba;
            public int getLiczba() {
                     return this.liczba;
            }

            @Override
            public void setLiczba(int liczba) {
                     this.liczba=liczba;
            }

        };
                return pi;
    }
}
