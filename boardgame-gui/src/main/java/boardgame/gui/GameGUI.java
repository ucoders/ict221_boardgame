package boardgame.gui;

import boardgame.engine.GameEngine;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * GUI for the 2D Board Game.
 *
 * NOTE: Do NOT run this class directly in IntelliJ - run 'RunGame' instead.
 */
public class GameGUI extends Application {
    // TODO: move this to Controller class if you use FXML...
    private GameEngine engine = new GameEngine(10);


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button root = new Button("Amazing Board Game coming soon...");
        root.setFont(new Font(24));

        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.setTitle("Board Game");
        primaryStage.show();
    }

    /** In IntelliJ, do NOT run this method.  Run 'RunGame.main()' instead. */
    public static void main(String[] args) {
        launch(args);
    }
}
