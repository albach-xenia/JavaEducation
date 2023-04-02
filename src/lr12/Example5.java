package lr12;

public class Example5 {
    public static void main(String[] args) {
        String string1 = "Напишите функцию, которая принимает на вход список строк и возвращает новый список, содержащий только те строки, которые содержат заданную подстроку";
        String string2 = "которые содержат заданную подстроку";
        int index1 = string1.indexOf(string2);

        int index2 = index1 + string2.length();
        System.out.println(string1.substring(index1, index2));
    }
}

