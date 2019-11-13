package ch.epfl.compnet.reliabletransfer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * This class represents represents a data packet of the TP6 reliable transfer protocol.
 */
public class MyDataPacket {
	static public int MAX_SIZE = 1024;

	private int seqNum;				// sequence number
	private byte[] data;			// byte array containing the data of the packet

	/**
	 * Creates a data packet with a given sequence number and data payload
	 */
	public MyDataPacket(int seqNum, byte[] data, int length) {
		//@TODO
	}

	/**
	 * Creates a data packet from a byte array representation (sent/received over the network).
	 */
	public MyDataPacket(byte[] content, int length) throws IOException {
		DataInputStream ds = new DataInputStream(new ByteArrayInputStream(content));
		
		// get the sequence number contained in the 4 first bytes
//		seqNum = ...;
		
		// get the data
//		data = ...;
//		ds....;
	}

	/**
	 * Returns the sequence number of the data packet.
	 */
	public int getSeqNum() {
		return seqNum;
	}

	/**
	 * Returns the payload of the data packet.
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * Returns the byte array representation (sent/received over the network) of the data packet.
	 */
	public byte[] toByteArray() {
		ByteArrayOutputStream bs = new ByteArrayOutputStream(4 + data.length);
		DataOutputStream ds = new DataOutputStream(bs);
//		try {
			// Send seqNum
			//@TODO
			
			// Send data
			//@TODO
//		} catch (IOException e) {
//			// Should not happen
//		}
		
		return bs.toByteArray();
	}

	/**
	 * Get a string representation of the object.
	 */
	public String toString() {
		String msg = "[SeqNum:" + seqNum + ", Size:" + data.length + "]";
		return msg;
	}
}
