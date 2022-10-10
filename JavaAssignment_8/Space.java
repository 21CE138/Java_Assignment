package JavaAssignment_8;
import java.io.*;


public class Space {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Example\\Byte.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            int wordCount = 0;
            int characterCount = 0;
            int paraCount = 0;
            int whiteSpaceCount = 0;
            int sentenceCount = 0;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals("")) {
                    paraCount += 1;
                } else {
                    characterCount += line.length();
                    String words[] = line.split("\\s+");
                    wordCount += words.length;
                    whiteSpaceCount += wordCount - 1;
                    String sentence[] = line.split("[!?.:]+");
                    sentenceCount += sentence.length;
                }
            }
            if (sentenceCount >= 1) {
                paraCount++;
            }
            System.out.println("Total word count = " + wordCount);
            System.out.println("Total number of sentences = " + sentenceCount);
            System.out.println("Total number of characters = " + characterCount);
            System.out.println("Number of paragraphs = " + paraCount);
            System.out.println("Total number of whitespaces = " + whiteSpaceCount);
        }
    }
}
