package chapter16_SerializationAndWritingToFiles.flashcards;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class QuizCardPlayer {


    private ArrayList<QuizCard> cardList;
    private int currentCardIndex;
    private QuizCard currentCard;
    private JTextArea display;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;

    public void go() {
// build and display gui

        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();
        Font bigFont = new Font("sanserif", Font.BOLD, 24);

        display = new JTextArea(10, 20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane scroller = new JScrollPane(display);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mainPanel.add(scroller);

        nextButton = new JButton("Show Question");
        nextButton.addActionListener(e -> nextCard());
        mainPanel.add(nextButton);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(e -> open());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

    private void nextCard() {
        // if this is a question, show the answer, otherwise show
        // next question set a flag for whether we’re viewing a
        // question or answer

        if (isShowAnswer) {
            // show the answer because they’ve seen the question
            display.setText(currentCard.getAnswer());
            nextButton.setText("Next Card");
            isShowAnswer = false;
        } else {
            // show the next question
            if (currentCardIndex < cardList.size()) {
                showNextCard();
            } else {
                // there are no more cards!
                display.setText("That was last card");
                nextButton.setEnabled(false);
            }
        }
    }

    private void open() {
        JFileChooser fileOpen = new JFileChooser();
        fileOpen.showOpenDialog(frame);
        loadFile(fileOpen.getSelectedFile());
// bring up a file dialog box
// let the user navigate to and choose a card set to open
    }

    private void loadFile(File file) {
        // must build an ArrayList of cards, by reading them from
        // a text file called from the OpenMenuListener event handler,
        // reads the file one line at a time and tells the makeCard()
        // method to make a new card out of the line (one line in the
        // file holds both the question and answer, separated by a “/”)

        cardList = new ArrayList<>();
        currentCardIndex = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                makeCard(line);

            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Couldn't write the cardList out: " + e.getMessage());
        }
    }

    private void makeCard(String lineToParse) {
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("made a card");
    }

    private void showNextCard() {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }
}