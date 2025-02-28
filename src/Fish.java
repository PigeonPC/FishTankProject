import java.time.LocalDateTime;
import java.util.Scanner;

public class Fish {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String healthStatus;

    public Fish(String name){
        this.name = name;
        this.healthStatus = "Healthy";
    }

    public String getName(){
        return name;
    }

    public String getHealthStatus(){
        return healthStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthStatus(String healthStatus){
        this.healthStatus = healthStatus;
    }

    public void updateHealthStatus() {
        System.out.println("What is the status of the fish right now? ");
        if (healthStatus.equals("Healthy")) {
            healthStatus = "Healthy";

        } else if (healthStatus.equals("Sick")) {
            healthStatus = "Dead";
        }
    }
    public String toString() {
        return "Fish ( name = " + name + ") healthStatus = " + healthStatus + ")";
    }

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fish fish1 = new Fish("Wogglie");
        Fish fish2 = new Fish("Swimmie");

        System.out.println("Welcome to the fish app! \n  choose which fish you would like to see");
        System.out.println("fish1 or fish2 \n ");
        String choice = scanner.nextLine();

        if(choice.equalsIgnoreCase(fish1.getName())){
            System.out.println(fish1);
        } else if (choice.equalsIgnoreCase(fish2.getName())) {
            System.out.println(fish2);
        } else {
            System.out.println("Invalid choice!");
        }


        System.out.println(fish1.getName() + " is " + fish1.getHealthStatus());

        fish1.updateHealthStatus();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The time right now: " + now + " \n ");

        System.out.println(fish1.getName() + " is now " + fish1.getHealthStatus());



        System.out.println(fish2.getName() + " is " + fish2.getHealthStatus());

        fish2.updateHealthStatus();
        System.out.println(fish2.getName() + " is now " + fish2.getHealthStatus());

        scanner.close();
    }*/

}
