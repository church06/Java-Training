import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Controller_Ass_2 {

    Socket socket = new Socket("localhost", 44444);
    ClientConnection client;

    String protocol;
    ArrayList<ArrayList<String>> data;


    public Controller_Ass_2() throws IOException {
        new Thread(() -> {
            client = new ClientConnection(socket, new JabberDatabase());
            client.run();

        }).start();
    }

    public void login(String username) {
        client.login(username);
    }

    public void register(String username) {
        client.register(username);
    }

    public String server_respond() throws InterruptedException {

        Thread.sleep(50);
        protocol = client.protocol;
        data = client.data;

        return protocol;
    }

    public ArrayList<ArrayList<String>> data_respond() {
        return data;
    }

    public void signOut() {

        try {
            client.signOut();
            client.ois.close();
            client.oos.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void timeLine() {
        client.getTimeline();
    }

    public void addLike(String jab) {
        client.like(jab);

    }

    public void notFollowedUser() {
        client.notFollowed();
    }

    public void followButton(String username) {
        client.FollowUser(username);
    }

    public void postTo(String jab_txt) {
        client.Post(jab_txt);
    }
}
