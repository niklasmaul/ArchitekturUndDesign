package de.niklasmaul;

import de.niklasmaul.volumeController.VolumeController;
import de.niklasmaul.volumeModel.VolumeModel;
import de.niklasmaul.volumeView.VolumeView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        VolumeModel volumeModel = new VolumeModel();
        VolumeView volumeView = new VolumeView();

        new VolumeController(volumeModel, volumeView);
    }
}
