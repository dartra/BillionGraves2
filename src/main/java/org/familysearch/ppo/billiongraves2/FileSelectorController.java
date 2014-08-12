/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.familysearch.ppo.billiongraves2;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.familysearch.ppo.javafx.ListCellController;
import org.familysearch.ppo.javafx.ListCellControllerAware;
import org.familysearch.ppo.javafx.SmartController;

/**
 * FXML Controller class
 *
 * @author DartRA
 */
public class FileSelectorController extends SmartController implements ListCellControllerAware<File> {

    @FXML
    private ListView<File> lstViewFiles;
    
    private ObservableList<File> files;

    @Override
    public void init(URL url, ResourceBundle rb) {
        getAppHelper().setListCellFactoryFxmlFor(lstViewFiles, "/fxml/FileEntryLine.fxml", this);
        files = lstViewFiles.getItems();
    }

    @FXML
    void selectFilesAction(ActionEvent event) {
         
    }

    @Override
    public void controllerWasAdded(ListCellController<File> controller) {
        FileEntryLineController c = (FileEntryLineController) controller;
        c.onRemove(new Callback<File, Void>() {
            @Override public Void call(File file) {
                files.remove(file);
                return null;
            }
        });
    }
}
