/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu.controller.mainControllers;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import m1.piu.LayoutLoader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class FXMLAddressBookListController implements Initializable {

    public ListView addressBookList;


    public FXMLAddressBookListController() throws IOException {
        addressBookList = (ListView) LayoutLoader.loadLayout("view/mainViews/addressBookView.fxml", this);
    }

    public ListView getObject() {
        return addressBookList;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
        
    }    
    
}
