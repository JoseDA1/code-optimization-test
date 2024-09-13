import java.util.Scanner;
public class TaxCalculation {
    public static void main(String[] args) {
        //Inicializar scanner
        Scanner scanner = new Scanner(System.in);

        //Declarar contantes
        final double TAX_RATE_HIGH = 0.15;
        final double TAX_RATE_LOW = 0.10;
        final double TAX_THRESHOLD = 50;

        //Declarar array
        int productPrice[] = new int[2];
        //Inicializa el radio de los impuestos y añade manualmente los valores
        double taxRate[] = new double[2];
        taxRate[0] = TAX_RATE_HIGH;
        taxRate[1] = TAX_RATE_LOW;
        //Inicaliza array para impuestos
        double tax[] = new double[2];
        //Inicializa totalTax
        double totalTax = 0;

        //Usar bucles para almacenar precios de productos
        System.out.println("Enter price of the products");

        for(int i=0; i<productPrice.length; i++){
            // Almacena en un array los precios 
            productPrice[i] = scanner.nextInt();
        }

        for(int i = 0; i<taxRate.length; i++){
            //Almacena la multiplicacion de productos por impuestos
            tax[i] = (productPrice[i] * taxRate[i]);
            //Suma los impuestos
            totalTax += tax[i];
        }
        //Imprime si son bajo o alto los impuestos
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax " + totalTax);
        }
    }
}
