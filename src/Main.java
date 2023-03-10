import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите номер телефона:");
        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//        System.out.println(formatPhoneNumber(number));

//        System.out.println(splitText("I  know something   about   it"));

        System.out.println("Введите номер авто:");
        String number = scanner.nextLine();
        System.out.println(isRightNumber(number));

    }
    //Замена одних фрагментов строк на другие
    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }

    //Разбиение строк на фрагменты
    public static String splitText(String text) {
        String[] words = text.split("\s+");
        String result = "";
        for(int i = 0; i < words.length; i++) {
            result += words[i] + "\n";
        }
        return result;
    }
    public static Boolean isRightNumber(String number) {
        String regex = "[АВЕКМНОРСТУХ][0-9]{3}[АВЕКМНОРСТУХ]{2}[0-9]{2,3}";
            return number.matches(regex);
    }
}