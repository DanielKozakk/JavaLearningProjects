package archive.SecondVersion;

import java.util.ArrayList;

public class Startup {
    ArrayList<String> locationCells;
    String name;
    int numOfHits;
    public String checkYourself(String userInput){

        String result = "miss";


        int index = locationCells.indexOf(userInput);
        if (index >= 0 ){
            locationCells.remove(index);
            if(locationCells.isEmpty()){
                result = "kill";
            } else{
                result = "hit";
            }
        }

        System.out.println(result);
       return  result;

    }
    public Startup setLocationCells(ArrayList<String> loc){
        locationCells = loc;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
