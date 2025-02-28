import java.time.LocalDateTime;
import java.util.Scanner;

public class Fish {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private String healthStatus;

    public Fish(String name) {
        this.name = name;
        this.healthStatus = "Healthy";
    }

    public String getName() {
        return name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public void updateHealthStatus(Scanner scanner) {
        System.out.println("The status of the fish is: " + healthStatus);
        System.out.println("Would you like to update the status right know Yes/No \n");
        String responds = scanner.nextLine();
        if (responds.equalsIgnoreCase("Yes \n")) {
            String update = scanner.nextLine();
            System.out.println("Update status of the fish... " + update);


        } else if (responds.equalsIgnoreCase("No\n")) {
            System.out.println(getHealthStatus());
        } else System.out.println("Invalid answer!!!\n");
        {

        }

    }

    public String toString() {
        return "Fish ( name = " + name + ") healthStatus = " + healthStatus + ")";
    }




        System.out.println(Fish.getName()+" is "+Fish.getHealthStatus());

        fish1.updateHealthStatus();
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The time right now: "+now +" \n ");

        System.out.println(fish1.getName()+" is now "+fish1.getHealthStatus());



        System.out.println(fish2.getName()+" is "+fish2.getHealthStatus());

        fish2.updateHealthStatus();
        System.out.println(fish2.getName()+" is now "+fish2.getHealthStatus());

        scanner.close();
}

