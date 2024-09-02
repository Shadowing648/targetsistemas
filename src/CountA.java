import java.util.Scanner;

public class CountA{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String userInput = inputScanner.nextLine();

        inputScanner.close();

        int occurrences = count(userInput);

        if (occurrences > 0) {
            System.out.println("A letra 'a' (seja maiúscula ou minúscula) aparece " + occurrences + " vezes na string.");
        } else {
            System.out.println("Não há letras 'a' (nem maiúsculas, nem minúsculas) na string.");
        }
    }

    public static int count(String text) {
        int numberOfAs = 0;
        for (char character : text.toCharArray()) {
            if (character == 'a' || character == 'A') {
                numberOfAs++;
            }
        }
        return numberOfAs;
    }
}
