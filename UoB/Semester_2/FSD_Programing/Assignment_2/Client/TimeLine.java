import javafx.scene.control.Button;

public class TimeLine{

    private String timeline;
    private Button B4;
    private String counter;

    public TimeLine(String timeline, Button B4, String counter) {

        this.timeline = timeline;
        this.B4 = B4;
        this.counter = counter;

        B4.setStyle("-fx-background-color: #F14E4E");

    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public Button getB4() {
        return B4;
    }

    public void setB4(Button b4) {
        this.B4 = b4;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }
}
