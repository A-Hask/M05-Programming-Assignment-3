import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class ScrollBar extends Application {
 
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(20, 20, "Show Colors");

        Slider slider1 = new Slider();
        slider1.setOrientation(Orientation.Horizontal);
        slider1.setShowTickLabels(true);
        slider1.setShowTickMarks(true);
        slider1.setValue(100);
        Slider slider2 = new Slider();
        slider2.setOrientation(Orientation.Horizontal);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(true);
        slider2.setValue(100);
        Slider slider3 = new Slider();
        slider3.setOrientation(Orientation.Horizontal);
        slider3.setShowTickLabels(true);
        slider3.setShowTickMarks(true);
        slider3.setValue(100);
        Slider slider4 = new Slider();
        slider4.setOrientation(Orientation.Horizontal);
        slider4.setShowTickLabels(true);
        slider4.setShowTickMarks(true);
        slider4.setValue(100);

        Pane paneForText = new Pane();
        paneForText.getChildren().addText();

        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        
    }
}
