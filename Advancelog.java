import java.io.*;
import java.util.*;

public class Advancelog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for file paths
        System.out.print("Enter input file path: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output file path: ");
        String outputFile = scanner.nextLine();

        System.out.println("\nMenu:");
        System.out.println("1. Remove duplicate lines");
        System.out.println("2. Remove duplicate words in each line");
        System.out.println("3. Remove a particular line");
        System.out.println("4. Remove last two lines");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            List<String> lines = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            switch (choice) {
                case 1: // Remove duplicate lines
                    Set<String> uniqueLines = new LinkedHashSet<>(lines);
                    for (String unique : uniqueLines) {
                        writer.write(unique);
                        writer.newLine();
                    }
                    System.out.println("Duplicate lines removed.");
                    break;

                case 2: // Remove duplicate words in each line
                    for (String l : lines) {
                        String[] words = l.split("\\s+");
                        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
                        writer.write(String.join(" ", uniqueWords));
                        writer.newLine();
                    }
                    System.out.println("Duplicate words removed in each line.");
                    break;

                case 3: // Remove a particular line
                    System.out.print("Enter the exact line you want to remove: ");
                    String target = scanner.nextLine();
                    for (String l : lines) {
                        if (!l.equals(target)) {
                            writer.write(l);
                            writer.newLine();
                        }
                    }
                    System.out.println("Specified line removed.");
                    break;

                case 4: // Remove last two lines
                    int limit = Math.max(0, lines.size() - 2);
                    for (int i = 0; i < limit; i++) {
                        writer.write(lines.get(i));
                        writer.newLine();
                    }
                    System.out.println("Last two lines removed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
