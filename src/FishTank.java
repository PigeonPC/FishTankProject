import java.time.LocalDateTime;

public class FishTank {
    //Olga og Silke

    //Attributes
    private String lastWaterChange;
    private String waterQuality;

    //Constructor
    public FishTank(String lastWaterChange, String waterQuality){
        this.lastWaterChange = lastWaterChange;
        this.waterQuality = waterQuality;
    }







    //Change water method
    public String changeWater(){

        LocalDateTime localDate = LocalDateTime.now();

        //Sætter lastWaterChange til at være localDate i String form:
        this.lastWaterChange = localDate.toString();

        return lastWaterChange;
    }


    public String toString() {
        return .........
    }
}
