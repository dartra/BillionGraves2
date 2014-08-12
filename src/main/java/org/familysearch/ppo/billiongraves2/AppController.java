package org.familysearch.ppo.billiongraves2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.familysearch.ppo.javafx.PromptBuilder;
import org.familysearch.ppo.javafx.SmartController;

public class AppController extends SmartController {
    
    @FXML
    private FileSelectorController fileSelectorController;
    
//    @FXML
//    private void handleButtonAction(ActionEvent event) {
//        sendMessage(PromptBuilder.simple("new text", "Hello Me").ok("Special").warn());
//        System.out.println("You clicked me!");
//        label.setText("Hello World!");
//    }
    
    @Override
    public void init(URL url, ResourceBundle rb) {
        initSubController(fileSelectorController);
    }    
}
