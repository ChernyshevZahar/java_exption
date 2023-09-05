package dz3;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

// для теста
// Иванов Иван Иванович 01.01.1990 1234567890 m

public class main {
    public static void main(String[] args) {
        
            GetName arrName = new GetName();
            GetData data = new GetData();
            GetNumber num = new GetNumber();
            GetGender gen = new GetGender();
            arrName.GetInfo();
            try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arrName.InfoSurname() + ".txt", true), "UTF-8"))){
                writer.write(
                            "<" +arrName.InfoSurname()+
                            "><" + arrName.InfoName() +
                            "><" + arrName.InfoSurname2() +
                            "><" + data.GetInfo() +
                            "><" + num.GetInfo() +
                            "><" + gen.GetInfo() +
                            ">\n"
                            );
            }   
            catch (IOException e) {  
                System.out.println("Произошла ошибка при записи данных в файл");  
                e.printStackTrace();  
            } catch (IllegalArgumentException e) {  
                System.out.println("Ошибка при обработке данных:");  
                System.out.println(e.getMessage());  
            }  
    }
}
