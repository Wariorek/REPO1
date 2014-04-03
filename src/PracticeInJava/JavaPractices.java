
package PracticeInJava;
import KlasyWewnetrzne.*;
import KlasyWewnetrzne.A;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 24.01.14
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class JavaPractices {

    public static void main(String args[]){

        Outside out = new Outside();
        out.g();

        Outside.Inside ins1=out.new Inside();
        ins1.f();

        OutsideExtended outEX=new OutsideExtended();
        OutsideExtended.Inside ins2=outEX.new Inside();
        OutsideExtended.InsideExtended insEX=outEX.new InsideExtended();

        insEX.l();
        ins2.f();
        outEX.g();
        outEX.h();

        A klasaA =new A();
        klasaA.ZapisLiczby(20);
        System.out.println("Liczba klasy B wynosi " + klasaA.OdczytLiczby());


       PierwszyInterfejs przykladrz=new Example();

       przykladrz.setLiczba(25);
       System.out.println("liczba klasy example obiektu zrzutowanego na interfejs wynosi: " + przykladrz.getLiczba());

        Example przyklad=new Example();
        System.out.println("liczba klasy example obiektu example :"+przyklad.setAndgetLiczba(22));
        PierwszyInterfejs pi;
        pi= new PierwszyInterfejs() {
            private int liczba;

            public int getLiczba() {
              return liczba;
            }


            public void setLiczba(int liczba) {
                 this.liczba=liczba;
            }
        } ;
               pi.setLiczba(5);
                          System.out.println("anonimowa klasa rzutowana na pierwszyinterfejs "+pi.getLiczba());

        PierwszyInterfejs pie=new Example();
        pie.setLiczba(8);

        Example ex1=new Example(){
         public void f(){
             System.out.println("Funkcja f klasy anonimowej");
         }
        } ;
        Example ex2=new Example();
        ex1.f();
        ex2.f();
        A.B klasaB=klasaA.new B();
        System.out.println(przyklad) ;
        System.out.println(pie);
        baseclass anonim=new baseclass(2.5){

        };

        A.C.f();
    }


}
