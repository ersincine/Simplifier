import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GUIDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = SimplifiedGUI.newButton("Click!", Color.DARKGOLDENROD, (a)->{
            int showConfirmationDialog = SimplifiedGUI.showConfirmationDialog("Title", "Header text", "Content text", "Cancel button text", "button text1", "button text2");
        });
        
        
        Label label = SimplifiedGUI.newLabel("Label comes here");
        
        TextArea textArea = SimplifiedGUI.newTextArea("Default text", 200, 400, true);
        
        Node[] nodes = {button, label, textArea};
        
        VBox root = SimplifiedGUI.newVBox(10, 10, Color.BEIGE, nodes);
        
        stage.setTitle("Title");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
    
}
