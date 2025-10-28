package de.niklasmaul.zustand.state;

public class Yellow implements IAmpelZustand {

    private int duration = 3;

    public Yellow() throws InterruptedException {
        System.out.println("Die Ampel ist Gelb!");
        nextSequence();
    }

    @Override
    public IAmpelZustand nextSequence() throws InterruptedException {
        while (duration > 0) {

            System.out.println("Noch " + duration + " Sekunden Gelb!");
            Thread.sleep(1000);
            duration--;
        }

        return new Red();

    }
}
