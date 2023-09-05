package dz3;

import java.util.Scanner;

/**
     * Класс для запроса даты пользователя через функици GetInfo()
     * @return  дату в формате dd.mm.yyyy str
     * @throws IllegalArgumentException проброс ошибки ввода пользователя
     */

public class GetData {



    public String GetInfo() throws IllegalArgumentException{
        Scanner scanner = new Scanner(System.in);
        String dateOfBirthStr = null;
        System.out.println("Введите Дату в формете: dd.mm.yyyy");
        dateOfBirthStr = scanner.nextLine();
        if (dateOfBirthStr.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {  
            return dateOfBirthStr;
        }else{             
            throw new IllegalArgumentException("Неверный формат даты рождения");
        }
        
        
    }
    
}
