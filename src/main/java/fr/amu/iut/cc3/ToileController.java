package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private TextField comp1;
    @FXML
    private TextField comp2;
    @FXML
    private TextField comp3;
    @FXML
    private TextField comp4;
    @FXML
    private TextField comp5;
    @FXML
    private TextField comp6;

    @FXML
    private Pane toile;

    Circle point1 = new Circle();
    Circle point2 = new Circle();
    Circle point3 = new Circle();
    Circle point4 = new Circle();
    Circle point5 = new Circle();
    Circle point6 = new Circle();
    @FXML
    public void onClickcomp1() {
        double value = 0;
        int axe = 0;
        if (comp1.getLength() != 0) {
            value = Double.parseDouble(comp1.getText());
            axe = 1;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point1.setCenterX(x);
            point1.setCenterY(y);
            point1.setRadius(10);
            toile.getChildren().add(point1);
        }
    }
    @FXML
    public void onClickcomp2() {
        double value = 0;
        int axe = 0;
        if (comp2.getLength() != 0) {
            value = Double.parseDouble(comp2.getText());
            axe = 2;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point2.setCenterX(x);
            point2.setCenterY(y);
            point2.setRadius(10);
            toile.getChildren().add(point2);
        }
    }
    @FXML
    public void onClickcomp3() {
        double value = 0;
        int axe = 0;
        if (comp3.getLength() != 0) {
            value = Double.parseDouble(comp3.getText());
            axe = 3;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point3.setCenterX(x);
            point3.setCenterY(y);
            point3.setRadius(10);
            toile.getChildren().add(point3);
        }
    }
    @FXML
    public void onClickcomp4() {
        double value = 0;
        int axe = 0;
        if (comp4.getLength() != 0) {
            value = Double.parseDouble(comp4.getText());
            axe = 4;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point4.setCenterX(x);
            point4.setCenterY(y);
            point4.setRadius(10);
            toile.getChildren().add(point4);
        }
    }
    @FXML
    public void onClickcomp5() {
        double value = 0;
        int axe = 0;
        if (comp5.getLength() != 0) {
            value = Double.parseDouble(comp5.getText());
            axe = 5;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point5.setCenterX(x);
            point5.setCenterY(y);
            point5.setRadius(10);
            toile.getChildren().add(point5);
        }
    }
    @FXML
    public void onClickcomp6() {
        double value = 0;
        int axe = 0;
        if (comp6.getLength() != 0) {
            value = Double.parseDouble(comp6.getText());
            axe = 6;
            int x = getXRadarChart(value,axe);
            int y = getYRadarChart(value,axe);
            point6.setCenterX(x);
            point6.setCenterY(y);
            point6.setRadius(10);
            toile.getChildren().add(point6);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

}
