package de.niklasmaul.zustand.state;

public class RedYellow implements IAmpelZustand{

    private int duration = 3;

    public RedYellow() throws InterruptedException {
        System.out.println("Die Ampel ist Gelb-Rot!");
        nextSequence();
    }

    @Override
    public IAmpelZustand nextSequence() throws InterruptedException {
        while (duration > 0) {

            System.out.println("Noch " + duration + " Sekunden Gelb/Rot!");
            Thread.sleep(1000);
            duration--;
        }

        return new Green();
    }
}
