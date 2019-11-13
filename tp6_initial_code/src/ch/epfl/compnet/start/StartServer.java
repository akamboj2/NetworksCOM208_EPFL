package ch.epfl.compnet.start;

import ch.epfl.compnet.reliabletransfer.ReliableServer;

public class StartServer {
	public static void main(String[] args) {
        int port = 9876;

        ReliableServer server = new ReliableServer(port);
        server.listen();
	}
}
