package de.niklasmaul.mvc.volumeModel;

public class VolumeModel {

    private double volumeInCubicCM;

    public void CalculateCubicCM(double length, double width, double height) {
        volumeInCubicCM = length*width*height;
    }

    public double getVolumeInCubicCM() {
        return volumeInCubicCM;
    }

    public double getVolumeInCubicM() {
        return volumeInCubicCM /1000000;
    }
}
