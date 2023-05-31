import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        boolean play = true;
        String ongeldig = "ongeldige invoer";

        Scanner scanner = new Scanner(System.in);

        Integer[] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul"};

        Translator translator = new Translator(alphabetic, numeric);

        translator.translate(1);

        while (play) {
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("x")) {
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Tpe een cijfer in van 0 t/m 9");
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number < 10) {
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                    break;
                } else {
                    System.out.println(ongeldig);
                    break;
                }
            } else {
                System.out.println(ongeldig);
                break;
            }
        }
    }
}