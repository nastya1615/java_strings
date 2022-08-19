package practice.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            String regex1 = "[^0-9]";
            input = input.replaceAll(regex1, "");
            String regex2 = "[/^8]";
            input = input.replaceAll(regex2, "7");
            String regex3 = "[0-9]{10}";
            if (input.matches(regex3)) {
                input = "7" + input;
            }
            String regex4 = "[/^7]" + "[0-9]{10}";

            if (input.matches(regex4)) {
                System.out.println(input);
            } else {
                System.out.println("Неверный формат номера");
            }


        }
    }

}
