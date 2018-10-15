import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        RomanNumerals translator = new RomanNumerals();

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        translator.convertToRoman(i);

    }
}
