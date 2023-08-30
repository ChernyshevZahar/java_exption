import java.util.Scanner;

public class readFloatInput {

        public float getFloat(){
            Scanner scanner = new Scanner(System.in);  
            float number = 0;  
            boolean validInput = false;  
            
            while (!validInput) {  
                System.out.print("Введите дробное число: ");  
                if (scanner.hasNextFloat()) {  
                    number = scanner.nextFloat();  
                    validInput = true;  
                } else {  
                    System.out.println("Ошибка ввода! Попробуйте снова.");  
                    scanner.nextLine();
                }  
            }  
            
            return number;
        }
        
}
