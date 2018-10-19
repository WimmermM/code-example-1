import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EndsWithS {
    /**
     * Create a method called `endsWithS` that takes a filename as a string
     * and returns the number of the words, that ends with 's'.
     * <p>
     * Example cases:
     * <p>
     * the correct output for the 'base.txt' is: 26
     * hint: Keep in mind that there may punctuation marks at the end of the words
     */

    public static void main(String[] args) {
        System.out.println(endsWithS("base.txt"));

    }


    // function takes string parameter and return number of words ending with s
    //function is reading from attached file and creating new list
    //new list is converted to string array and then split to filter out all non words characters
    public static int endsWithS(String filename) {
        int result = 0;
        List<String> newList = new ArrayList<>();
        try {

            Path filePath = Paths.get(filename);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                String[] words = line.replaceAll("\\W", " ").split(" ", newList.size());
                for (String string : words) {
                    if (string.toLowerCase().endsWith("s")) {
                        result++;
                    }

                }
            }


        } catch (Exception e) {
            System.out.println("Unable to read file: my-file.txt");
        }


        return result;
    }

}
