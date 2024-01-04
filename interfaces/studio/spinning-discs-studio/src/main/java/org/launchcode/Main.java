package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD greatestHits = new CD("The Greatest Hits", true);
        File sound = new File("Sound", 60);
        File harmonic = new File("Harmonic", 75);
        File techno = new File("Techno", 150);
        greatestHits.writeFile(sound);
        greatestHits.writeFile(harmonic);
        greatestHits.writeFile(techno);

        CD houseProject = new CD("House Project");
        File kitchenDesign = new File("Kitchen Design", 200);
        File fireplace = new File("Fireplace", 100);
        File masterBath = new File("Master Bath", 50);
        houseProject.writeFile(kitchenDesign);
        houseProject.writeFile(fireplace);
        houseProject.writeFile(masterBath);

        DVD fridayBingeNight = new DVD("Friday Movie Night");
        File heavyweights = new File("Heavyweights", 300);
        File batman = new File("Batman", 350);
        File homeAlone = new File("Home Alone", 325);
        fridayBingeNight.writeFile(heavyweights);
        fridayBingeNight.writeFile(batman);
        fridayBingeNight.writeFile(homeAlone);

        //Print each CD and DVD object
        System.out.println(greatestHits);
        System.out.println(houseProject);
        System.out.println(fridayBingeNight);

        //use run file on CD's and DVD
        greatestHits.runFile(sound);
        houseProject.runFile(masterBath);
        fridayBingeNight.runFile(batman);

        //writing file already of CD's and DVD
        greatestHits.writeFile(sound);
        houseProject.writeFile(masterBath);
        fridayBingeNight.writeFile(heavyweights);

        //use removefile() to remove files from CD's and DVD and then try running the file
        greatestHits.removeFile(sound);
        greatestHits.runFile(sound);

        houseProject.removeFile(masterBath);
        houseProject.runFile(masterBath);

        fridayBingeNight.removeFile(heavyweights);
        fridayBingeNight.runFile(heavyweights);

        //use reformatDisc() to erase all files the try running a file
        greatestHits.reformatDisc();
        greatestHits.runFile(harmonic);

        houseProject.reformatDisc();
        houseProject.runFile(kitchenDesign);

        fridayBingeNight.reformatDisc();
        fridayBingeNight.runFile(batman);

        //create a file greater than capacity of media
        File largeMusicFile = new File("Larger Than Capacity", 900);
        greatestHits.writeFile(largeMusicFile);

        File largeVideoFile = new File("Larger Than Capacity UltraHD", 7000);
        fridayBingeNight.writeFile(largeVideoFile);
    }
}