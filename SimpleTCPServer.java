import java.io.*;
import java.net.*;

public class SimpleTCPServer {

    private static final int PORT = 8888;

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(PORT);

            while (true) {
                Socket sock = serverSocket.accept();

                InputStream inp = sock.getInputStream();

                BufferedReader rdr = new BufferedReader(new InputStreamReader((inp)));

                String buff = rdr.readLine();

                System.out.println("Client message: " + buff);

                sock.close();
            }
        }
        catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
}