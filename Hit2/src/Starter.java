import java.util.ArrayList;

public class Starter {
    private int[] locationCells;
    private ArrayList<Integer> locationList = new ArrayList<>();
    private int body;

    
    public ArrayList<Integer> setList(){
        body = (int) (Math.random() * 5);
        locationList.add(body);
        locationList.add(body+1);
        locationList.add(body+2);
        return locationList;
    }
    public ArrayList<Integer> getList(){
        return locationList;
    }

    //check if locationList contains guess, print hit if yes
    //then consolidate the locationList by removing the hit number
    public String checkHit(int guess)
    {
        String result = "miss";
        if (locationList.contains(guess))
        {
            result = "hit";
            locationList.remove(Integer.valueOf(guess));
        }
        return result;
    }
        //if len of locationCells < 1, then win
        public boolean win()
        {
            boolean win = locationList.isEmpty();
            return win;
        }

}
