package lr10.Example7;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;


public class Json {
    public static void main(String[] args) {
        JSONObject library = new JSONObject();
        JSONArray books = new JSONArray();

        JSONObject book1 = new JSONObject();
        book1.put("title", " Тихий Дон ");
        book1.put("author", " Михаил Шолохов ");
        book1.put("year", 1925);

        JSONObject book2 = new JSONObject();
        book2.put("title", " Анна Каренина ");
        book2.put("author", " Лев Толстой ");
        book2.put("year", 1873);

        books.add(book1);
        books.add(book2);

        library.put("books", books);

        try  (FileWriter file = new FileWriter("src/lr10/Example2/Example-json.json")) {
            file.write(library.toJSONString());
            System.out.println(" Json файл успешно создан! ");
        }     catch (Exception e){
            e.printStackTrace();
        }
    }
}
