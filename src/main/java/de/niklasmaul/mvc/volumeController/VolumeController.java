package de.niklasmaul.mvc.volumeController;

import de.niklasmaul.mvc.volumeModel.VolumeModel;
import de.niklasmaul.mvc.volumeView.VolumeView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeController {

    public VolumeController(VolumeModel model, VolumeView view) {

        view.getCalculateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = view.getTextFieldLength();
                    double width = view.getTextFieldWidth();
                    double height = view.getTextFieldHeight();

                    model.CalculateCubicCM(length, width, height);

                    view.setResultCM(model.getVolumeInCubicCM());
                    view.setResultM(model.getVolumeInCubicM());

                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Bitte gebe in jedem Feld ein gültigen Wert ein!\n" + ex.getMessage(), "Fehlermeldung", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

    }
}