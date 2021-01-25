package sample.view;

import javafx.scene.Scene;
import javafx.scene.layout.TilePane;
import sample.App;

public abstract class AbstractScene extends Scene {

    public AbstractScene(App app) {
        super(new TilePane(), 640, 480);
    }
}
