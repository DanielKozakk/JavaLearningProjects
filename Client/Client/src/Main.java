import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.createClientChannel();
    }


    private void createClientChannel () throws IOException {
        SocketChannel sc = SocketChannel.open(new InetSocketAddress("192.168.1.81", 5000));
        Writer writer = Channels.newWriter(sc, StandardCharsets.UTF_8);

        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println("hachujchujcha");
//        printWriter.println("string");
        printWriter.close();
    }
}