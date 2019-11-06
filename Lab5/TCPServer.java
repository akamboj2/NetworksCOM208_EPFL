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
    public static void main(String args[]) throws Exception{
        ServerSocket ss = new ServerSocket(6789);
        Socket s = ss.accept();

        //note: socket waits at s.getInputStream() call until it recieves a stream but not at s.getOutputStream
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream (s.getOutputStream());

        //when actually doing it do something like readbyte, instead of reading the whole stream
        //bc you want it to be continuous
        String str = din.readUTF();
        System.out.println("client: "+str);
        dout.writeUTF("Howdy Client ");

        System.out.println(din.readUTF());
        din.close();
        s.close();
        ss.close();
    }

}

/* recall to run java
* compile: javac file.java
* execute: java file
*/