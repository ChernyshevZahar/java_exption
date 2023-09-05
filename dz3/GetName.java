package dz3;

import java.util.Scanner;

/**
     * Класс для запроса фимилии имя отчества пользователя через функици GetInfo()
     * @return  InfoName() - Имя, InfoSurname() - Фимилию, InfoSurname2() - Отчество
     * @throws IllegalArgumentException проброс ошибки ввода пользователя
     */

public class GetName {
        private String surname;
        private String surname2;
        private String name;
        public void GetInfo() throws IllegalArgumentException {
            Scanner scanner = new Scanner(System.in, "Cp866");
            String[] inputData = null;
            System.out.println("Введите Фамилию Имя Отчество");
            inputData = scanner.nextLine().split(" ");
            if(inputData.length == 3){
                surname = inputData[0];
                name = inputData[1];
                surname2 = inputData[2];
            }else{             
                throw new IllegalArgumentException("Вы не указали какие то данные");
            }
            
            
        }
        /**
         * Запрос имени пользователя 
         * @return имя str
         */
        public String InfoName(){
            return name;
        }
        /**
         * Запрос Отчество пользователя 
         * @return Отчество str
         */
        public String InfoSurname2(){
            return surname2;
        }
        /**
         * Запрос Фимилии пользователя 
         * @return Фимилию str
         */
        public String InfoSurname(){
            return surname;
        }
        
}
