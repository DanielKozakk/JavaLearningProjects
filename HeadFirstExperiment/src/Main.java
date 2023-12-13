import chapter16_SerializationAndWritingToFiles.flashcards.QuizCard;
import chapter16_SerializationAndWritingToFiles.flashcards.QuizCardBuilder;
import chapter17_network.ConnectionToNetwork;

import java.io.*;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.*;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main<T> {

    public static void main(String[] args) throws IOException {

        Main main = new Main();



    }

    private void multi (){
       Thread thread = new Thread();
        thread.start();
    }
    private void createServerChannel() throws IOException {

        ServerSocketChannel ssc = ServerSocketChannel.open();

        InetAddress inetAddress = InetAddress.getByName("192.168.1.81") ;
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, 5000);
        ssc.bind(inetSocketAddress);

        System.out.println(ssc.socket().getInetAddress());
        System.out.println(ssc.socket().getLocalSocketAddress());



        while(ssc.isOpen()){
            SocketChannel clientChannel = ssc.accept();
            System.out.println("acceted");
            BufferedReader bufferedReader = new BufferedReader(Channels.newReader(clientChannel, StandardCharsets.UTF_8));
            System.out.println(bufferedReader.readLine());

            Writer writer = Channels.newWriter(clientChannel, StandardCharsets.UTF_8);
            PrintWriter pw = new PrintWriter(writer);
            pw.println("chuj ci w dupe i vice versa");
            pw.close();
        }

    }



}





