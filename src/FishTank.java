import java.time.LocalDateTime;

public class FishTank {
    //Olga og Silke
    public static final String[] WATERQUALITY = {
            null, "perfect", "good", "okay", "bad"};

    //Attributes
    private String lastWaterChange;
    private String waterQuality;

    //Constructor
    public FishTank(String lastWaterChange, String waterQuality){
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }

    //Change water method
    public void changeWater(){
        LocalDateTime localDate = LocalDateTime.now();
        //Sætter lastWaterChange til at være localDate i String form:
        this.lastWaterChange = localDate.toString();
        System.out.println(lastWaterChange);
    }

    public String toString() {
        return null;
    }

    /**
     * public static void main(String [] args){
     *         FishTank tank = new FishTank("a", "a");
     *         tank.changeWater();
     *     }
     */
}
