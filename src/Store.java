import java.util.Scanner;
public class Store {

    public static void main(String[] args) {
        //Inicializar scanner para que sea dinamico
        Scanner scanner = new Scanner(System.in);
        int GOODSALES = 50;
        int price[] = new int[3];
        int cant[] = new int[3];
        int total[] = new int[3];
        int totalSales = 0;

        //Pedir 3 valores enteros
        System.out.println("Enter price of the products");
        // Almacena en un array los precios con ayuda del for para evitar codigo repetitivo
        for(int i=0; i<price.length; i++){
            price[i] = scanner.nextInt();
        }

        //Pedir la cantidad
        System.out.println("Enter the amounts");
        // Almacena en un array las cantidades con ayuda del for para evitar codigo repetitivo
        for(int i=0; i<cant.length; i++){
            cant[i] = scanner.nextInt();
        }

        //Calcula los valores totales
        for(int i=0; i<total.length; i++){
            total[i] = (price[i] * cant[i]);
            totalSales += total[i];
        }
        
        //Imprime si fueron buenas ventas o no
        if(totalSales > GOODSALES){
            System.out.println("Good sales performance");
        }else{
            System.out.println("Low sales performance");
        }
        System.out.println("Sales:" + totalSales); 
    }
}