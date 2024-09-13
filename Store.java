import java.util.Scanner;
public class Store {

    public static void main(String[] args) {
        //Crear Constantes
        final int P1 = 15;
        final int P2 = 10;
        final int P3 = 5;
        final int TOTAL1 = P1 * 2;
        final int TOTAL2 = P2 * 3;
        final int TOTAL3 = P3 * 4;

        int price[];
        price = new int[3];
        price[0] = P1;
        price[1] = P2;
        price[2] = P3;
        for(int i=0; i<price.length; i++){
        }
        


        int TOTALSALES = TOTAL1 + TOTAL2 + TOTAL3;

        if (TOTALSALES > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}