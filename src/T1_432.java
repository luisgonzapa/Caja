/*
 * Ejercicio 4.3.2
 * Luis Gonzalez Palomo
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class T1_432 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btnuevo = new Button();
        Button btabre = new Button();
        Button btguarda = new Button();
        Button btimprime = new Button();
        
        
        //Botones Creados
        btnuevo.setText("Nuevo");
        btabre.setText("Abrir");
        btguarda.setText("Guardar");
        btimprime.setText("Imprimir");
        
        //Evento BotÃ³n Nuevo
        btnuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo Proceso");
            }
        });
        
        //Evento BotÃ³n Abrir
        btabre.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir Proceso");
            }
        });
        
        btguarda.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar Proceso");
            }
        });
        
        btimprime.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprime Proceso");
            }
        });
        
        //HBox - Horizontal Box, el 10 del constructor es el Padding.
        HBox root = new HBox(10);
        root.setAlignment(Pos.CENTER);
        //AÃ±adimos botones
        root.getChildren().add(btnuevo);
        root.getChildren().add(btabre);
        root.getChildren().add(btguarda);
        root.getChildren().add(btimprime);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Ejercicio 4.3.2");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
