import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public void run() throws IOException {
        int port = 8080;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(10000);
        while (true) {
            try {
                System.out.println("Server Is listening on port " + port);
                Socket acceptConnection = socket.accept();
                System.out.println("Connection accepted from " + acceptConnection.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acceptConnection.getOutputStream());
                BufferedReader fromClient = new BufferedReader(
                        new InputStreamReader(acceptConnection.getInputStream()));
                String clientMessage = fromClient.readLine();
                System.out.println("Message from client: " + clientMessage);

                toClient.println("Hello Client from server");

                toClient.close();
                fromClient.close();
                acceptConnection.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}