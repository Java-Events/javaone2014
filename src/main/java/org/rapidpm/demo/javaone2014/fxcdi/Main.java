package org.rapidpm.demo.javaone2014.fxcdi;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.rapidpm.commons.cdi.fx.CDIJavaFXBaseApplication;
import org.rapidpm.commons.cdi.fx.CDIStartupScene;
import org.rapidpm.demo.javaone2014.fxcdi.main.MainPane;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class Main extends CDIJavaFXBaseApplication {


  @Override
  public void startImpl(Stage primaryStage) throws Exception {
    primaryStage.setTitle("Hello World");
  }

  public static void main(String[] args) {
    launch(args);
  }

  public void startCDI(@Observes @CDIStartupScene Stage stageCDI){
    stageCDI.setScene(new Scene(new MainPane(), 300, 275));
    stageCDI.show();
  }
}
