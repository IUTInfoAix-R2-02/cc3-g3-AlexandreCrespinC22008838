package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import java.net.URL;
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
    @FXML
    private Label labelerreur;
    @FXML
    private Button viderBtn;

    private Circle point1 = new Circle();
    private Circle point2 = new Circle();
    private Circle point3 = new Circle();
    private Circle point4 = new Circle();
    private Circle point5 = new Circle();
    private Circle point6 = new Circle();

    @FXML
    public void onClickcomp1() {
        double value = 0;
        int axe = 0;
        if (comp1.getLength() != 0) {
            value = Double.parseDouble(comp1.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 1;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point1.setCenterX(x);
            point1.setCenterY(y);
            point1.setRadius(5);
            toile.getChildren().addAll(point1);
        }
    }
    @FXML
    public void onClickcomp2() {
        double value = 0;
        int axe = 0;
        if (comp2.getLength() != 0) {
            value = Double.parseDouble(comp2.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 2;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point2.setCenterX(x);
            point2.setCenterY(y);
            point2.setRadius(5);
            toile.getChildren().addAll(point2);
        }
    }
    @FXML
    public void onClickcomp3() {
        double value = 0;
        int axe = 0;
        if (comp3.getLength() != 0) {
            value = Double.parseDouble(comp3.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 3;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point3.setCenterX(x);
            point3.setCenterY(y);
            point3.setRadius(5);
            toile.getChildren().addAll(point3);
        }
    }
    @FXML
    public void onClickcomp4() {
        double value = 0;
        int axe = 0;
        if (comp4.getLength() != 0) {
            value = Double.parseDouble(comp4.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 4;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point4.setCenterX(x);
            point4.setCenterY(y);
            point4.setRadius(5);
            toile.getChildren().addAll(point4);
        }
    }
    @FXML
    public void onClickcomp5() {
        double value = 0;
        int axe = 0;
        if (comp5.getLength() != 0) {
            value = Double.parseDouble(comp5.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 5;
            int x = getXRadarChart(value, axe);
            int y = getYRadarChart(value, axe);
            point5.setCenterX(x);
            point5.setCenterY(y);
            point5.setRadius(5);
            toile.getChildren().addAll(point5);
        }
    }
    @FXML
    public void onClickcomp6() {
        double value = 0;
        int axe = 0;
        if (comp6.getLength() != 0) {
            value = Double.parseDouble(comp6.getText());
            labelerreur.setText("");
            if (isSup20Inf0(value)){
                return;
            }
            axe = 6;
            int x = getXRadarChart(value,axe);
            int y = getYRadarChart(value,axe);
            point6.setCenterX(x);
            point6.setCenterY(y);
            point6.setRadius(5);
            toile.getChildren().addAll(point6);
        }
    }

    private Boolean isSup20Inf0(double value){
        if (value > 20 || value < 0){
            labelerreur.setText("Erreur de saisie : \nLes valeurs doivent être entre 0 et 20");
            return true;
        }
        return false;
    }

    public void onClickVider(){
        labelerreur.setText("");
        point1.setRadius(0);
        point2.setRadius(0);
        point3.setRadius(0);
        point4.setRadius(0);
        point5.setRadius(0);
        point6.setRadius(0);
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
