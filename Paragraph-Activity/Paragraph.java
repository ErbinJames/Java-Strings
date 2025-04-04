import java.util.Scanner;

public class Paragraph {
    public static void main (String[] args) {
        //create scanner object
        Scanner scanner = new Scanner(System.in);

        //input 
        String paragraph = getInput(scanner);

        //processing 
        String cleanedParagraph = cleanParagraph(paragraph);
        String modifiedParagraph = replaceWords(cleanedParagraph);
        int wordCount = countWords(cleanedParagraph);

        //display the output
        System.out.println("Word Count: " + wordCount);
        System.out.println("Modified Paragraph: " + modifiedParagraph);
    }

    //get the user input
    public static String getInput(Scanner scanner) {
        System.out.print("Enter a paragraph: ");
        return scanner.nextLine();
    }

    //trim and remove extra spaces
    public static String cleanParagraph(String text) {
        text = text.trim();
        return text.replaceAll("\\s+", " ");
    }

    //replace method for java with python
    public static String replaceWords(String text) {
        return text.replaceAll("(?i)java", "Python");
    }

    //count words method
    public static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.split(" ");
        return words.length;
    }
}