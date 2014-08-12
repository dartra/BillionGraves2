/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.familysearch.ppo.billiongraves2;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Callback;
import org.familysearch.ppo.javafx.ListCellController;

/**
 * FXML Controller class
 *
 * @author DartRA
 */
public class FileEntryLineController extends ListCellController<File> {

    @FXML
    private Label lblFileName;
    private Callback<File, Void> removeCallback;

    @Override
    public void init(URL url, ResourceBundle rb) {

    }

    @FXML
    void removeAction(ActionEvent event) {
        this.removeCallback.call(this.cellValue);
    }

    @Override
    public void valueBeingSet(File newValue, boolean empty) {
        lblFileName.setText(newValue.getName());
    }

    void onRemove(Callback<File, Void> callBack) {
        this.removeCallback = callBack;
    }
}
