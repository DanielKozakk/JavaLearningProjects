package archive.sinkingStartupMyImplementation;

public class Startup {

    private String startupName;

    private Grid.Field startupField;

    public Startup(String startupName) {
        this.startupName = startupName;
    }

    public void setStartupField(Grid.Field startupField) {
        this.startupField = startupField;
    }

    public String getStartupCoordinates (){
        return startupField.getYCoordinate() + Integer.toString(startupField.getXCoordinate());
    }
}
