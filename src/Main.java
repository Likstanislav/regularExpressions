import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите номер телефона:");
        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
//        System.out.println(formatPhoneNumber(number));

//        System.out.println(splitText("I  know something   about   it"));
//
//        String number = scanner.nextLine();
//        System.out.println(isRightNumber(number));

        String text = scanner.nextLine();
        System.out.println(searchFragment(text));
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

    public static String searchFragment(String text) {
        String regex = "https://[^,\s]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String result = "";
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            result = text.substring(start,end);
        }
        return result;
    }
}