package de.niklasmaul.observer.view;

import de.niklasmaul.observer.IObserver;
import de.niklasmaul.observer.Weatherstation;

public class TemperatureView implements IObserver {

    private Weatherstation weatherstation;
    private int temperature;

    public TemperatureView(Weatherstation weatherstation) {
        this.weatherstation = weatherstation;
        temperature = 0;
    }

    @Override
    public void update() {
        boolean changed = false;
        if (temperature != weatherstation.getTemperature()) {
            temperature = weatherstation.getTemperature();
            changed = true;
        }
        if (changed) {
            System.out.println("Es ist " + temperature + " Grad Celsius.");
        }

    }
}
