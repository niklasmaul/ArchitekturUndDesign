package de.niklasmaul.observerPattern.view;

import de.niklasmaul.observerPattern.IObserver;
import de.niklasmaul.observerPattern.Weatherstation;

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
