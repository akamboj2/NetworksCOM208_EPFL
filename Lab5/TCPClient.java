import java.io.*;
import java.net.*;
import java.util.*;

public class TCPClient{
    /*
    private static FileInputStream getFileReader(String filename) {
        FileInputStream fis = null;
        boolean fileExists = true;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException e) {
            fileExists = false;
        }

        return fis;
    }

    private static int getFileLength(String filename) {
        File file = new File(filename);
        int length = (int) file.length();

        return length;
    }

    private static void printMap(Map<String, Integer> occurrences) {
        int num_values = occurrences.size();

        System.out.println("There are " + num_values + " unique words in the document \n");

        for (String key: occurrences.keySet()) {
            String word = key.toString();
            String times = occurrences.get(key).toString();

            System.out.println(word + ": " + times);
        }
    }

    private static void printFileStats(String filename) {
        int length = getFileLength(filename);
        Map<String, Integer> occurrences = getOccurrences(filename);

        System.out.println("The file has length: " + length + " bytes");
        printMap(occurrences);
    }
    */
    public static void main(String args[]){
        Socket s = new Socket("localhost",6789);
        DataOutputStream d = new DataOutputStream(s.getOutputStream());
        d.writeUTF("Hello");


    }
}