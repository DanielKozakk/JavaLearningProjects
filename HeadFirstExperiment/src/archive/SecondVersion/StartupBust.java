package archive.SecondVersion;

import java.util.ArrayList;

public class StartupBust {


    GameHelper gameHelper;
    ArrayList<Startup> startups = new ArrayList<>();
    int numberOfGuesses = 0;

    public StartupBust(GameHelper gameHelper) {
        this.gameHelper = gameHelper;
    }


    public void setUpGame() {
        Startup firstStartup = new Startup();
        Startup secondStartup = new Startup();
        Startup thirdStartup = new Startup();

        firstStartup.setName("First");
        secondStartup.setName("Second ");
        thirdStartup.setName("Third");

        startups.add(firstStartup);
        startups.add(secondStartup);
        startups.add(thirdStartup);

        for (Startup startup : startups
        ) {

            startup.setLocationCells(gameHelper.placeStartup(3));

        }
    }


    public void startPlaying() {

        while (!startups.isEmpty()) {
            String userGuess = gameHelper.getUserInput("enter your guess");

            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {

        numberOfGuesses++;
        String result = "miss";

        for (Startup startup : startups
        ) {
            result = startup.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
               startups.remove(startup) ;
               break;
            }
        }

        System.out.println(result);

    }

    public void finishGame() {
        System.out.println("Game over");
        if(numberOfGuesses < 10 ){

            System.out.println("Dobrze!");
        }else {
           System.out.println("Chujowo ci poszło, ale wygrałeś");
        }
    }

    public static void main(String[] args) {

        StartupBust game = new StartupBust(new GameHelper());
        game.setUpGame();
        game.startPlaying();

    }
}
