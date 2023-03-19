package lr10.Example3;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        // Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        //Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товары");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Компьютер");
        dataRow1.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память:");
        dataRow1.createCell(2).setCellValue(25000.0);

        // Записываем книгу Excel в файл
        String filePath = "src/lr10/Example3/exemple.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}
