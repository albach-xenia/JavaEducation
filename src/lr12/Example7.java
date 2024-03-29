package lr12;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example7 {
    public static List<String> getStringsLongerThan(List<String> inputList, int length) {
        List<String> result = new ArrayList<>();
        for (String str : inputList) {
            if (str.length() > length) {
                result.add(str);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("один", "два", "три", "четыре", "пять");
        int length = 5;
        List<String> result = getStringsLongerThan(inputList, length);
        System.out.println(result);

    }

}