package ch.epfl.compnet.reliabletransfer;

import java.io.*;
import java.net.*;

/**
 * This class implements a receiver of the TP6 reliable transfer protocol
 */
public class ReliableServer {

	private DatagramSocket socket;
	private int nextPacketToDeliver;

	public ReliableServer(int port) {
		// Open the UDP socket.
		//@TODO
    }
    public void listen() {
		try {
			while (true) {
                // Allocate enough space for the biggest possible packet
				//@TODO

                // Receive the new packet
				//@TODO

				// If we expect this packet, send data to upper layer.
                // In this case, we simply print the bytes
				//@TODO

				// ACK packet if it is the one we have been expecting.
                // Otherwise, do nothing (we drop the packet silently)
				//@TODO
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
