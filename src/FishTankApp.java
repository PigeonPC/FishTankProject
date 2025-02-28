public class FishTankApp {




    public static void main(String[] args) {

        fishTankApp();


    }

    public static void fishTankApp() {

        int menuChoice;
        boolean flagAppOn = true;

        do {

            printMenuOptions();
            menuChoice = getMenuChoice(1, 4);


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

        // TODO
        // Print menu options
//        1.  Viewing fish status
//        2.  Updating  fish health
//        3.  Changing  water
//        4.  Viewing last water change
//        5.  Exiting
        //System.out.println("fill out menu options here and ask for input");

    }

    public static int getMenuChoice(int min, int max) {

        // TODO
        // use scanner to get an int and validate the input range and type
        // alternatively get input as a String
        // return the choice as an int
        return 1;
    }


}
