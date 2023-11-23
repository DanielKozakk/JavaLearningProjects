package chapter17_network;

import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ConnectionToNetwork {

    public void connect(){
        InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
        try {
            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
