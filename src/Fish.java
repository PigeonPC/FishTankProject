public class Fish {
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

    public void setHealthStatus(){
        this.healthStatus = healthStatus;
    }

    public void updateHealthStatus() {

        if (healthStatus.equals("Healthy")) {
            healthStatus = "Healhty";

        } else if (healthStatus.equals("Sick")) {
            healthStatus = "Dead";
        }
    }

    public static void main(String[] args) {
        Fish fish1 = new Fish("Wogglie");
        Fish fish2 = new Fish("Swimmie");

        System.out.println(fish1.getName() + " is " + fish1.getHealthStatus());

        fish1.updateHealthStatus();
        System.out.println(fish1.getName() + " is now " + fish1.getHealthStatus());



        System.out.println(fish2.getName() + " is " + fish2.getHealthStatus());

        fish2.updateHealthStatus();
        System.out.println(fish2.getName() + " is now " + fish2.getHealthStatus());
    }
    public String toString() {
        return "Fish ( name = " + name + ") healthStatus = " + healthStatus + ")";
    }
}
