import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declara constante
        final int AGE_LIMIT = 18;
        System.out.println("digits of your age");
        int age = scanner.nextInt();
        if(age < 0){
            System.out.println("Age non-existent");  
        }
        
        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
            
        }
        
    }
}
