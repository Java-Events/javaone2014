package org.rapidpm.demo.javaone2014.fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.rapidpm.demo.javaone2014.fx.main.MainPane;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    MainPane root = new MainPane();
    primaryStage.setTitle("Hello World");
    primaryStage.setScene(new Scene(root, 300, 275));
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
