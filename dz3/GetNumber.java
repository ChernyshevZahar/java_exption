package dz3;

import java.util.Scanner;

    /**
     * Класс для запроса номера пользователя через функици GetInfo()
     * @return  номер пользователя str
     * @throws IllegalArgumentException проброс ошибки ввода пользователя
     */

public class GetNumber {

    
    
    public String GetInfo() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите номер телефона"); 
        String inputData = scanner.nextLine();
        long phoneNumber; 
        try {  
            phoneNumber = Long.parseLong(inputData);  
            if (phoneNumber <= 0) {  
                throw new IllegalArgumentException("Неверный формат номера телефона");  
            }else{
                return inputData;
            } 
        } catch (NumberFormatException e) {  
            throw new IllegalArgumentException("Неверный формат номера телефона");  
        } 
    }
}
