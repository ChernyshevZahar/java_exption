package dz3;

import java.util.Scanner;

    /**
     * Класс для запроса Гендера пользователя через функцию GetInfo()
     * @return Символ(f/m) str
     * @throws IllegalArgumentException проброс ошибки ввода пользователя
     */

public class GetGender {
    

    public String GetInfo() throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in, "UTF-8"); 
        System.out.println("Введите свой пол (f/m)"); 
        String genderStr = scanner.nextLine();  
        if ((genderStr.equals("f") || genderStr.equals("m"))) {  
            return genderStr;
        }else{
            throw new IllegalArgumentException("Неверный формат пола");
        }
    }
}
