import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer_self {

    public static void main(String[] args) throws IOException {
        System.out.println("Running...");
        DatagramSocket socket_server = new DatagramSocket(8888);

        byte[] data_re = new byte[1024];
        byte[] data_se;

        while (true) {
            DatagramPacket packet_re = new DatagramPacket(data_re, data_re.length);
            socket_server.receive(packet_re);

            String result = new String(packet_re.getData());


            try {

                double r = Double.parseDouble(result);
                double area = Math.pow(r, 2);
                data_se = (area + " PI").getBytes();

            } catch (NumberFormatException e) {
                data_se = "Invalid input...".getBytes();
            }

            InetAddress address = packet_re.getAddress();
            int port = packet_re.getPort();

            DatagramPacket packet_se = new DatagramPacket(data_se, data_se.length, address, port);
            socket_server.send(packet_se);
            System.out.println("From Client: [ " + result + " ].\n");
        }


    }
}
