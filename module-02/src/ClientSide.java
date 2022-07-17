import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : Yasiru Dahanayaka
 * @name : Socket
 * @date : 7/17/2022
 * @month : 07
 * @year : 2022
 * @since : 0.1.0
 **/
public class ClientSide {

    public static void main(String[] args) throws IOException {
        final int PORT = 8000;
        Socket socket = new Socket("localhost", PORT);


    }
}
