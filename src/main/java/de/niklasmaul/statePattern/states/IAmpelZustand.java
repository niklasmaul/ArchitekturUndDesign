package de.niklasmaul.statePattern.states;

public interface IAmpelZustand {
    IAmpelZustand nextSequence() throws InterruptedException;

}
