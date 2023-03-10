import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер телефона:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println(formatPhoneNumber(number));

    }
    //Замена одних фрагментов строк на другие
    public static String formatPhoneNumber(String phone) {
        String regex = "[^0-9]";
        return phone.replaceAll(regex, "");
    }
}