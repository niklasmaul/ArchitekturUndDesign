package de.niklasmaul.statePattern.states;

public class Red implements IAmpelZustand{

    private int duration = 10;

    public Red() throws InterruptedException {
        System.out.println("Die Ampel ist Rot!");
        nextSequence();
    }

    @Override
    public IAmpelZustand nextSequence() throws InterruptedException {
        while (duration > 0) {
            System.out.println("Noch " + duration + " Sekunden Rot!");
            Thread.sleep(1000);
            duration--;
        }

        return new RedYellow();

    }
}
