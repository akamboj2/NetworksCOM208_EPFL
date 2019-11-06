import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer{
    /*private static Map<String, Integer> getOccurrences(String filename) {
        Map<String, Integer> occurrences = new TreeMap<String, Integer>();

        String delimiter_regexp = "[^a-zA-Z]+";
        FileInputStream fis = getFileReader(filename);


        Scanner fileScan = new Scanner(fis).useDelimiter(delimiter_regexp);

        String word;
        while(fileScan.hasNext()){
            word = fileScan.next();
            word = word.toLowerCase();

            Integer oldCount = occurrences.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }

        fileScan.close();
        return occurrences;
    }*/
    public static void main(String args[]){
        ServerSocket ss = new ServerSocket(6789);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        String str = din.readUTF();
        System.out.println("client:"+str);
    }

}