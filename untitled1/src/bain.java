import java.util.Scanner;

public class bain {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных с консоли
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите слово: ");
        String word = scanner.next();

        // Получаем последний символ в слове
        char lastLetter = word.charAt(word.length() - 1);

        System.out.println("Последняя буква введенного слова: " + lastLetter);
    }
}

