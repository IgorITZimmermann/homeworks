package de.ait.inheritance;

public class MainMusic {
    public static void main(String[] args) {
        PopTrack popTrack = new PopTrack("Pop-Dance-hits", "DJ Khaled", 10);
        popTrack.play();
        popTrack.printInfo();
        System.out.println("---------------------------");
        RockTrack rockTrack = new RockTrack("Rock-Dance-hits", "DJ Gutar", 100);
        rockTrack.play();
        rockTrack.printInfo();



    }
}
