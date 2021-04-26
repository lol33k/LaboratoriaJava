package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static java.lang.Math.PI;

public class Controller {

    public Button btnCalculate;
    public TextField radius;
    public TextField height;
    public TextField thickness;
    public TextField result;
    public TextField price1;
    public TextField price2;


    public void onBtnAction(ActionEvent actionEvent) {
        double radiusValue = Double.parseDouble(radius.getText());
        double heightValue = Double.parseDouble(height.getText());
        double thicknessValue = Double.parseDouble(thickness.getText());

        double resultValue = (PI * Math.pow((radiusValue + thicknessValue), 2) * heightValue) - (PI * Math.pow(radiusValue, 2) * heightValue);

        result.setText(resultValue + "cm");
        price1.setText(String.format("%.2f", resultValue * 4) + "zł");
        price2.setText(String.format("%.2f", resultValue * 8) + "zł");
    }
}
