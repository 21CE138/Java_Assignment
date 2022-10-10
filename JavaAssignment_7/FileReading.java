package JavaAssignment_7;
import java.io.*;

public class FileReading {
        File readInFile = new File("E:\\Example\\Byte.txt");
        int readFile(String line, File file) {
            if (readInFile.exists()) {
                return line.length();
            } else {
                return -1;
            }
        }
        public static void main(String[] args) throws IOException {
            String str = "Hello " + "My Name is Yuvrajsinh.";
            FileWriter writeInFile = new FileWriter("E:\\Example\\Byte.txt");
            for (int i = 0; i < str.length(); i++)
                writeInFile.write(str.charAt(i));
            System.out.println("Writing successful");
            writeInFile.close();
            int ch;
            FileReader readInFile = new FileReader("E:\\Example\\Byte.txt");
            System.out.println("File created SuccessFully");
            System.out.println("File is found");
            while ((ch = readInFile.read()) != -1)
                System.out.print((char) ch);
            readInFile.close();
        }
}
