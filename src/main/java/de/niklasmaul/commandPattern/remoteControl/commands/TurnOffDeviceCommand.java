package de.niklasmaul.commandPattern.remoteControl.commands;

import de.niklasmaul.commandPattern.remoteControl.devices.TV;

public class TurnOffDeviceCommand implements ICommand{

    private final TV tv;

    public TurnOffDeviceCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOffDevice();
    }
}
