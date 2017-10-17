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



        // Uklad wsp.

        String [][] uWsp = new String[13][25];


        for (int i=0; i<uWsp.length; i++) {
            for (int j = 0; j < uWsp[i].length; j++) {
                uWsp[i][j] = " ";
        //osie
                if (j == 12)
                    uWsp[i][j] = "|";
                else if (i == 6)
                    uWsp[i][j] = "_";
            }
        }

        uWsp[(-1)*b+6][2*a+12] = "#";
        //Wyswietlenie Ukladu wsp

        for (int i=0;i<uWsp.length;i++){
            for(int j=0;j<uWsp[i].length;j++)
                System.out.print (uWsp[i][j]);
                System.out.println ( );
        }

    }
}
