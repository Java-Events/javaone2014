package org.rapidpm.demo.javaone2014.afterburner.orig;

import com.airhacks.afterburner.injection.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.rapidpm.demo.javaone2014.afterburner.orig.presentation.demo.DemoView;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        DemoView appView = new DemoView();
        Scene scene = new Scene(appView.getView());
        stage.setTitle("demo.fx");
        final String uri = getClass().getResource("main.css").toExternalForm();
        scene.getStylesheets().add(uri);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
      Injector.forgetAll();
    }

    public static void main(String[] args) {
        launch(args);
    }
}