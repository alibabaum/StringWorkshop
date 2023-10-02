// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Enter your starting string:");
        String firstString = inScanner.next();

        System.out.println("Pick an option:");
        System.out.println("1. Add content");
        System.out.println("2. Check if string contains");
        //uses substrings to check if it contains a set of letters or a letter
        System.out.println("3. Output length");
        System.out.println("4. Output substring after prefix");
        System.out.println("5. Output substring before suffix");
        System.out.println("6. Output substring between prefix and suffix");
        System.out.println("7. Exit");
        int option = inScanner.nextInt();

        while (option <= 7) {
            if (option == 1) {
                System.out.println("Your new string is: " + addContent(firstString));
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 2) {
                substringChecker(firstString);
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 3) {
                System.out.println("Your string length is: " + lengthChecker(firstString));
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 4) {
                afterPrefix2(firstString);
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 5) {
                beforeSuffix(firstString);
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 6) {
                betweenPrefixSuffix(firstString);
                System.out.println(" ");
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            } else if (option == 7){
                System.out.println("Bye.");
                option = 8;
            } else {
                System.out.println("Please choose another option: ");
                option = inScanner.nextInt();
            }
        }

    }
        public static String addContent (String firstString) {
            Scanner inScanner = new Scanner(System.in);
            System.out.println("What would you like to add?");
            String secondString = inScanner.next();
            return firstString + " " + secondString;
        }

        public static void substringChecker (String firstString){
            Scanner inScanner = new Scanner(System.in);
            System.out.println("What substring do you want to check for?");
            String checkString = inScanner.next();
            boolean bool = firstString.contains(checkString);
            if (bool) {
                System.out.println("Your initial string does contain your indicated substring.");
            } else {
                System.out.println("Your initial string does not contain your indicated substring.");
            }

        }
        public static int lengthChecker (String firstString){
          int length = firstString.length();
          char last = firstString.charAt(length - 1);
          return length;
        }
    // The below method is one I made because I misread the assignment. I'm keeping it here for future reference since
    // I struggle with for loops and i feel like it will be useful at some point.
        public static void afterPrefix (String firstString){
            int length = firstString.length();
            //i is function as the limit in this case. print out before it hits three.
            for (int i = 3; i < length; i++){
                char prefix = firstString.charAt(i);
                System.out.print(prefix);
            }
        }
        public static void afterPrefix2 (String firstString){
            Scanner inScanner = new Scanner(System.in);
            System.out.println("Prefix?");
            String prefix = inScanner.next();
            int index = firstString.indexOf(prefix);

            for (int i = index + 1; i < firstString.length(); i++){
                char prefixChar = firstString.charAt(i);
                System.out.print(prefixChar);
            }
            System.out.println(" ");
        }
    public static void beforeSuffix (String firstString){
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Suffix?");
        String suffix = inScanner.next();
        int index = firstString.indexOf(suffix);
        for (int i = 0; i < index; i++){
            char suffixChar = firstString.charAt(i);
            System.out.print(suffixChar);
        }
        System.out.println(" ");
    }

    public static void betweenPrefixSuffix (String firstString){
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Prefix?");
        String prefix = inScanner.next();
        System.out.println("Suffix?");
        String suffix = inScanner.next();
        int index1 = firstString.indexOf(prefix);
        int index2 = firstString.indexOf(suffix);
        for (int i = index1 + 1; i <= index2 - 1; i++){
            char suffixChar = firstString.charAt(i);
            System.out.print(suffixChar);
        }
    }
}