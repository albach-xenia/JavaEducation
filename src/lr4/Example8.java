package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shifr = in.nextInt();
        String encryptStr = Caeser.encrypt(text, shifr);

        System.out.print("Текст после преобразования :" + "\"" + encryptStr + "\"");

        System.out.print("\nВыполнить обратное преобразование? (y/n)"); // пользователю
        boolean cool = false;
        while (!cool) {
            String reply = in.next();
            // если пользователь вводит «y», тогда выполнить обратное преобразование.
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, shifr );
                System.out.println(decryptStr);
                cool = true;
            }
            // Если пользователь вводит «n», того программа выводит сообщение «До свидания!».
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            // Если пользователь вводит что-то другое, отличное от «y» или «n»,
            // то программа ему выводит сообщение: «Введите корректный ответ».
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }
    }
    private static class Caeser {
        static String encryptText;
        private static String encrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }

}


