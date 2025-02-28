import java.util.Scanner;

public class FishTankApp {




//    public static void main(String[] args) {
//
//        fishTankApp();
//
//
//    }

    public static void fishTankApp() {

        Scanner in = new Scanner(System.in);

        int menuChoice;
        boolean flagAppOn = true;

        do {

            printMenuOptions();
            menuChoice = getMenuChoice(in, 1, 4);


            if (menuChoice == 1) {
                // TODO
                // 1. Viewing fish status
                // v1
                // print strings from fish1.getName
                // print String from fish1.getHealth
                // same with fish2

            } else if (menuChoice == 2) {
                // TODO
                // 2.  Updating  fish health
                // v1
                // let user choose fish 1 or fish 2
                // call fx fish1.updatehealth()

            } else if (menuChoice == 3) {
                // TODO
                // 3.  Changing water
                // v1
                // only 1 tank
                // call tank.changewater()

            } else if (menuChoice == 4) {
                // TODO
                // 4.  Viewing last water change
                // v1
                // print object tank which will call toString


            } else if (menuChoice == 5) {
                // TODO
                // 5.  Exiting
                // v1
                // flagAppOn = false
            }

        } while (flagAppOn);








    }


    public static void printMenuOptions() {

        System.out.println("Hello Diana! Choose an option from the menu:");
        System.out.println();
        System.out.println("1.  View fish status");
        System.out.println("2.  Update fish health");
        System.out.println("3.  Change  water");
        System.out.println("4.  View last water change");
        System.out.println("5.  Exit"\n);


    }

    public static int getMenuChoice(Scanner in, int min, int max) {

        while (true) {
            if (in.hasNextInt()) {
                break;
            } else {
                String tempString = in.next();
            }




        }

        // TODO
        // use scanner to get an int and validate the input range and type
        // alternatively get input as a String
        // return the choice as an int
        return 1;
    }


}
