import java.util.Scanner;
import java.time.LocalDateTime;

public class FishTankApp {


//    public static void main(String[] args) {
//
//        LocalDateTime localDate = LocalDateTime.now();
//        //Sætter lastWaterChange til at være localDate i String form:
//
//        System.out.println(localDate);
//
//        FishTank tank1 = new FishTank(localDate.toString(), "default health");
//
//        Fish fish1 = new Fish("Wogglie");
//        Fish fish2 = new Fish("Swimmie");
//
//        Scanner in = new Scanner(System.in);
//
//        int menuChoice;
//        boolean flagAppOn = true;
//
//        do {
//
//            printMenuOptions();
//            menuChoice = getMenuChoice(in, 1, 5);
//
//
//            if (menuChoice == 1) {
//                System.out.println(fish1);
//                System.out.println(fish2);
//
//                // TODO
//                // 1. Viewing fish status
//                // v1
//                // print strings from fish1.getName
//                // print String from fish1.getHealth
//                // same with fish2
//
//            } else if (menuChoice == 2) {
//                System.out.println("Do you want to change status of fish 1 og fish 2?");
//                if (getMenuChoice(in, 1, 2) == 1) {
//                    fish1.updateHealthStatus();
//                } else if (getMenuChoice(in, 1, 2) == 2) {
//                    fish2.updateHealthStatus();
//                }
//
//
//
//
//                // TODO
//                // 2.  Updating  fish health
//                // v1
//                // let user choose fish 1 or fish 2
//                // call fx fish1.updatehealth()
//
//            } else if (menuChoice == 3) {
//
//                tank1.changeWater();
//
//                // TODO
//                // 3.  Changing water
//                // v1
//                // only 1 tank
//                // call tank.changewater()
//
//            } else if (menuChoice == 4) {
//
//                System.out.println(tank1);
//                // TODO
//                // 4.  Viewing last water change
//                // v1
//                // print object tank which will call toString
//
//
//            } else if (menuChoice == 5) {
//                flagAppOn = false;
//
//                // TODO
//                // 5.  Exiting
//                // v1
//                // flagAppOn = false
//            }
//
//        } while (flagAppOn);
//
//
//    }


    public static void printMenuOptions() {

        System.out.println("Hello Diana! Choose an option from the menu:");
        System.out.println();
        System.out.println("1.  View fish status");
        System.out.println("2.  Update fish health");
        System.out.println("3.  Change  water");
        System.out.println("4.  View last water change");
        System.out.println("5.  Exit\n");


    }

    public static int getMenuChoice(Scanner in, int min, int max) {

        int choice;
        boolean accepted = false;

        do {

            while (true) {
                if (in.hasNextInt()) {
                    break;
                } else {
                    String tempString = in.next();
                    System.err.println(tempString + "is not a number. Try again");
                }
            }

            choice = in.nextInt();

            if (choice < min || choice > max) {
                System.err.printf("You entered a number outside the range of: %d to %d\nTry again.\n", min, max);

            } else {
                accepted = true;
            }

        } while (!accepted);


        return choice;
    }

}







