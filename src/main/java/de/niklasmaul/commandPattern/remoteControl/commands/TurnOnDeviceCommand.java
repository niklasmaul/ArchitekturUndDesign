package de.niklasmaul.commandPattern.remoteControl.commands;

import de.niklasmaul.commandPattern.remoteControl.devices.TV;

public class TurnOnDeviceCommand implements ICommand{

    private final TV tv;

    public TurnOnDeviceCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOnDevice();
    }
}
