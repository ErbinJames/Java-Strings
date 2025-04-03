import java.util.Scanner;

public class BasicString {
    public static void main (String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        //to uppercase
        System.out.println("Uppercase name: " + fullName.toUpperCase());

        //compute the total characters
        System.out.println("Total Characters (excluding spaces): " + fullName.replace(" ","").length());

        //get the initials
        String initials = fullName.substring(0,1) + ".";
        
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) == ' ' && i + 1 < fullName.length()) {
                initials += fullName.substring(i + 1, i + 2) + "."; 
            }
        }
        //display the initials
        System.out.println("Initials: " + initials.toUpperCase());
        
        //close the scanner
        scanner.close();
    }
}