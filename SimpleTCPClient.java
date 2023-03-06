import java.io.*;
import java.net.*;
import java.util.Scanner;

public class SimpleTCPClient {

    private static final int PORT = 4444;
    private static final String SERVER = "localhost";

    public static void main(String[] args) {

        try {

            var clientSocket = new Socket(SERVER, PORT);

            var outputStream = clientSocket.getOutputStream();
            var wrtr = new PrintWriter(outputStream, true);

            var scanner = new Scanner(System.in);

            System.out.print("> ");
            String message = scanner.nextLine();

            wrtr.println(message);

            clientSocket.close();
        } catch (UnknownHostException ex) {
            System.out.println("Unable to connect" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }

    }
}