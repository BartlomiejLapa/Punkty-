public class Uwsp {
    // Uklad wsp.

    void wsp (int a, int b) {


        String[][] uWsp = new String[13][25];


        for (int i = 0; i < uWsp.length; i++) {
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

        for (int i=0;i<uWsp.length;i++){
            for(int j=0;j<uWsp[i].length;j++)
                System.out.print (uWsp[i][j]);
            System.out.println ( );
        }

    }
}
