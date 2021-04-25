package application;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class MyNumber {

    private DoubleProperty number;

    public final DoubleProperty numberProperty() {
        if (number == null) {
            number = new SimpleDoubleProperty(0);
        }
        return number;
    }

    public double getNumber() {
        if (number != null) {
            return number.get();
        } else {
            return 0;
        }
    }

    public void setNumber(double number) {
        this.numberProperty().set(number);
    }
}
