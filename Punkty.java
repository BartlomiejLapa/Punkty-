import java.util.Scanner;
public class Punkty {
    public static void main(String args[]){

        int a;
        int b;

        System.out.println ("Podaj wsp. x od -6 do 6 ");
        Scanner odczytA = new Scanner (System.in);
        a = odczytA.nextInt ();
            while (a<-6 || a>6) {
                System.out.println ("Glupcze naucz sie czytac.\n Podaj jeszcze raz wsp. x od -6 do 6 ");
                a = odczytA.nextInt ();
            }


        System.out.println ("Podaj wsp. y od -6 do 6 ");
        b = odczytA.nextInt ();
            while (b<-6 || b>6) {
                System.out.println ("Glupcze naucz sie czytac.\n Podaj jeszcze raz wsp. y od -6 do 6 ");
                b = odczytA.nextInt ( );
            }



    Uwsp uklad = new Uwsp();
        uklad.wsp (a,b);


    }
}
