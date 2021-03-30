package sample;

// ���ڿ��Ʒ������¼�

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

public class Controller {

    @FXML
    private Rectangle screen;

    double red = 0;
    double green = 0;
    double blue = 0;

    public void changeTrafficLight(ActionEvent event) {
        Random random = new Random();
        int rand = random.nextInt(3);

        switch (rand) {
            default:
                red = (double) 30 / 255;
                green = (double) 144 / 255;
                blue = (double) 255 / 255;

                Color color_de = new Color(red, green, blue, 1);
                screen.setFill(color_de);
                break;

            case 1:
                red = 0;
                green = (double) 250 / 255;
                blue = (double) 154 / 255;

                Color color_1 = new Color(red, green, blue, 1);
                screen.setFill(color_1);
                break;

            case 2:
                red = (double) 255 / 255;
                green = (double) 48 / 255;
                blue = (double) 48 / 255;

                Color color_2 = new Color(red, green, blue, 1);
                screen.setFill(color_2);
        }
    }

    public void RandomColors(ActionEvent event) {
        Random random = new Random();
        int rand = random.nextInt(3);

        switch (rand) {
            default:
                red = (double) 138 / 255;
                green = (double) 43 / 255;
                blue = (double) 226 / 255;

                Color color_de = new Color(red, green, blue, 1);
                screen.setFill(color_de);
                break;

            case 1:
                red = (double) 255 / 255;
                green = (double) 127 / 255;
                blue = 0;

                Color color_1 = new Color(red, green, blue, 1);
                screen.setFill(color_1);
                break;

            case 2:
                red = (double) 135 / 255;
                green = (double) 206 / 255;
                blue = (double) 255 / 255;

                Color color_2 = new Color(red, green, blue, 1);
                screen.setFill(color_2);
        }
    }
}
