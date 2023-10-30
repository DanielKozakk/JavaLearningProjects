package archive.FirstVersion.test;

import archive.FirstVersion.SimpleStartup;

public class SimpleStartupTest {
    public static void main (String[] args){
        SimpleStartup simpleStartup = new SimpleStartup();
        int [] locations = {2,3,4};
        simpleStartup.setLocationCells(locations);

        int userGuess =2;
        String result = simpleStartup.checkYourself(userGuess);
        String testResult = "failed";

        if(result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);

    }
}
