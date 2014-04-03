package PracticeInJava;

/**
 * Created with IntelliJ IDEA.
 * User: War
 * Date: 24.01.14
 * Time: 14:33
 * To change this template use File | Settings | File Templates.
 */
public class Outside {

    class Inside{

        private int liczba=100;

        public void f(){
            System.out.println("Funkcja f klasy Inside, liczba = "+liczba);
        }
    }

    public String toString(){
        return "pole liczba wynosi "+ins.liczba;
    }
    Inside ins = new Inside();

    public void g() {

        ins.f();
        ins.liczba=200;
        ins.f();
}

    public Inside getInside()
    {
        return new Inside();
    }
}
