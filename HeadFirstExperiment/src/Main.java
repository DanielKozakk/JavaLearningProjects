import chapter16_SerializationAndWritingToFiles.flashcards.QuizCardBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Main<T> {

    public static void main(String[] args) {

        new QuizCardBuilder().go();

    }
}




