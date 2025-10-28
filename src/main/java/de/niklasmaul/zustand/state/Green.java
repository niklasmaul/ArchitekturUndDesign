package de.niklasmaul.zustand.state;

public class Green implements IAmpelZustand{

    private int duration = 3;

    public Green() {
        System.out.println("Die Ampel ist Grün!");
    }

    @Override
    public IAmpelZustand nextSequence() throws InterruptedException {
        while (duration > 0) {
            System.out.println("Die Ampel wird in " + duration + " Sekunden wechseln!");
            duration--;
            Thread.sleep(1000);
        }

        return new Yellow();

    }
}
