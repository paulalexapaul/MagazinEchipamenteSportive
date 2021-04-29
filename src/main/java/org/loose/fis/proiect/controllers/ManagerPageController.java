package org.loose.fis.proiect.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.objects.ObjectRepository;
import org.loose.fis.proiect.model.Product;
import org.loose.fis.proiect.services.ProductService;
import org.loose.fis.proiect.controllers.ProductsListController;
import static org.loose.fis.proiect.services.FileSystemService.getPathToFile;

public class ManagerPageController
{
    @FXML
    private Button productslistbutton;
    @FXML
    private Button addproductsbutton;
    @FXML
    private Button deleteproductsbutton;
    @FXML
    private Button editproductsbutton;
    @FXML
    private Button seeallordersbutton;
    @FXML
    private Button clientdetailsbutton;
    @FXML
    private Button logoutbutton;





    public void handleProductsListAction() throws Exception
    {
        cancelManagerPage();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("SeeProductsList.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        ProductsListController controller = loader.getController();
        controller.set();
        Stage stage = (Stage) (productslistbutton.getScene().getWindow());
        stage.setTitle("Products List");
        stage.setScene(scene);
        stage.show();
    }


    public void handleAddProductsAction() throws Exception
    {
        ProductService.initDatabase();
        Stage AddProduct= new Stage();
        Parent addproduct = FXMLLoader.load(getClass().getClassLoader().getResource("AddProducts.fxml"));
        AddProduct.setTitle("Add product");
        AddProduct.setScene(new Scene(addproduct, 350, 400));
        AddProduct.show();
        cancelManagerPage();
    }


    public void handleDeleteProductsAction()
    {

    }


    public void handleEditProductsAction() throws Exception
    {
        cancelManagerPage();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("EditProducts.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        EditProductsController controller = loader.getController();
        controller.set();
        Stage stage = (Stage) (editproductsbutton.getScene().getWindow());
        stage.setTitle("Edit Products");
        stage.setScene(scene);
        stage.show();
    }


    public void handleSeeAllOrdersAction()
    {

    }


    public void handleClientDetailsAction()
    {

    }


    public void handleLogoutManagerAction() throws Exception
    {
        Stage LogoutManager= new Stage();
        Parent logoutmanager = FXMLLoader.load(getClass().getClassLoader().getResource("StartPage.fxml"));
        LogoutManager.setTitle("StartPage");
        LogoutManager.setScene(new Scene(logoutmanager, 350, 400));
        LogoutManager.show();
        cancelManagerPage();
    }
    public void cancelManagerPage()
    {
        productslistbutton.getScene().getWindow().hide();
    }

}
