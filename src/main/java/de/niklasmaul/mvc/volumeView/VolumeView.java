package de.niklasmaul.mvc.volumeView;

import javax.swing.*;

public class VolumeView extends JFrame{
    private JTextField textFieldLength;
    private JTextField textFieldWidth;
    private JTextField textFieldHeight;
    private JButton calculateButton;
    private JPanel VolumePanel;
    private JLabel resultM;
    private JLabel resultCM;

    public VolumeView() {
        setTitle("VolumeGUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setContentPane(VolumePanel);
        setVisible(true);
    }

    public double getTextFieldLength() {
        return Double.parseDouble(textFieldLength.getText());
    }

    public double getTextFieldWidth() {
        return Double.parseDouble(textFieldWidth.getText());
    }

    public double getTextFieldHeight() {
        return Double.parseDouble(textFieldHeight.getText());
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }

    public void setResultM(double volumeInCubicM) {
        resultM.setText(String.valueOf(volumeInCubicM));
    }

    public void setResultCM(double volumeInCubicCM) {
        resultCM.setText(String.valueOf(volumeInCubicCM));
    }

}
