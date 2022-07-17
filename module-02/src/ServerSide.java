import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Yasiru Dahanayaka
 * @name : Socket
 * @date : 7/15/2022
 * @month : 07
 * @year : 2022
 * @since : 0.1.0
 **/
public class ServerSide {
    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server is up and running on port : "+PORT);
        Socket socket = serverSocket.accept();
        System.out.println(socket.getPort());

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String clientData = bufferedReader.readLine();

        System.out.println("Client says, "+clientData);
    }
}
