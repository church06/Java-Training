import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient_self {

    public static void main(String[] args) throws Exception {

        System.out.println("Running...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket datagramSocket = new DatagramSocket();

        InetAddress address = InetAddress.getByName("SDesolator");

        byte[] data_send;
        byte[] data_receive = new byte[1024];

        String sentence = reader.readLine();
        data_send = sentence.getBytes();

        DatagramPacket packet_send = new DatagramPacket(data_send, data_send.length, address, 8888);
        datagramSocket.send(packet_send);

        DatagramPacket packet_receive = new DatagramPacket(data_receive, data_receive.length);
        datagramSocket.receive(packet_receive);

        String sentence_mod = new String(packet_receive.getData());

        System.out.println("From Server: [ " + sentence_mod + " ].");
        datagramSocket.close();

    }
}
