package ch.epfl.compnet.start;

import ch.epfl.compnet.reliabletransfer.ReliableClient;

public class StartClient {

    public static void main(String[] args) {
        String address = "localhost";
        int port = 9876;
        int timeout = 5000;     // 1 second timeout

        ReliableClient client = new ReliableClient(address, port, timeout);
        client.SendFile();
    }
}
