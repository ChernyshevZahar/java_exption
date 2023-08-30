import java.io.FileNotFoundException;
import java.util.Scanner;  



/**
 *  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class main {  
    public static void main(String[] args) {  
    //     readFloatInput num = new readFloatInput();
    //     System.out.println("Введенное число: " + num.getFloat());  

    /**
     * 
     * Если необходимо, исправьте данный код
     * 
     * небыло обработки ошибки с длиной массива
     * 
     * 
     */


    // try {  
    //     int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};  
    //     int d = 0;  
    //     double catchedRes1 = intArray[7] / d;  
    //     System.out.println("catchedRes1 = " + catchedRes1);  
    // } catch (ArithmeticException e) {  
    //     System.out.println("Catching exception: " + e);  
    // } catch (ArrayIndexOutOfBoundsException e) {  
    //     System.out.println("Catching exception ArrayIndex: " + e);  
    // }  
    // }  

    /**
     * 
     * Дан следующий код, исправьте его там, где требуется
     * 
     * удалил FileNotFoundException здесь он не нужен. Мы не читаем файл
     * 
     */
      

    //  try {  
    //         int a = 90;  
    //         int b = 3;  
    //         System.out.println(a / b);  
    //         printSum(23, 234);  
    //         int[] abc = {1, 2};  
    //         abc[3] = 9; // Выход за приледы масива. Выдаст ошибку 
    //     } catch (ArithmeticException ex) {  
    //         System.out.println("Деление на ноль!");  
    //     } catch (NullPointerException ex) {  
    //         System.out.println("Указатель не может указывать на null!");  // ? Зачем это  
    //     } catch (ArrayIndexOutOfBoundsException ex) {  
    //         System.out.println("Выход за пределы массива!");  
    //     } catch (Exception ex) {  
    //         System.out.println("Что-то пошло не так...");  
    //     }  
    // }  
  
    // public static void printSum(Integer a, Integer b) {  
    //     System.out.println(a + b);  
    // }  
    



    /**
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит 
     * пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */ 


    // try {  
    //     String input = readNonEmptyString();  
    //     System.out.println("Вы ввели: " + input);  
    //     } catch (Exception e) {  
    //         System.out.println("Ошибка: " + e.getMessage());  
    //     } 

    
    // }  

    // public static String readNonEmptyString() throws Exception {  
    //     Scanner scanner = new Scanner(System.in);  
    //     System.out.print("Введите строку: ");  
    //     String input = scanner.nextLine();  
    
    //     if (input.isEmpty()) {  
    //         throw new Exception("Пустые строки вводить нельзя");  
    //     }  
    
    //     return input;  
    // } 
}  