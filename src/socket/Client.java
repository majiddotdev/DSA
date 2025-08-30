package socket;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket sc = new Socket("localhost", 8080);

    }
}
