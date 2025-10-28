package de.niklasmaul.statePattern;

import de.niklasmaul.statePattern.states.Green;
import de.niklasmaul.statePattern.states.IAmpelZustand;

public class AmpelSchaltung {

    static IAmpelZustand ampelZustand = new Green();

    static void main() throws InterruptedException {

        ampelZustand.nextSequence();

    }

}
