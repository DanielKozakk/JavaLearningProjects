package chapter17_network.chatv2;


import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.*;
import java.nio.channels.*;
import java.util.Set;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;
import static java.nio.charset.StandardCharsets.UTF_8;


public class SimpleChatClientB {
    private JTextArea incoming;
    private JTextField outgoing;
    private BufferedReader reader;
    private PrintWriter writer;


    public void go() {
        setUpNetworking();

        JScrollPane scroller = createScrollableTextArea();


        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(e -> sendMessage());

        JPanel mainPanel = new JPanel();
        mainPanel.add(scroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);


        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(new IncomingReader());

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 350);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    private JScrollPane createScrollableTextArea() {
        incoming = new JTextArea(15, 30);

        incoming.setEditable(false);
        JScrollPane scroller = new JScrollPane(incoming);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        return scroller;
    }

    private void setUpNetworking() {

        try {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
            SocketChannel socketChannel = SocketChannel.open(serverAddress);
            reader = new BufferedReader(Channels.newReader(socketChannel, UTF_8));
            writer = new PrintWriter(Channels.newWriter(socketChannel, UTF_8));
            System.out.println("Networking established.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void sendMessage() {
        writer.println(outgoing.getText());
        writer.flush();
        outgoing.setText("");
        outgoing.requestFocus();
    }
    public class IncomingReader implements Runnable {
        public void run() {
            String message;

            try {
                while ((message = readLine(reader)) != null) {

                    System.out.println("read " + message);
                    incoming.append(message + "\n");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println("działa koniec funkcji");
        }

        public String readLine(BufferedReader reader) throws IOException {
            String message = reader.readLine();
            System.out.println("inside function: " + message);
            return message;
        }
    }



    public static void main(String[] args) throws InterruptedException {
        new SimpleChatClientB().go();

//        while(true){
//            Set<Thread> threads = Thread.getAllStackTraces().keySet();
//            System.out.printf("%-15s \t %-15s \t %-15s \t %s\n", "Name", "State", "Priority", "isDaemon");
//            for (Thread t : threads) {
//                System.out.printf("%-15s \t %-15s \t %-15d \t %s\n", t.getName(), t.getState(), t.getPriority(), t.isDaemon());
//            }
//            sleep(10000);
//        }
    }

}
