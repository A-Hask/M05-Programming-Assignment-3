import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Slider extends Application {
 
 
    @Override
    public void start(Stage primaryStage) {
        Text text = new Text(50, 50, "Show Colors");
        text.setStyle("-fx-font-size: 20px;");

        // Creating sliders for RGB and opacity
        Slider redSlider = createSlider(255);
        Slider greenSlider = createSlider(255);
        Slider blueSlider = createSlider(255);
        Slider opacitySlider = createSlider(3);

        // Binding text color to slider values
        text.fillProperty().bind(Bindings.createObjectBinding(() ->
                Color.rgb((int) redSlider.getValue(), (int) greenSlider.getValue(), (int) blueSlider.getValue(), opacitySlider.getValue()),
                redSlider.valueProperty(), greenSlider.valueProperty(), blueSlider.valueProperty(), opacitySlider.valueProperty()));

        VBox vbox = new VBox(10, text, redSlider, greenSlider, blueSlider, opacitySlider);
        Scene scene = new Scene(vbox, 300, 200);

        primaryStage.setTitle("Color and Opacity Panel");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Slider createSlider(double max) {
        Slider slider = new Slider(0, max, max / 2);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(max / 4);
        slider.setBlockIncrement(max / 4);
        return slider;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
