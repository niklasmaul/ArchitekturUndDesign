package de.niklasmaul.zustand;

import de.niklasmaul.zustand.state.Green;
import de.niklasmaul.zustand.state.IAmpelZustand;

public class AmpelSchaltung {

    static IAmpelZustand ampelZustand = new Green();

    static void main() throws InterruptedException {

        ampelZustand.nextSequence();

    }

}
