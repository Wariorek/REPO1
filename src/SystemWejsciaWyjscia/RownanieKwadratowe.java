package SystemWejsciaWyjscia;
import java.io.*;

/**
 * Created by War on 27.02.14.
 */
public class RownanieKwadratowe {
    public double pobierzToken(StreamTokenizer token)
            throws IOException
    {     token.nextToken();
        while(token.ttype!=StreamTokenizer.TT_NUMBER){
            System.out.println("Zly format wprowadzonych danych, wprowadz liczbe ");
            token.nextToken();
        }
        return token.nval;
    }

    public void ObliczRownanieKwadratowe(double a,double b,double c){
        if(a==0){
            System.out.println("To nie jest rownanie kwadratowe");
        }   else{
            double delta=(b*b)-(4*a*c);
            if(delta<0){
                System.out.println("Nie ma rozwiazania w dziedzinie liczb zespolonych");
            }
            if(delta==0){
                double x=-b/(2*a);
                System.out.println("Jest jedno rozwiazanie i wynosi ono: "+x);

            }
            if(delta>0){
                double x1=(-b-Math.sqrt(delta))/(2*a);
                double x2=(-b+Math.sqrt(delta))/(2*a);
                System.out.println("Rownanie posiada dwa rozwiazania, x1 = "+x1+"  x2 = "+x2);
            }
        }
    }
}
