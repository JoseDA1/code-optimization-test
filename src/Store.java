import java.util.Scanner;
public class Store {

    public static void main(String[] args) {
        //Inicializar scanner para que sea dinamico
        Scanner scanner = new Scanner(System.in);
        int GOODSALES = 50;

        System.out.println("Amount of products");
        int amoutProducts = scanner.nextInt();
        int price[] = new int[amoutProducts];
        int cant[] = new int[amoutProducts];
        int total[] = new int[amoutProducts];
        int totalSales = 0;

        //Pedir 3 valores enteros
        // Almacena en un array los precios con ayuda del for para evitar codigo repetitivo
        for(int i=0; i<price.length; i++){
            System.out.println("Enter price of the product");
            price[i] = scanner.nextInt();
            System.out.println("Enter the amount");
            cant[i] = scanner.nextInt();
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