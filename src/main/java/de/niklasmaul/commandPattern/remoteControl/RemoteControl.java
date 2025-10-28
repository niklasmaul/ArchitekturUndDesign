package de.niklasmaul.commandPattern.remoteControl;

import de.niklasmaul.commandPattern.remoteControl.commands.ICommand;
import de.niklasmaul.commandPattern.remoteControl.commands.TurnOffDeviceCommand;
import de.niklasmaul.commandPattern.remoteControl.commands.TurnOnDeviceCommand;
import de.niklasmaul.commandPattern.remoteControl.devices.TV;

public class RemoteControl {

    private void press(ICommand command) {
        command.execute();
    }

    static void main() {
        TV tv = new TV();
        ICommand buttonOn = new TurnOnDeviceCommand(tv);
        ICommand buttonOff = new TurnOffDeviceCommand(tv);

        RemoteControl remote = new RemoteControl();

        remote.press(buttonOn);
        remote.press(buttonOff);


    }

}
