package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        Button button1 = new Button(" 1 ");//creo lo botones
        Button button2 = new Button(" 2 ");
        Button button3 = new Button(" 3 ");

        button1.setOnAction(event -> System.out.println("Charmander"));
        button2.setOnAction(event -> System.out.println("Bulbasur"));
        button3.setOnAction(event -> System.out.println("Squirtel"));
        //a cada boton le doy accion de print de un mensaje diferente

        VBox vbox = new VBox(10, button1, button2, button3);//les ordeno verticalmente

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Eje 18 - Botones distintas acciones");
        primaryStage.setScene(scene);
        primaryStage.show();//creo la escena, la titulo, le asigno la ventana y doy visibilidad
    }

    public static void main(String[] args) {
        launch(args); //metodo de aplication para arrancar el programa
    }
}