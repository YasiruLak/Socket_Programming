import java.io.IOException;
import java.net.ServerSocket;

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
    }
}
