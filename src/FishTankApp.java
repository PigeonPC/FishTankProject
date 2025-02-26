public class FishTankApp {

    int menuChoice;


    public static void main(String[] args) {

        fishTankApp();


    }

    public static void fishTankApp() {

        do {

            printMenuOptions();
            menuChoice = getMenuChoice();

            if (menuChoice == 1) {
                // TODO
                // call viewing fish status
            } else if (menuChoice == 2) {
                // TODO
                // call updating fish health
            } else if (menuChoice == 3) {
                // TODO
                // call Changing  water
            } else if (menuChoice == 4) {
                // TODO
                // call Viewing last water change
            } else if (menuChoice == 5) {
                // TODO
                // Exit the this whole app
                // fx med et break
            }

        } while (flagAppOn);








    }


    public static void printMenuOptions() {

        // TODO
        // Print menu options
//        1.  Viewing fish status
//        2.  Updating  fish health
//        3.  Changing  water
//        4.  Viewing last water change
//        5.  Exiting
        //System.out.println("fill out menu options here and ask for input");

    }

    public static int getMenuChoice() {

        // TODO
        // use scanner to get an int and validate the input range and type
        // alternatively get input as a String
        // return the choice as an int

    }


}
