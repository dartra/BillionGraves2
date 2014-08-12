package org.familysearch.ppo.billiongraves2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.familysearch.ppo.javafx.AppHelper;
import org.familysearch.ppo.javafx.SmartController;


public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception
    {
        AppHelper helper = new AppHelper(stage);
        helper.addStyleSheet("/css/app.css");

        /*uncomment this line to see a change of style */
        //helper.setModalWindowStyle(StageStyle.UTILITY);

        SmartController controller = helper.loadAppController("/fxml/App.fxml");
        Scene scene = new Scene(controller.getRoot());
        stage.setTitle("JavaFX Tools Demo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
