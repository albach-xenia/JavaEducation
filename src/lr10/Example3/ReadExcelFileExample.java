package lr10.Example3;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;


import java.io.FileInputStream;
import java.io.IOException;



public class ReadExcelFileExample {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel для чтения
        String filePath = "src/lr10/Example3/exemple.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        //Создаем экземпляр книги Excel из файла
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        //Получаем лист из книги по его имени
        XSSFSheet sheet = workbook.getSheet("Товары");

        //Перебираем строки из ячейки листа
        for (Row row : sheet){
            for (Cell cell : row){
                //Выводим значение ячейки на экран
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }

        //Закрываем файл и освобождаем ресурсы
        workbook.close();
        inputStream.close();
    }
}
