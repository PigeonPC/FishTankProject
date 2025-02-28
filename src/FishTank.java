import java.time.LocalDateTime;
import java.util.Scanner;

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

    public String getLastWaterChange(){
        return lastWaterChange;
    }
    public void setLastWaterChange(){
        this.lastWaterChange = lastWaterChange;
    }

    public String getWaterQuality(){
        return waterQuality;
    }
    public void setWaterQuality(){
        this.waterQuality = waterQuality;
    }

    //Change water method
    public void changeWater(){

        //CHANGE LAST WATER CHANGE TO CURRENT TIME
        LocalDateTime localDate = LocalDateTime.now();
        //Sætter lastWaterChange til at være localDate i String form:
        this.lastWaterChange = localDate.toString();
        //System.out.println(lastWaterChange);

        //REMARK ABOUT WATER CHANGE
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Remark about water change (max 60 characters): ");
        String userRemark = myScanner.nextLine();
        //System.out.println(userRemark);

        //SET WATER QUALITY
        //System.out.println(waterQuality);
        System.out.println("Set water quality before water change:\n" +
                "Type 1 for perfect\n" +
                "Type 2 for good\n" +
                "Type 3 for okay\n" +
                "Type 4 for bad\n");

        String userWaterQuality = myScanner.nextLine();
        if (userWaterQuality.equals("1")){
            this.waterQuality = "Perfect";
        } if (userWaterQuality.equals("2")){
            this.waterQuality = "Good";
        } if (userWaterQuality.equals("3")){
            this.waterQuality = "Okay";
        } if (userWaterQuality.equals("4")){
            this.waterQuality = "Bad";
        }
        //System.out.println(waterQuality);
    }

    public String toString() {
        //En ligegyldig metode... bliver gjort i changeWater
        return null;
    }

    /**
     * public static void main(String [] args){
     *         FishTank tank = new FishTank("a", "a");
     *         tank.changeWater();
     *     }
     */

}
