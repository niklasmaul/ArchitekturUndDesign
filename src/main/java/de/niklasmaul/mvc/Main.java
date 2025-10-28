package de.niklasmaul.mvc;

import de.niklasmaul.mvc.volumeController.VolumeController;
import de.niklasmaul.mvc.volumeModel.VolumeModel;
import de.niklasmaul.mvc.volumeView.VolumeView;


public class Main {
    static void main() {
        VolumeModel volumeModel = new VolumeModel();
        VolumeView volumeView = new VolumeView();

        new VolumeController(volumeModel, volumeView);
    }
}
