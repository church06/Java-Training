public class ReloadSQL {

    public static void main(String[] args) {
        JabberServer jabber = new JabberServer();
        JabberServer.connectToDatabase();
        jabber.resetDatabase();
    }
}
