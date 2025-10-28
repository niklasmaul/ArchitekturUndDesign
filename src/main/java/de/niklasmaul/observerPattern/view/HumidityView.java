package de.niklasmaul.observerPattern.view;

import de.niklasmaul.observerPattern.IObserver;
import de.niklasmaul.observerPattern.Weatherstation;

public class HumidityView implements IObserver {

    private Weatherstation weatherstation;
    private int humidity;

    public HumidityView(Weatherstation weatherstation) {
        this.weatherstation = weatherstation;
        humidity = 0;
    }

    @Override
    public void update() {
        boolean changed = false;
        if (humidity != weatherstation.getHumidity()) {
            humidity = weatherstation.getHumidity();
            changed = true;
        }
        if (changed) {
            System.out.println("Die Luftfeuchtigkeit beträgt " + weatherstation.getHumidity() + "%.");
        }

    }
}
