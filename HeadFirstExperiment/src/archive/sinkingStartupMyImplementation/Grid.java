package archive.sinkingStartupMyImplementation;

import java.util.*;

public class Grid {

    private int maxXCoordinateNumber = 6;
    private char[] yCoordinatesArray = {'A', 'B','C','D','E','F','G',};
    private HashMap<String, Field> fieldList = new HashMap<>();

    private Startup[] startups = {new Startup("firstStartup"), new Startup("second"), new Startup("third")};

    private int maxStartups = startups.length;
    private int currentStartup = 0;
    public Grid() {

        for (int i = 0; i <= maxXCoordinateNumber; i++){

            for (char ch: yCoordinatesArray) {
                Field field = new Field(ch, i);
                fieldList.put(ch + Integer.toString(i), field);
            }
        }

        while (currentStartup < maxStartups){

            Field randomField = getRandomField();
            randomField.setStartup(startups[currentStartup]);
            startups[currentStartup].setStartupField(randomField);
            currentStartup ++;
        }

    }

    public Startup[] getStartups() {
        return startups;
    }

    private Field getRandomField (){

        Random generator = new Random();

        Field[] values = fieldList.values().toArray(new Field[0]);

        return values[generator.nextInt(values.length)];
    }


    class Field{
        private char yCoordinate;
        private int xCoordinate;

        private boolean hasStartup = false;
        private Startup startup = null;
        public Field(char yCoordinate, int xCoordinate) {
            this.yCoordinate = yCoordinate;
            this.xCoordinate = xCoordinate;
        }

        public void setStartup(Startup startup) {

            hasStartup = true;
            this.startup = startup;
        }

       public char getYCoordinate() {
            return yCoordinate;
        }

        public int getXCoordinate() {
            return xCoordinate;
        }


    }

}
