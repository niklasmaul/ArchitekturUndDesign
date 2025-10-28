package de.niklasmaul.zustand.state;

public interface IAmpelZustand {
    IAmpelZustand nextSequence() throws InterruptedException;

}
